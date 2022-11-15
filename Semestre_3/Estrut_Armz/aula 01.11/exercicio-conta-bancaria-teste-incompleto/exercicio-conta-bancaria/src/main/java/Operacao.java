public class Operacao {

    // Atributos
    private ContaBancaria contaBancaria;
    private String tipoOperacao;
    private Double valor;

    // Construtor
    public Operacao(ContaBancaria contaBancaria, String tipoOperacao, Double valor) {

    }

    // Métodos

    // toString()
    @Override
    public String toString() {
        return String.format("\n----------Operação----------\n" +
                        "Tipo de operação: %s\n" +
                        "Valor da operação: R$%.2f",
                tipoOperacao, valor);
    }

    // Getters
    public ContaBancaria getContaBancaria() {
        return null;
    }

    public String getTipoOperacao() {
        return null;
    }

    public Double getValor() {
        return null;
    }

}
