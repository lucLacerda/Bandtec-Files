public class JogadorGoleiro extends JogadorFutebol {

    private Integer golsSofridos;
    private Integer penaltiesDefendidos;

    public JogadorGoleiro(Integer codigo, String nome, Integer nroJogos, Integer golsSofridos, Integer penaltiesDefendidos) {
        super(codigo, nome, nroJogos);
        this.golsSofridos = golsSofridos;
        this.penaltiesDefendidos = penaltiesDefendidos;
    }

    public Integer getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(Integer golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public Integer getPenaltiesDefendidos() {
        return penaltiesDefendidos;
    }

    public void setPenaltiesDefendidos(Integer penaltiesDefendidos) {
        this.penaltiesDefendidos = penaltiesDefendidos;
    }

    @Override
    public Integer getDesempenho() {
        return (penaltiesDefendidos - golsSofridos)/getNroJogos();
    }

    @Override
    public Integer getPremio() {
        return getDesempenho() * 300;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JogadorGoleiro{");
        sb.append("golsSofridos=").append(golsSofridos);
        sb.append(", penaltiesDefendidos=").append(penaltiesDefendidos);
        sb.append('}');
        return sb.toString();
    }
}
