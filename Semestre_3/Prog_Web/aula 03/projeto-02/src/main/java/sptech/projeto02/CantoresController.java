package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
// sempre plural e espaço com -
@RequestMapping("/cantores")
public class CantoresController {

    private List<Cantores> cantoresList = new ArrayList<>();

    @GetMapping
    private List<Cantores> getCantores(){
        return cantoresList;
    }

    @PostMapping
    public Cantores postCantores(@RequestBody Cantores cantor){
        cantor.setId(cantoresList.size() + 1);
        cantoresList.add(cantor);
        return cantor;
    }

   // @GetMapping("/{posicao}")
  //  public Cantores get(@PathVariable int posicao){
   //     return cantoresList.get(posicao);
  //  }

    @DeleteMapping("/{posicao}")
    public String delete(@PathVariable int posicao){

        cantoresList.remove(posicao);
        return "Excluído com sucesso!";
    }

    @PutMapping("/{posicao}")
    public Cantores putInvestimento(@PathVariable int posicao, @RequestBody Cantores cantor){

        cantoresList.set(posicao, cantor);
        return cantor;
    }

    @GetMapping("/{id}")
    public Cantores getCantorId(@PathVariable int id){
        for (Cantores novoCantor : cantoresList) {
            if (novoCantor.getId() == id) {
                return novoCantor;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public Cantores putCantorId(@PathVariable int id, @RequestBody Cantores cantor){
        for (Cantores novoCantor : cantoresList) {
            if (novoCantor.getId() == id) {
                return cantor;
            }
        }
        return null;
    }
}
