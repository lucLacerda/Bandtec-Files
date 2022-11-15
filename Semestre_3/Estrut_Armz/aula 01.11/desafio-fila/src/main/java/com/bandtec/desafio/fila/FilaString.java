package com.bandtec.desafio.fila;

import org.w3c.dom.ls.LSOutput;

public class FilaString {
    // Atributos
    private int tamanho;
    private String[] fila;

    // Construtor
    public FilaString(int capaciade) {
       this.tamanho = 0;
       this.fila = new String[capaciade];
    }

    // Métodos

    /* Método isEmpty() - retorna true se a fila está vazia e false caso contrário */
    public boolean isEmpty() {

        return tamanho == 0;
    }

    /* Método isFull() - retorna true se a fila está cheia e false caso contrário */
    public boolean isFull() {

        if (tamanho == fila.length){
            return true;
        }
        return false;
    }

    /* Método insert - recebe um elemento e insere esse elemento na fila
                       no índice tamanho, e incrementa tamanho
                       Retornar IllegalStateException caso a fila esteja cheia
     */
    public void insert(String info) {
        if(isFull()){
            throw new IllegalStateException();
        }
        fila[tamanho++] = info;

    }

    /* Método peek - retorna o primeiro elemento da fila, sem removê-lo */
    public String peek() {
        return fila[0];
    }

    /* Método poll - remove e retorna o primeiro elemento da fila, se a fila não estiver
       vazia. Quando um elemento é removido, a fila "anda", e tamanho é decrementado
     */
    public String poll() {
        String primeiro = fila[0];
        if(!isEmpty()){
            for (int i = 0; i < tamanho - 1;i++){
                fila[i] = fila[i+1];
            }
            fila[--tamanho] = null;

        }
        return primeiro;
    }

    /* Método exibe() - exibe o conteúdo da fila */
    public void exibe() {
        if(!this.isEmpty()){
            for(int i = tamanho; i < fila.length;i++){
                System.out.println(fila[i]);
            }
        }
    }

    /* Usado nos testes  - complete para que fique certo */
    public int getTamanho(){
        return tamanho;
    }
}
