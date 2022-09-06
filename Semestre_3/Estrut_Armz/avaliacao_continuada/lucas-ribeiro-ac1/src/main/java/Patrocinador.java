public class Patrocinador implements Torneio {
    private String nome;
    private String nomeEquipe;
    private Integer vitorias;
    private Integer valorInvestido;

    public Patrocinador(String nome, String nomeEquipe, Integer vitorias, Integer valorInvestido) {
        this.nome = nome;
        this.nomeEquipe = nomeEquipe;
        this.vitorias = vitorias;
        this.valorInvestido = valorInvestido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Integer valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    @Override
    public Integer getPremio() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Patrocinador{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", nomeEquipe='").append(nomeEquipe).append('\'');
        sb.append(", vitorias=").append(vitorias);
        sb.append(", valorInvestido=").append(valorInvestido);
        sb.append('}');
        return sb.toString();
    }
}
