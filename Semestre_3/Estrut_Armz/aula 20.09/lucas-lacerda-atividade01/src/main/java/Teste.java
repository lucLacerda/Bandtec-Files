import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ListaObj<Remedio> remedioListaObj = new ListaObj<>(5);

        // criando mock para facilitar na programacao
        Remedio remedio1 = new Remedio(12, "Dorflex", 10.0, "Oral");

        Scanner leitor = new Scanner(System.in);
        int opcaoDigitada;
        do {
            System.out.println("\nDigite uma das opções abaixo: (digite 1, 2, ou 3) \n");
            System.out.println("Opção 1 - Adicionar um objeto na lista (cadastro)");
            System.out.println("Opção 2 - Exibir os objetos cadastrados (relátório)");
            System.out.println("Opção 3 - Fim do programa (encerrar).\n");
            opcaoDigitada = leitor.nextInt();

            switch (opcaoDigitada) {
                case 1:
                    remedioListaObj.adiciona(remedio1);
                    System.out.println("Produto adicionado");

                    break;

                case 2:
                    String[] titulo = {"CODIGO", "PRODUTO", "VALOR", "ESTOQUE"};

                        System.out.printf("%8s %10s %20s %10s", titulo[0], titulo[1], titulo[2], titulo[3]);

                    for (int i = 0; i < remedioListaObj.getTamanho(); i++) {
                        System.out.printf("\n %06d\n", remedioListaObj.getElemento(i).getId());
                    }
//
//                    for (int i = 0; i < remedioListaObj.getTamanho(); i++) {
//                        System.out.printf("%06d\n", remedioListaObj.getElemento(i).getId());
//                    }
                    break;

                case 3:
                    System.out.println("Obrigado por utilizar :)");
                    break;
                default:
                    System.out.println("Número inválido");
            }

        } while (opcaoDigitada == 1);

    }
}
