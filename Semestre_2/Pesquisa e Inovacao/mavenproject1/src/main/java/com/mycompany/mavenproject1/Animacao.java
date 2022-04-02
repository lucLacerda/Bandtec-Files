
package com.mycompany.mavenproject1;

public class Animacao {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animacao(String nome, Integer anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Animacao{" + "nome=" + nome + ", anoLancamento=" + anoLancamento + '}';
    }
    private Integer anoLancamento;
    
}
