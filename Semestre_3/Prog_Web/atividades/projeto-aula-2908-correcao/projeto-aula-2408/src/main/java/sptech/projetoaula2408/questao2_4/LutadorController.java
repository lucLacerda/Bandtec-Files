package sptech.projetoaula2408.questao2_4;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    private List<Lutador> lutadores = new ArrayList<>();

    @PostMapping
    public Lutador post(@RequestBody Lutador novoLutador) {
        lutadores.add(novoLutador);
        return novoLutador;
    }

    @GetMapping
    public List<Lutador> getLutadores() {
        return lutadores;
    }

    @PatchMapping("/{posicaoBate}/golpe/{posicaoApanha}")
    public List<Lutador> golpear(@PathVariable int posicaoBate,
                                 @PathVariable int posicaoApanha) {
        if (posicaoBate < 0 || posicaoBate >= lutadores.size()
        || posicaoApanha < 0 || posicaoApanha >= lutadores.size()) {
            return null;
        }

        Lutador lutadorQueBate = lutadores.get(posicaoBate);
        Lutador lutadorQueApanha = lutadores.get(posicaoApanha);

        lutadorQueApanha.apanhar(lutadorQueBate);
        /*
        int forcaLiquidaGolpe =
        lutadorQueBate.getForcaGolpe() - lutadorQueApanha.getForcaDefesa();

        int novaVidaQueApanha = lutadorQueApanha.getVida() - forcaLiquidaGolpe;

        lutadorQueApanha.setVida(novaVidaQueApanha);
*/
        return List.of(lutadorQueBate, lutadorQueApanha);
    }

    @PatchMapping("/sobreviventes")
    public List<Lutador> getSobreviventes() {
         List<Lutador> sobreviventes = new ArrayList<>();

         for (Lutador lutador : lutadores) {
             if (lutador.getVida() > 0) {
                 sobreviventes.add(lutador);
             }
         }

         return sobreviventes;
    }

    public List<Lutador> getSobreviventesV2() {
        List<Lutador> sobreviventes = lutadores.stream()
                .filter(lutador -> lutador.getVida() > 0)
                .collect(Collectors.toList());

        return sobreviventes;
    }

    public List<Lutador> getSobreviventesV3() {
        return lutadores.stream()
                .filter(lutador -> lutador.getVida() > 0)
                .collect(Collectors.toList());
    }

    public List<Lutador> getSobreviventesV4() {
        return lutadores.stream()
                .filter(Lutador::isVivo)
                .collect(Collectors.toList());
    }

}
