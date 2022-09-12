package sptech.projetoaula2408.questao1_3;

public class Grife {
    private String nome;
    private int anoCriacao;
    private double valorAcaoBolsa;
    private String chaveAcesso;

    public boolean validarChave(String chaveAcesso) {
        return chaveAcesso.equals(this.chaveAcesso);
    }

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public double getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }
}
