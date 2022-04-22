package com.mycompany.renan.estudos;

/*
 * @author renan.silva@VALEMOBI.CORP
 */
public class Veiculo {

    private Integer id;
    private String modelo;
    private Integer qtdEstoque;
    private Double valorVenda;

    public Veiculo(Integer id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.qtdEstoque = 0;
        this.valorVenda = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return String.format("\nID: %d"
                + "\nModelo: %s"
                + "\nQuantidade em estoque %d"
                + "\nValor Tabela: R$ %.2f",
                id, modelo, qtdEstoque, valorVenda);
    }

}
