package sptech;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
    }

    // 03) Método isEmpty
    public Boolean isEmpty() {
        return topo == -1;
    }

    // 04) Método isFull
    public Boolean isFull() {
        return topo == pilha.length - 1;
    }

    // 05) Método push
    public void push(int info) {
        if (isFull()) {
            throw new IllegalStateException();

        } else {
            pilha[++topo] = info;

        }
    }

    // 06) Método pop
    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return pilha[topo--];
        }
    }

    // 07) Método peek
    public int peek() {
        return isEmpty()?  -1 :pilha[topo];
    }

    // 08) Método exibe
    public void exibe() {
        for (int i = topo - 1; i > 0; i--) {
            System.out.println(pilha[i]);
        }
    }

    public Boolean isPalindromo() {
        boolean hasPalindromo = false;
        for (int i = topo - 1; i > 0; i--) {
            System.out.println(pilha[i]);
            for (int j = 0; j > pilha.length - 1; j--) {
                System.out.println(pilha[i]);

                if (i != j) {
                    return hasPalindromo = false;
                } else {
                    hasPalindromo = true;
                }
            }
        }

        return hasPalindromo;
    }

    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}