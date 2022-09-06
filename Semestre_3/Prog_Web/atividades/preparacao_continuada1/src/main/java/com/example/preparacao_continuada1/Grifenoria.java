package com.example.preparacao_continuada1;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Grifenoria {
    String nome;
    int anoCriacao;
    double valorAcaoBolsa;
    String chaveAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public double getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }

    public void setValorAcaoBolsa(double valorAcaoBolsa) {
        this.valorAcaoBolsa = valorAcaoBolsa;
    }

    @JsonIgnore
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }
}
