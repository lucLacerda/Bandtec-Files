public class FilaObj<T> {
    // Atributos (não alterar)
    private int tamanho;
    private T[] fila;

    //Construtor (completar)
    public FilaObj(int capacidade) {
        this.tamanho = 0;
        this.fila = (T[]) new Object[capacidade];
    }

    // Métodos (completar)
    public Boolean isEmpty() {
        return tamanho == 0;
    }

    public Boolean isFull() {
        return tamanho == fila.length;
    }

    public void insert(T info) {
        if (isFull()) throw new IllegalStateException();
        else fila[tamanho++] = info;
    }

    public T peek() {
        return fila[0];
    }


    public T poll() {
        T primeiro = peek();

        if (!isEmpty()) {

            for (int i = 0; i < tamanho - 1; i++) {
                fila[i] = fila[i+1];
            }
            fila[tamanho-1] = null;
            tamanho--;
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

    // Getters (não retirar)
    public T[] getFila() {
        return fila;
    }

    public int getTamanho() {
        return tamanho;
    }
}