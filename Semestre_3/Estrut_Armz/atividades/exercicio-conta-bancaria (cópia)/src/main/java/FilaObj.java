public class FilaObj<T> {
    // 01) Atributos
    private int tamanho;
    private T[] fila;

    // 02) Construtor
    public FilaObj(int capacidade) {
        tamanho = 0;
        fila = (T[]) new Object[capacidade];
    }

    // 03) Métodos

    public Boolean isEmpty() {
        return tamanho == 0;
    }

    public Boolean isFull() {
        return tamanho == fila.length;
    }

    public void insert(T info) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        else {
            fila[tamanho] = info;
            tamanho++;
        }
    }

    public T peek() {
        return fila[0];
    }

    public T poll() {
        T primeiro = peek(); // salva o primeiro elemento da fila

        if (!isEmpty()) { // se a fila não está vazia
            // faz a fila andar
            for (int i = 0; i < tamanho-1; i++) {
                fila[i] = fila[i+1];
            }
            fila[tamanho-1] = null;    // limpa o último cara da fila
            tamanho--;                 // decrementa tamanho
        }

        return primeiro;
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("A fila está vazia");
        }
        else {
            System.out.println("\nElementos da fila:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println(fila[i]);
            }
        }
    }

    //Getters - Não retirar
    public T[] getFila() {
        return fila;
    }

    public int getTamanho() {
        return tamanho;
    }
}