package com.example.projeto_demo.controller;

import com.example.projeto_demo.domain.CarroEntity;
import com.example.projeto_demo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroRepository repository;

    @PostMapping
    public ResponseEntity<CarroEntity> post(
            @RequestBody CarroEntity novoCarro) {
        repository.save(novoCarro);
        // faz um insert ou update, dependendo de a chave primária existe ou não no banco

        return ResponseEntity.status(201).body(novoCarro);
    }

    @GetMapping
    public ResponseEntity<List<CarroEntity>> getCarros(
            @RequestParam(required = false) String nomeFabricante) {

        List<CarroEntity> lista;

        if (nomeFabricante != null) {
            lista = repository.findByFabricanteNomeContains(nomeFabricante);
        } else {
            lista = repository.findAll();
        }

        return lista.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(lista);
    }

}
