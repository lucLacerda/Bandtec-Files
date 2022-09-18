import java.util.ArrayList;
import java.util.List;

public class ListaEstatica {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    int[] vetor;

    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento
    int nroElem;

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem

    public ListaEstatica(int vetor, int nroElem) {
        this.vetor ;
        this.nroElem = nroElem;
    }


    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();


    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou


    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true


    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento


    // 08 Método exibe:
    // Exibe os elementos da lista


    //Métodos getVetor e getNroElem
    //São usados nos testes
    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
