package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    private final List<Investimento> investimentoList = new ArrayList<>();

    @GetMapping
    public List<Investimento> getInvestimentoList() {
        return investimentoList;
    }

    @PostMapping
    public Investimento postInvestimento(@RequestBody Investimento investimento) {
        investimentoList.add(investimento);
        return investimento;
    }

}
