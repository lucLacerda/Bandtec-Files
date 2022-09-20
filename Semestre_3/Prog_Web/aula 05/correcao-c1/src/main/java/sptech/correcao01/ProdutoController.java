package sptech.correcao01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public ResponseEntity postProduto(@RequestBody Produto novoProduto) {
        if (novoProduto.isValido()) {
            produtos.add(novoProduto);
            return ResponseEntity.status(201).body(novoProduto);
        }
        return ResponseEntity.status(400).body("Nome deve conter 2 ou mais letras" +
                "\n Preço unitario deve conter valor >= 0.01" +
                "\n Preço unitario deve conter valor >= 0.01");
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getUsuarios() {
        return produtos.isEmpty() ? ResponseEntity.status(204).build() : ResponseEntity.status(200).body(produtos);
    }

    @DeleteMapping("/{posicao}")
    public ResponseEntity deleteProduto(@PathVariable int posicao) {
        if (posicao > produtos.size() - 1 || posicao < 0) {
            return ResponseEntity.status(404).body("Posicao invalida");
        } else {
            Produto produtoRemovido = produtos.get(posicao);
            produtos.remove(posicao);
            return ResponseEntity.status(200).body(produtoRemovido);
        }
    }
}

