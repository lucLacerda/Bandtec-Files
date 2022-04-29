
package com.mycompany.lista02;

public class Plano {
    private Integer id;
    private String nomePlano;
    private Integer quantidadeDisponivel;
    private Double valorVenda;

    public Plano(Integer id, String nomePlano, Integer qtdDisponivel, Double valorVenda) {
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

    public Integer getQtdDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQtdDisponivel(Integer qtdDisponivel) {
        this.quantidadeDisponivel = qtdDisponivel;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return String.format("ID: %d"
                + "\nNome: %s"
                + "\nQuantidade Disponível: %d,"
                + "\nValor: %.2f"              
                , id, nomePlano, quantidadeDisponivel, valorVenda);
    }
    
    
    
}
