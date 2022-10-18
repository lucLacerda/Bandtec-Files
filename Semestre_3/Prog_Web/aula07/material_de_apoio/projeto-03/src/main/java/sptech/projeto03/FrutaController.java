package sptech.projeto03;

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
            /*
Aqui nós retornamos uma Reponse (resposta) cuja...
o status de resposta é 204
o corpo da resposta é nulo (sem corpo) -> .build()
             */
            return ResponseEntity.status(204).build();
        }
            /*
Aqui nós retornamos uma Reponse (resposta) cuja...
o status de resposta é 200
o corpo da resposta é a lista de frutas -> body(frutas)
             */
        return ResponseEntity.status(200).body(frutas);
    }

    @PostMapping("/favorita")
    public ResponseEntity<Fruta> favorita() {
        Fruta favorita = new Fruta("Uva", 9.99);
        frutas.add(favorita);
        return ResponseEntity.status(201).body(favorita);
    }

    // GET /frutas/{posicao}
    /*
    Retorna o JSON da fruta na posição da lista indicada
    com status 200
    OU
    status 404 e SEM corpo de resposta
     */
    @GetMapping("/{posicao}")
    public ResponseEntity<Fruta> get(@PathVariable int posicao) {
        if (posicao >= 0 && posicao < frutas.size()) {
            return ResponseEntity.status(200).body(frutas.get(posicao));
        }
        return ResponseEntity.status(404).build();
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Fruta novaFruta) {
        if (novaFruta.getNome()==null || novaFruta.getNome().isBlank()) {
            return ResponseEntity.status(400).body("Nome deve ter 1+ letras");
        }
        if (novaFruta.getPreco()!=null && novaFruta.getPreco() < 0.0) {
            return ResponseEntity.status(400).body("Preço deve ser >= 0");
        }

        frutas.add(novaFruta);
        return ResponseEntity.status(201).body(novaFruta);
    }
}
