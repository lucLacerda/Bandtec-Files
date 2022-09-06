public abstract class JogadorFutebol implements Torneio {
    private Integer codigo;
    private String nome;
    private Integer nroJogos;
    private Integer desempenho;

    public JogadorFutebol(Integer codigo, String nome, Integer nroJogos) {
        this.codigo = codigo;
        this.nome = nome;
        this.nroJogos = nroJogos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNroJogos() {
        return nroJogos;
    }

    public void setNroJogos(Integer nroJogos) {
        this.nroJogos = nroJogos;
    }

    public Integer getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(Integer desempenho) {
        this.desempenho = desempenho;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JogadorFutebol{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", nroJogos=").append(nroJogos);
        sb.append(", desempenho=").append(desempenho);
        sb.append('}');
        return sb.toString();
    }
}
