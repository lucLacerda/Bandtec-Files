package sptech.projetojpa01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa01.domain.Anime;
import sptech.projetojpa01.repository.AnimeRepository;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    @Autowired
    AnimeRepository repository;

    @PostMapping
    public ResponseEntity<Anime> post(@RequestBody Anime novoAnime) {
        repository.save(novoAnime);
        List<Anime> lista = repository.findAll();
        return ResponseEntity.status(201).body(novoAnime);
    }

    @GetMapping
    public ResponseEntity<List<Anime>> get(){
        List<Anime> lista = repository.findAll();
        return lista.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> get(@PathVariable int id){
        return  ResponseEntity.of(repository.findById(id));
    }
}
