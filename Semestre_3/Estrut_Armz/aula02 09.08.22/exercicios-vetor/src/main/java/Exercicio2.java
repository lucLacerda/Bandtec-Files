import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        vetor();
    }

    public static void exibeVetor(Object vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i] + "\t");
        }
    }

    public static void vetor() {
        Scanner leitor = new Scanner(System.in);
        Integer vetor[] = new Integer[10];

        Integer soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("\nDigite o valor de vetor[" + (i+1) + "]");
            vetor[i] = leitor.nextInt();
            soma += vetor[i];
        }
        Integer media = soma/vetor.length;

        System.out.println(media);
        exibeVetor(vetor);
    }
}
