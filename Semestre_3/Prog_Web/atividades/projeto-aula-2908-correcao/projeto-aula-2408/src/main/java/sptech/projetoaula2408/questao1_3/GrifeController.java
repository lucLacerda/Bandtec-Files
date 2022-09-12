package sptech.projetoaula2408.questao1_3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/grifes")
public class GrifeController {

    private List<Grife> grifes = new ArrayList<>();

    @PostMapping
    public Grife post(@RequestBody Grife novaGrife) {
        grifes.add(novaGrife);
        return novaGrife;
    }

    @GetMapping
    public List<Grife> getGrifes() {
        return grifes;
    }

    @DeleteMapping("/{posicao}")
    public String delete(@PathVariable int posicao) {
        if (posicao >= 0 && posicao < grifes.size()) {
            grifes.remove(posicao);
            return "Grife excluída";
        }
        return "Não encontrada";
    }

    @PutMapping("/{posicao}")
    public Grife put(@PathVariable int posicao,
                        @RequestBody Grife grife) {
        if (posicao >= 0 && posicao < grifes.size()) {
            grifes.set(posicao, grife);
            return grife;
        }
        return null;
    }

    @GetMapping("{posicao}/cotas/{quantidade}/{chaveAcesso}")
    public Double cotas(@PathVariable int posicao,
                        @PathVariable double quantidade,
                        @PathVariable String chaveAcesso) {

        if (posicao >= 0 && posicao < grifes.size()) {
            Grife grife = grifes.get(posicao);
            if (grife.validarChave(chaveAcesso)) {
                return grife.getValorAcaoBolsa() * quantidade;
            }
        }
        return null;
    }

    @GetMapping("/populares")
    public List<Grife> getGrifesPopulares() {
        List<Grife> populares = new ArrayList<>();

        for (Grife grife : grifes) {
            if (grife.getValorAcaoBolsa() < 15) {
                populares.add(grife);
            }
        }

        return populares;
    }

    public List<Grife> getGrifesPopularesV2() {
        List<Grife> populares = grifes.stream()
                .filter(grife -> grife.getValorAcaoBolsa() < 15)
                .collect(Collectors.toList());

        return populares;
    }

    public List<Grife> getGrifesPopularesV3() {
        return grifes.stream()
                .filter(grife -> grife.getValorAcaoBolsa() < 15)
                .collect(Collectors.toList());
    }
}
