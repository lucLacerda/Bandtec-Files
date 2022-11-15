package sptech;

public class AppPilha {

    public static int getLog(int numero){
        return (int) (Math.log(numero)/Math.log(2));
    }
        public static boolean isPalidromo(int[] vetor){
            Pilha pilha = new Pilha(vetor.length);
            for (int j : vetor) {
                pilha.push(j);
            }

            for (int j : vetor) {
                if (j != pilha.pop()) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] vet1 = {1,2,2,1};
            int[] vet2 = {1,2,3,2,1};
            int[] vet3 = {1,2,3,4,5,6};
            int[] vet4 = {8,8,2,8,8};

            System.out.println(isPalidromo(vet1));
            System.out.println(isPalidromo(vet2));
            System.out.println(isPalidromo(vet3));
            System.out.println(isPalidromo(vet4));

            System.out.println(getLog(12));

        }
    }