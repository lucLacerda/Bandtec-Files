import java.util.ArrayList;

public class TesteCarrinho {
    public static void main(String[] args) {
        Produto nescau = new Produto("Nescau", "Achocolatado", 5.99);
        Produto alface = new Produto("Alface", "Legume", 2.99);
        Produto frango = new Produto("Frango", "Carne", 20.99);

        Carrinho comprinhas = new Carrinho();

        comprinhas.adicionar(nescau);
        comprinhas.adicionar(alface);
        comprinhas.adicionar(frango);

    }
}
