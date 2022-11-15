package sptech.projetojpadtoquery.controle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import sptech.projetojpadtoquery.dominio.Motorista;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;
import sptech.projetojpadtoquery.resposta.MotoristaSimplesResponse;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class MotoristaControllerTest {

    @Autowired
    private MotoristaController controller;

    @MockBean
    private MotoristaRepository repository;

    @Test
    @DisplayName("Não retorna lista de motoristas e o status 204")
    void retornaComFalha() {
        when(repository.findAll()).thenReturn(new ArrayList<>());

        ResponseEntity<List<Motorista>> listaMotoristas = controller.get();

        assertEquals(204, listaMotoristas.getStatusCodeValue());
        assertNull(listaMotoristas.getBody());

    }

    @Test
    @DisplayName("Retorna uma lista de motoristas e o status 200")
    void retornaComSucesso() {
        when(repository.findAll()).thenReturn(List.of(new Motorista()));

        ResponseEntity<List<Motorista>> listaMotoristas = controller.get();

        assertEquals(200, listaMotoristas.getStatusCodeValue());
        assertTrue(listaMotoristas.getBody().size() > 0);

    }

    @Test
    @DisplayName("Não retorna lista de motoristas simples e o status 204")
    void retornaMotoristaSimplesComFalha() {
        when(repository.getMotoristasSimples()).thenReturn(new ArrayList<>());

        ResponseEntity<List<MotoristaSimplesResponse>> listaMotoristas = controller.getSimples();

        assertEquals(204, listaMotoristas.getStatusCodeValue());
        assertNull(listaMotoristas.getBody());

    }

    @Test
    @DisplayName("Retorna uma lista de motoristas e o status 200")
    void retornaMotoristaSimplesComSucesso() {
        when(repository.getMotoristasSimples()).thenReturn(List.of(new MotoristaSimplesResponse(1, "nome")));

        ResponseEntity<List<MotoristaSimplesResponse>> listaMotoristas = controller.getSimples();

        assertEquals(200, listaMotoristas.getStatusCodeValue());
        assertTrue(listaMotoristas.getBody().size() > 0);

    }

}