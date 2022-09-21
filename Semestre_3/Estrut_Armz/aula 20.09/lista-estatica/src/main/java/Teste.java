public class Teste {

    // Testar Classe ListaEstatica
    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica(5);

        lista.exibe();

        try {
            lista.adiciona(10);
            lista.adiciona(20);
            lista.adiciona(30);
            lista.adiciona(40);
            lista.adiciona(50);
            lista.adiciona(60);
        }
        catch (IllegalStateException erro) {
            System.out.println("Lista cheia!");
        }

        lista.exibe();

        if (lista.removePeloIndice(1)) {
            System.out.println("\nElemento no índice 1 removido com sucesso");
        }

        lista.exibe();

    }
}
