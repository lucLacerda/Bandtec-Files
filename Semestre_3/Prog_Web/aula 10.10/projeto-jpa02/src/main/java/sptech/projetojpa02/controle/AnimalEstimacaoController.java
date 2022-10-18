package sptech.projetojpa02.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa02.dominio.AnimalEstimacao;
import sptech.projetojpa02.repositorio.AnimalEstimacaoRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class AnimalEstimacaoController {

    @Autowired
    private AnimalEstimacaoRepository repository;

    @PostMapping
    public ResponseEntity postPet(
            @RequestBody @Valid AnimalEstimacao novoPet) {
        repository.save(novoPet);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getPets(@RequestParam (required = true) String cpfDono, @RequestParam (required = false) String email) {
        if (cpfDono == null) {
            return ResponseEntity.status(200).body(repository.findAll());

        } else {
            List<AnimalEstimacao> pets = repository.findByCpfDonoAndEmailDonoOrderByNome(cpfDono, email);
            return ResponseEntity.status(200).body(pets);
        }
    }

}
