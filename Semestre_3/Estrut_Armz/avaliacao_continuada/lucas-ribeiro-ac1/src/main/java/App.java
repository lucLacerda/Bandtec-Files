import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        JogadorAtacante jogadorAtacante = new JogadorAtacante(10, "João", 15, 30, 50);
        JogadorGoleiro jogadorGoleiro = new JogadorGoleiro(1, "Lucas", 2, 1, 15);

        ControlePremio controle = new ControlePremio();

        Clube spfc = new Clube();

        // adicionando jogadores no clube
        spfc.addJogadores(jogadorAtacante);
        spfc.addJogadores(jogadorGoleiro);

        // fazendo um get do premio do clube
        System.out.println("Premio do Clube: " + spfc.getPremio());

        // revelando jogadores
        System.out.println(jogadorAtacante);
        System.out.println(jogadorGoleiro);

        // premio de cada jogador
        System.out.println("Premio jogador atacante: " + jogadorAtacante.getPremio());
        System.out.println("Premio jogador goleiro: " + jogadorGoleiro.getPremio());

        // desempenho de cada jogador
        System.out.println("Desempenho jogador atacante: " + jogadorAtacante.getDesempenho());
        System.out.println("Desempenho jogador goleiro: " + jogadorGoleiro.getDesempenho());

        // adicionando clubes no controle
        controle.addClubes(spfc);

        // premio total do torneio
        System.out.println("Premio total do torneio: " + controle.totalPremiacao());

    }
}
