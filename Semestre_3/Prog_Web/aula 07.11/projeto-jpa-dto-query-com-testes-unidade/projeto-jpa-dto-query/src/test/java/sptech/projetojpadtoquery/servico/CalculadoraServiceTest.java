package sptech.projetojpadtoquery.servico;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

/*
Esta é uma classe de testes JUnit.
O nome deve terminar com Test
Não é uma convenção, é configuração do JUnit
 */
class CalculadoraServiceTest {

    CalculadoraService service = new CalculadoraService();

    /*
@Test -> indica que o método é um cenário de teste
que pode conter 1 ou mais verificações
Os métodos de teste podem ser void ou com qualquer retorno
mas o mais é comum é serem void mesmo
     */
    @Test
    @DisplayName("calcularPrecoCorrida() deve calcular corretamente")
    void calcularPrecoCorrida_deveCalcularCorretamente() {

        // executando o que queremos testar
        double resultado = service.calcularPrecoCorrida(2.0);
        double resultado2 = service.calcularPrecoCorrida(3.0);

        // Asserções (ou Verificações)
        // assertEquals() -> verifica se o 2o argumento é igual ao 1o
        // o 1o é o valor esperado e o 2o é o valor do teste
        assertEquals(24.0, resultado);
        assertEquals(36.0, resultado2);
    }

    @Test
    @DisplayName(
            "calcularPrecoCorrida() deve lançar exceção p/ km errada")
    void calcularPrecoCorrida_kmInvalida() {

        // assertThrows() testa se uma certa Exceção ocorre
        // aqui verificamos se ocorreu ResponseStatusException
        assertThrows(ResponseStatusException.class, () ->
                            service.calcularPrecoCorrida(-3.5));

        assertThrows(ResponseStatusException.class, () ->
                service.calcularPrecoCorrida(-0.2));

        assertThrows(ResponseStatusException.class, () ->
                service.calcularPrecoCorrida(null));
    }

    @Test
    @DisplayName(
            "calcularPrecoCorrida() deve lançar exceção p/ km errada")
    void calcularPrecoCorrida_kmInvalida_detalhes() {

        // Usando assertThrows() para fazer a verificação
        // E obter a exceção que ocorreu
        ResponseStatusException excecao =
                assertThrows(ResponseStatusException.class, () ->
                service.calcularPrecoCorrida(-3.5));

        // fazendo verificações nas propriedades da exceção
        assertEquals("Distância deve ser >= 0", excecao.getReason());
        assertEquals(400, excecao.getRawStatusCode());

        // teste para distancia null
        ResponseStatusException excecao2 =
                assertThrows(ResponseStatusException.class, () ->
                        service.calcularPrecoCorrida(null));

        assertEquals("Distância não pode ser nula", excecao2.getReason());
        assertEquals(400, excecao2.getRawStatusCode());
    }

    @Test
    @DisplayName("CalculadoraService está anotada com @Service")
    void testarAnotacaoService() {
        // obtemos a metaprogramação completa da classe de 'service'
        Class classe = service.getClass();
/*
isAnnotationPresent() -> retorna true caso a anotação esteja presente na classe

assertTrue() -> verifica se seu argumento é true
 */
//        assertTrue(classe.isAnnotationPresent(Service.class));
                                            // org.spring...
        assertTrue(
                classe.isAnnotationPresent(Service.class),
                "A anotação @Service não foi encontrada");

    }
}