package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frutas")
public class FrutaController {

    private List<Fruta> frutas = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Fruta>> getFrutas() {
        if (frutas.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.status(200).body(frutas);
        }
    }

    @PostMapping("/favorita")
    public ResponseEntity<Fruta> favorita() {
        Fruta favorita = new Fruta("Uva", 9.99);
        frutas.add(favorita);
        return ResponseEntity.status(201).body(favorita);
    }

    @PostMapping
    public ResponseEntity getPosicao(@RequestBody Fruta novaFruta) {
        if (novaFruta.getNome() == null || novaFruta.getNome().isBlank()) {
            return ResponseEntity.status(400).body("Nome deve ter 1+ letras");
        }

        if (novaFruta.getPreco() != null && novaFruta.getPreco() < 0.0) {
            return ResponseEntity.status(400).body("Preço deve ter um valor");
        }

        frutas.add(novaFruta);
        return ResponseEntity.status(201).body(novaFruta);
    }


}
