package sptech.projetojpadtoquery.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.projetojpadtoquery.dominio.Motorista;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;
import sptech.projetojpadtoquery.resposta.MotoristaSimplesResponse;

import java.util.List;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {

    @Autowired
    private MotoristaRepository repository;

    @GetMapping
    public ResponseEntity<List<Motorista>> get() {
        List<Motorista> motoristas = repository.findAll();
        return motoristas.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(motoristas);
    }

    @GetMapping("/simples")
    public ResponseEntity<List<MotoristaSimplesResponse>> getSimples() {
        List<MotoristaSimplesResponse> motoristas = repository.getMotoristasSimples();

        return motoristas.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(motoristas);
    }
}
