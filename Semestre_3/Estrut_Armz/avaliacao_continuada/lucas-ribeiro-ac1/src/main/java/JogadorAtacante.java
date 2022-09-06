public class JogadorAtacante extends JogadorFutebol{

    private Integer golsMarcados;
    private Integer assistencias;

    public JogadorAtacante(Integer codigo, String nome, Integer nroJogos, Integer golsMarcados, Integer assistencias) {
        super(codigo, nome, nroJogos);
        this.golsMarcados = golsMarcados;
        this.assistencias = assistencias;
    }

    public Integer getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public Integer getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(Integer assistencias) {
        this.assistencias = assistencias;
    }

    @Override
    public Integer getDesempenho() {
        return golsMarcados + assistencias;
    }

    public Integer getPremio(){
        return getDesempenho() * 200;
    };

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JogadorAtacante{");
        sb.append("golsMarcados=").append(golsMarcados);
        sb.append(", assistencias=").append(assistencias);
        sb.append('}');
        return sb.toString();
    }
}
