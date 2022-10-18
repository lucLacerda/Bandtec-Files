package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio1Controller {

    @GetMapping("/pode-votar/{idade}")
    public boolean podeVotar(@PathVariable int idade) {
        return idade >= 16;
    }

    @GetMapping("/imc/{peso}/{altura}")
    public double podeVotar(@PathVariable double peso,
                            @PathVariable double altura) {
        return peso / Math.pow(altura, 2);
    }

    @GetMapping("/analise-campanha/{vitorias}/{empates}/{derrotas}")
    public String analisarCampanha(@PathVariable int vitorias,
                                   @PathVariable int empates,
                                   @PathVariable int derrotas) {
        int pontosPossiveis = (vitorias + empates + derrotas) * 3;
        int pontosObtidos = vitorias * 3 + empates;

// No Java a divisão entre 2 Inteiros (Integer ou int)
// SEMPRE resulta num número inteiro
// A parte "decimal" é DESCARTADA. Não é feito arredondamento
// ex: 0.999 -> 0   / 2.99999 -> 2
// PARA resolver, pelo menos um dos números deve ser real
        double aproveitamento = (double) pontosObtidos / pontosPossiveis * 100;

        return "A campanha do time foi de "+aproveitamento+"%";
    }

    /*public static void main(String[] args) {
        System.out.println(100/2);
        System.out.println(100.50/2);
        System.out.println(100/2.2);
        System.out.println(10.0/15);
        System.out.println(10/11.0);
    }*/
}
