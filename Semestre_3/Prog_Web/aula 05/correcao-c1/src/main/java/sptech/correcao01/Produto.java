package sptech.correcao01;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Produto {

    private String nome;
    private Double precoUnitario;
    private Double quantidadeEstoque;

    public Produto(String nome, Double precoUnitario, Double quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @JsonIgnore
    public boolean isValido() {
        return nome != null
                && nome.length() >= 3
                && precoUnitario != null
                && precoUnitario >= 0.01
                && quantidadeEstoque != null
                && quantidadeEstoque >= 0.01;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @JsonIgnore
    public Double valorEstoque() {
        return quantidadeEstoque * precoUnitario;
    }

}
