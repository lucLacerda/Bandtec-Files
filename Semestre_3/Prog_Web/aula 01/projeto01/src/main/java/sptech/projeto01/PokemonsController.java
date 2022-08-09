package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonsController {

    List<String> pokemons = new ArrayList<>();

    @GetMapping
    public String nome() {
        return "Bem vindos á API Pokemon";
    }

    @GetMapping("/cadastrar/{pokemon}")
    public String cadastrar(@PathVariable String pokemon) {
        pokemons.add(pokemon);
        return "Pokemon Cadastrar!";
    }

    @GetMapping("/recuperar/{index}")
    public String recuperar(@PathVariable int index) {
        if (index > pokemons.size() || index < 0) return "tem n man";
        else return pokemons.get(index);
    }

    @GetMapping("/excluir/{index}")
    public String excluir(@PathVariable int index) {
        if (index > pokemons.size() || index < 0) return "tem n man";
        else return pokemons.remove(index);
    }

    @GetMapping("/atualizar/{index}/{novoNome}")
    public String atualizar(@PathVariable int index, @PathVariable String novoNome) {
        for (String pokemon : pokemons) {
            if (pokemon.equals(pokemons.get(index))) {
                pokemons.set(index, novoNome);
                return "o novo nome do pokemon é " + novoNome;
            }
        }
        return "kfjgjiisdgjl";
    }
}
