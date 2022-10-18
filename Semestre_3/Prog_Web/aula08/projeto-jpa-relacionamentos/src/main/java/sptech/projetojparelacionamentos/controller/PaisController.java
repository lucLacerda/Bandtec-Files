package sptech.projetojparelacionamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojparelacionamentos.domain.Pais;
import sptech.projetojparelacionamentos.repository.PaisRepository;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping
    public ResponseEntity<List<Pais>> get() {
        return ResponseEntity.status(200).body(paisRepository.findAll());
    }

    @GetMapping("/id/{idContinent}")
    public ResponseEntity<List<Pais>> getByContinenteId(@PathVariable int idContinent) {
        return ResponseEntity.status(200).body(paisRepository.findByContinenteIdContinente(idContinent));
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Pais>> getByContinenteNome(@PathVariable String nome) {
        return ResponseEntity.status(200).body(paisRepository.findByContinenteNomeContains(nome));
    }

    @PostMapping
    public ResponseEntity<Pais> post(@RequestBody Pais novoPais) {
        paisRepository.save(novoPais);
        return ResponseEntity.status(201).body(novoPais);
    }
}
