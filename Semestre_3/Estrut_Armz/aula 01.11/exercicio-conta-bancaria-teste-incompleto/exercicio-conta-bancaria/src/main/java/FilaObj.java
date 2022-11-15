public class FilaObj<T> {

    // Atributos
    private int tamanho;
    private T[] fila;

    // Construtor
    public FilaObj(int capacidade) {

    }

    // Métodos

    // Retorna true se a fila está vazia e false coso contrário
    public boolean isEmpty() {
        return false;
    }

    // Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        return false;
    }

    // Se a fila não estiver cheia, insere info na fila
    // Se a fila estiver cheia, deve lançar IllegalStateException
    public void insert(T info) {

    }

    // Retorna o primeiro da fila
    public T peek() {
        return null;
    }

    // Remove e retorna o primerio elemento da fila
    // Antes de retorna, se a fila não estiver vazia, deve fazer a fila "andar"
    public T poll() {
        return null;
    }

    // Exibe os elementos da fila
    public void exibe() {

    }

    // Retorna o vetor fila
    public T[] getFila() {
        return null;
    }
}