package sptech.projetojpadtoquery.controle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import sptech.projetojpadtoquery.dominio.Motorista;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;
import sptech.projetojpadtoquery.repositorio.PassageiroRepository;
import sptech.projetojpadtoquery.resposta.PassageiroSimplesResponse;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class PassageiroControllerTest {

    @Autowired
    private PassageiroController controller;

    @MockBean
    private PassageiroRepository repository;

    @Test
    @DisplayName("Não retorna lista de passageiros e o status 204")
    void retornaComFalha() {
        when(repository.findAll()).thenReturn(new ArrayList<>());

        ResponseEntity<List<PassageiroSimplesResponse>> listaPassageiros = controller.getSimples();

        assertEquals(204, listaPassageiros.getStatusCodeValue());
        assertNull(listaPassageiros.getBody());

    }

    @Test
    @DisplayName("Retorna uma lista de motoristas e o status 200")
    void retornaComSucesso() {
        when(repository.getPassageirosSimples()).thenReturn(List.of(new PassageiroSimplesResponse(1, "nome")));

        ResponseEntity<List<PassageiroSimplesResponse>> listaPassageiros = controller.getSimples();

        assertEquals(200, listaPassageiros.getStatusCodeValue());
        assertTrue(listaPassageiros.getBody().size() > 0);

    }

}