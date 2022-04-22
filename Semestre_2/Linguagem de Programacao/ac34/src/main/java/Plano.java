public class Plano {
    private Integer id;
    private String nomePlano;
    private Integer quantidadeDisponível;
    private Double valorVenda;

    public Plano(Integer id, String nomePlano) {
        this.id = id;
        this.nomePlano = nomePlano;
        this.quantidadeDisponível = 0;
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

    public Integer getQuantidadeDisponível() {
        return quantidadeDisponível;
    }

    public void setQuantidadeDisponível(Integer quantidadeDisponível) {
        this.quantidadeDisponível = quantidadeDisponível;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return
                "\nID: " + id +
                "\nNome: " + nomePlano +
                "\nQuantidade disponível: " + quantidadeDisponível +
                "\nValor: " + valorVenda;
    }
}

