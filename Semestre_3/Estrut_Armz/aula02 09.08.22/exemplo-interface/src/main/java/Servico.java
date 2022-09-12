public class Servico implements Tributavel {

    // Atributos
    private String descricao;
    private Double preco;

    // Construtor

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    // Métodos
    public Double getValorTributo() {
        return preco * 0.12;
    }


    // toString()

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", tributo=" + getValorTributo() +
                '}';
    }
}
