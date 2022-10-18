package com.example.projeto_demo.controller;

import com.example.projeto_demo.domain.CarroEntity;
import com.example.projeto_demo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroRepository repository;

    @PostMapping
    public ResponseEntity<CarroEntity> post(
            @RequestBody @Validated CarroEntity novoCarro) {
        repository.save(novoCarro); // faz um insert ou update, dependendo de a chave primária existe ou não no banco

        return ResponseEntity.status(201).body(novoCarro);
    }

    @GetMapping
    public ResponseEntity<List<CarroEntity>> get() {
        List<CarroEntity> lista = repository.findAll(); // faz um "select * from" da tabela

        return lista.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarroEntity> get(
            @PathVariable int id) {
        return ResponseEntity.of(repository.findById(id));
    }


}
