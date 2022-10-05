package sptech.projetojpa01.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa01.dominio.Anime;
import sptech.projetojpa01.repositorio.AnimeRepository;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    /*
@Autowired - pedimos aqui para o Spring "injetar" o
objeto do tipo AnimeRepository, pois o Spring cria,
em tempo de execução, uma classe que a implementa,
criando nela métodos cujos comandos SQL são específicos
para o banco de dados configurado no projeto
     */
    @Autowired
    private AnimeRepository repository;

    @PostMapping
    public ResponseEntity<Anime> post(
            @RequestBody Anime novoAnime) {
        repository.save(novoAnime); // faz um insert ou update, dependendo de a chave primária existe ou não no banco
        return ResponseEntity.status(201).body(novoAnime);
    }

    @GetMapping
    public ResponseEntity<List<Anime>> get() {
        List<Anime> lista = repository.findAll(); // faz um "select * from" da tabela
        return lista.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> get(
            @PathVariable int id) {
/*
Se o findById() encontrar valor, ele será usado no corpo da resposta e o status da resposta será 200
Caso contrário, o status da resposta será 404 e não haverá corpo na resposta
 */
        return ResponseEntity.of(repository.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable int id) {
/*
O existsById() faz um "select count(*)..." para saber se o id existe na tabela
 */
        if (repository.existsById(id)) {
            repository.deleteById(id);
// O deleteById() faz um "delete from... where id=..."
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anime> put(
            @PathVariable int id, @RequestBody Anime anime) {
        if (repository.existsById(id)) {
            anime.setIdAnime(id);
            repository.save(anime);
            return ResponseEntity.status(200).body(anime);
        }
        return ResponseEntity.status(404).build();
    }
}