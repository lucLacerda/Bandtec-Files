package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frutas")
public class FrutasController {

    private List<String> frutas = new ArrayList<>();

    @GetMapping // URI: /frutas
    public List<String> getFrutas() {
        return frutas;
    }

    @DeleteMapping("/{indice}") // URI: /frutas/{indice}
    public String excluir(@PathVariable int indice) {
        frutas.remove(indice);
        return "Fruta excluída";
    }

    @PutMapping("/{indice}") // URI: /frutas/{indice}
    public String atualizar(@PathVariable int indice) {
        // A fazer...
        return "Fruta atualizada";
    }

    @GetMapping("/{indice}") // URI: /frutas/{indice}
    public String getFruta(@PathVariable int indice) {
        return frutas.get(indice);
    }

    @PostMapping   // URI: /frutas
    public String cadastrar(String novaFruta) {
        frutas.add(novaFruta);
        return novaFruta;
    }

}
