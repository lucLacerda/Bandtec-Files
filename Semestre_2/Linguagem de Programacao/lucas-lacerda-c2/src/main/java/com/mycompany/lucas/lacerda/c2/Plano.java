package com.mycompany.lucas.lacerda.c2;
// Autor: Lucas Lacerda
public class Plano {

    Integer id;
    String nomePlano;
    Integer quantidadeDisponivel;
    Double valorVenda;

    public Plano(Integer id, String nomePlano) {
        this.id = id;
        this.nomePlano = nomePlano;
        this.quantidadeDisponivel = 0;
        this.valorVenda = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return String.format(""
                + "\nID: %d"
                + "\nNome: %s"
                + "\nQuantidade disponível: %d"
                + "\nValor: R$ %.2f",
                id, nomePlano, quantidadeDisponivel, valorVenda);
    }

}
