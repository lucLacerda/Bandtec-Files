public class Alimento extends Produto {

    // Atributos
    private Integer quantVitamina;

    // Construtor
    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }


    // Métodos

    // Implementação do getValorTributo()
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }

    // toString()

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                ", tributo=" + getValorTributo() +
                "} " + super.toString();
    }
}
