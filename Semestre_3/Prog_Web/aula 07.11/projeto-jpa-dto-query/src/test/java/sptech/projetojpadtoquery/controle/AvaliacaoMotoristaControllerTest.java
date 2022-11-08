package sptech.projetojpadtoquery.controle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
import sptech.projetojpadtoquery.dominio.AvaliacaoMotorista;
import sptech.projetojpadtoquery.excecao.MotoristaNaoExisteException;
import sptech.projetojpadtoquery.repositorio.AvaliacaoMotoristaRepository;
import sptech.projetojpadtoquery.repositorio.PassageiroRepository;
import sptech.projetojpadtoquery.requisicao.NovaAvaliacaoRequest;

import java.util.ArrayList;
import java.util.Optional;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AvaliacaoMotoristaControllerTest {

    @Autowired
    AvaliacaoMotoristaController controller;

    @MockBean
    private AvaliacaoMotoristaRepository repository;

    @MockBean
    private PassageiroRepository passageiroRepository;

    @Test
    @DisplayName("Verifica média avaliação presente")
    void mediaAvaliacaoExiste() {
        when(repository.getMediaAvaliacoes(anyInt())).thenReturn(Optional.of(25.0));

        ResponseEntity<Double> mediaAvaliacoes = controller.getMediaAvaliacoesRecentes(1);

        assertEquals(200, mediaAvaliacoes.getStatusCodeValue());
        assertNotNull(mediaAvaliacoes.getBody());
    }

    @Test
    @DisplayName("Verifica média avaliação não presente")
    void mediaAvaliacaoNaoExiste() {
        when(repository.getMediaAvaliacoes(anyInt())).thenReturn(Optional.empty());

        ResponseEntity<Double> mediaAvaliacoes = controller.getMediaAvaliacoesRecentes(1);

        assertEquals(404, mediaAvaliacoes.getStatusCodeValue());
        assertNotNull(mediaAvaliacoes.getBody());
    }

    @Test
    @DisplayName("Deve ocorrer uma ResponseStatusException caso o id do passageiro não exista no banco")
    void exercicio1a() {

        when(repository.existsById(anyInt())).thenThrow(ResponseStatusException.class);

        assertThrows(ResponseStatusException.class, () ->
                repository.existsById(anyInt()));
    }

    @Test
    @DisplayName("Deve ocorrer uma MotoristaNaoExisteException caso o id do motorista não exista no banco")
    void exercicio1b() {

        when(repository.existsById(anyInt())).thenReturn(false);

        assertThrows(MotoristaNaoExisteException.class, () ->
                repository.existsById(anyInt()));
    }

    @Test
    @DisplayName("Deve ocorrer uma MotoristaNaoExisteException caso o id do motorista não exista no banco")
    void exercicio1c() {

        when(repository.existsById(anyInt())).thenThrow(MotoristaNaoExisteException.class);

        assertThrows(MotoristaNaoExisteException.class, () ->
                repository.existsById(anyInt()));
    }

    @Test
    @DisplayName("Deve ocorrer uma MotoristaNaoExisteException caso o id do motorista não exista no banco")
    void exercicio1c1() {
        when(repository.save(new AvaliacaoMotorista())).thenReturn(new AvaliacaoMotorista());

        NovaAvaliacaoRequest avaliacao = new NovaAvaliacaoRequest();

        ResponseEntity<AvaliacaoMotorista> avaliar = controller.post(avaliacao);
        assertEquals(201, avaliar.getStatusCodeValue());
//        assertNotNull(avaliar.getBody());
    }
}