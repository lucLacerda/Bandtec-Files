import java.util.ArrayList;
import java.util.List;

public class Clube implements Torneio {

    List<JogadorFutebol> jogadorFutebolList = new ArrayList<>();

    public void addJogadores(JogadorFutebol jogador) {
        jogadorFutebolList.add(jogador);
    }

    @Override
    public Integer getPremio() {
        Integer premioTotal = 0;
        for (JogadorFutebol jogador : jogadorFutebolList) {
            premioTotal += jogador.getPremio();
        }

        return premioTotal;
    }
}
