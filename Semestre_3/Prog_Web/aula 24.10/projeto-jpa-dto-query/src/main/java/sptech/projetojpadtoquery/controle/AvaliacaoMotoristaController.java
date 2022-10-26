package sptech.projetojpadtoquery.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpadtoquery.dominio.AvaliacaoMotorista;
import sptech.projetojpadtoquery.repositorio.AvaliacaoMotoristaRepository;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;
import sptech.projetojpadtoquery.repositorio.PassageiroRepository;
import sptech.projetojpadtoquery.requisicao.NovaAvaliacaoRequest;
import sptech.projetojpadtoquery.resposta.MotoristaSimplesResponse;
import sptech.projetojpadtoquery.resposta.ResumoAvaliacoesMotoristaResponse;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes/motoristas")
public class AvaliacaoMotoristaController {

    @Autowired
    private AvaliacaoMotoristaRepository avaliacaoMotoristaRepository;

    @Autowired
    private PassageiroRepository passageiroRepository;

    @Autowired
    private MotoristaRepository motoristaRepository;

    @GetMapping("/{idMotorista}")
    public ResponseEntity<List<ResumoAvaliacoesMotoristaResponse>> getMotoristaPorId(@PathVariable int idMotorista) {
        return ResponseEntity.of(avaliacaoMotoristaRepository.getAvaliacaoPorIdMotorista(idMotorista));
    }

    @GetMapping("/nota-media/{idMotorista}")
    public ResponseEntity<Double> getMediaAvaliacoes(@PathVariable int idMotorista) {
        return ResponseEntity.of(avaliacaoMotoristaRepository.getMediaAvaliacoes(idMotorista));
    }

    @GetMapping("/resumo/{idMotorista}")
    public ResponseEntity<ResumoAvaliacoesMotoristaResponse> getResumoAvaliacoes(@PathVariable int idMotorista) {
        return ResponseEntity.of(avaliacaoMotoristaRepository.getResumoAvaliacoesMotorista(idMotorista));
    }

    @PostMapping
    public ResponseEntity<AvaliacaoMotorista> post(@RequestBody @Valid NovaAvaliacaoRequest novaAvaliacaoRequest) {

        if (!passageiroRepository.existsById(novaAvaliacaoRequest.getIdPassageiro())) {
            return ResponseEntity.status(404).build();
        }
        if (!motoristaRepository.existsById(novaAvaliacaoRequest.getIdMotorista())) {
            return ResponseEntity.status(404).build();
        }

        AvaliacaoMotorista novaAvaliacao = new AvaliacaoMotorista();

        novaAvaliacao.setPassageiro(
                passageiroRepository.findById(novaAvaliacaoRequest.getIdPassageiro()).get());
        novaAvaliacao.setMotorista(
                motoristaRepository.findById(novaAvaliacaoRequest.getIdMotorista()).get());

        novaAvaliacao.setNota(novaAvaliacaoRequest.getNota());

        avaliacaoMotoristaRepository.save(novaAvaliacao);

        return ResponseEntity.status(201).body(novaAvaliacao);
    }
}
