public class TestaTributo {

    public static void main(String[] args) {
        // Criação dos objetos tributaveis
        Alimento arroz = new Alimento (123,
                "Arroz integral - 5 kg", 30.0,
                7);
        Perfume purovodoo = new Perfume (456,
                "Perfume da Rochele", 200.0,
                "floral");
        Servico pinturaParede = new Servico ("Pintura de uma parede",
                500.0);

        // Exibicao dos objetos
        System.out.println(arroz);
        System.out.println(purovodoo);
        System.out.println(pinturaParede);

        // Criacao do objeto da classe Tributo
        Tributo trib = new Tributo();

        // Adicionar os itens tributaveis a  lista de trib
        trib.adicionaTributavel(arroz);
        trib.adicionaTributavel(purovodoo);
        trib.adicionaTributavel(pinturaParede);

        // Exibe todos os itens tributaveis
        trib.exibeTodos();

        // Exibe o total de tributos
        System.out.printf("\nTotal de tributos: R$ %.2f\n",
                           trib.calculaTotalTributo());
//        System.out.println(String.format("\nTotal de tributos: R$ %.2f\n",
//                            trib.calculaTotalTributo()));



//        System.out.println(trib.calculaTotalTributo());
//
//        Double total = trib.calculaTotalTributo();
//        System.out.println(total);

    }
}
