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

    /*
@RequestParam -> Indica um parâmetro de requisição
São valores após a URI cujo primeiro é iniciado por "?"
e os demais por "&"
ex de 1 parâmetro: /pets?cpf=11122233301
ex de 2 parâmetros: /pets?cpf=11122233301&email=hhhh@www.com
ex de 3 parâmetros: /pets?cpf=11122233301&email=hhhh@www.com&castrado=false

IMPORTANTE: a ordem deles na URL não importa! Não precisa ser a mesma do código!
     */
    @GetMapping // localhost:8080/pets?cpf=11122233301
    public ResponseEntity getPets(
                    @RequestParam(required = false) String cpf,
                    @RequestParam(required = false) String email) {

        List<AnimalEstimacao> pets =
                repository.findByCpfDonoAndEmailDono(cpf, email);

        if (pets.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(pets);
    }

    @GetMapping("/contagem-nao-castrados")
    public ResponseEntity<Integer> getPetsNaoCastrado() {
        Integer naoCastrados = repository.countByCastradoFalse();
        return ResponseEntity.status(200).body(naoCastrados);
    }

    @DeleteMapping("/nao-castrados")
    public ResponseEntity<Integer> deletePetsNaoCastrado() {
        Integer excluidos = repository.deleteByCastradoFalse();
        return ResponseEntity.status(200).body(excluidos);
    }

}
