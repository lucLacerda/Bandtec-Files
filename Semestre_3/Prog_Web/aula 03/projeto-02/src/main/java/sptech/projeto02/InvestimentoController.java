package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
// sempre plural e espaço com -
@RequestMapping("/investimentos")
public class InvestimentoController {

    private List<Investimento> investimentos = new ArrayList<>();

    @GetMapping
    private List<Investimento> getInvestimentos(){
        return investimentos;
    }

    @PostMapping
    public Investimento postInvestimento(@RequestBody Investimento novo){
        investimentos.add(novo);
        return novo;
    }

    @GetMapping("/{posicao}")
    public Investimento get(@PathVariable int posicao){
        return investimentos.get(posicao);
    }

    @DeleteMapping("/{posicao}")
    public String delete(@PathVariable int posicao){

        investimentos.remove(posicao);
        return "Excluído com sucesso!";
    }

    @PutMapping("/{posicao}")
    public Investimento putInvestimento(@PathVariable int posicao, @RequestBody Investimento investimento){

        investimentos.set(posicao, investimento);
        return investimento;
    }

}