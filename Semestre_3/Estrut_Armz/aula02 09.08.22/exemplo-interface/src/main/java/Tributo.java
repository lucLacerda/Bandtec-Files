import java.util.ArrayList;
import java.util.List;

public class Tributo {

    // Atributo
    private List<Tributavel> listaTrib;

    // Construtor
    public Tributo() {
        listaTrib = new ArrayList<>();
    }

    // Métodos

    // adicionaTributavel
    public void adicionaTributavel(Tributavel t) {
        listaTrib.add(t);
    }

    // exibeTodos
    public void exibeTodos() {
        System.out.println("\nLista dos itens tributáveis:");
        for (Tributavel t : listaTrib) {
            System.out.println(t);
        }
    }


    // calculaTotalTributo
    public Double calculaTotalTributo() {
        Double total = 0.0;
        for (Tributavel t : listaTrib) {
            total += t.getValorTributo();
        }
        return total;
    }


}
