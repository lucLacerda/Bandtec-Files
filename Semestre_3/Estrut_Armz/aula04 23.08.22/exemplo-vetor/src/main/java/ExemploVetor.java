import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
//        vetor1();
//        vetor2();
//        vetor3();
//        vetor4();
        vetor5();
    }

    public static void exibeVetor(Object vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[" + i + "] = " + vetor[i] + "\t");
        }
    }

    public static void vetor1() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do tamanho do vetor");

        int tamanhoVetor = leitor.nextInt();

        Integer vetor[] = new Integer[tamanhoVetor];

//        for (int i = 0; i < vetor.length; i++) {
//            vetor[i] = i * 10;
//        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("\nDigite o valor de vetor[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        exibeVetor(vetor);
    }

    public static void vetor2() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do tamanho do vetor");

        int tamanhoVetor = leitor.nextInt();

        String vetor[] = new String[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("\nDigite o valor de vetor[" + i + "]");
            vetor[i] = leitor.next();
        }

        exibeVetor(vetor);
    }

    public static void vetor3() {
        Scanner leitor = new Scanner(System.in);

        String vetor[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabádo"};

        System.out.println("\nDigite um dia da semana");
        int valorUsuario = leitor.nextInt();

        while (valorUsuario < 0 || valorUsuario > 7) {
            System.out.println("Digita o valor certo");
            valorUsuario = leitor.nextInt();
        }

        System.out.printf("Você digitou: " + vetor[valorUsuario - 1]);


    }

    public static void vetor4() {
        Integer vetor[] = {5, 10, 15};

        int soma = 0;
        for (Integer integer : vetor) {

            soma += integer;
        }

        System.out.printf("A soma do vetor é: " + soma);

    }

    public static void vetor5() {
        Integer vetor[] = {5, 10, 15, 20, 22};

        int pares = 0;

        for (Integer integer : vetor) {
            if (integer % 2 == 0) {
                pares++;
            }
        }

        System.out.printf("A qtd de pares é: " + pares);

    }
}
