public class Exercicio1 {

    public static void main(String[] args) {
        vetor();
    }

    public static void vetor() {
        Integer[] vetor = {1, 2, 3, 4, 5, 6, 7};

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
