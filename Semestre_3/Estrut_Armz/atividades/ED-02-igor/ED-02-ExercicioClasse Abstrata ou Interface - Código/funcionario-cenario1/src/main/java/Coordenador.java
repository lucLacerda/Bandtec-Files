public class Coordenador extends FuncionarioComBonus{
    private Integer qtdHorasCoord;
    private Double vlrHoraCoord;

    public Coordenador(String nome, Integer qtdHorasCoord, Double vlrHoraCoord) {
        super(nome);
        this.qtdHorasCoord = qtdHorasCoord;
        this.vlrHoraCoord = vlrHoraCoord;
    }

    @Override
    public double getBonus() {
        return qtdHorasCoord * vlrHoraCoord * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHorasCoord=" + qtdHorasCoord +
                ", vlrHoraCoord=" + vlrHoraCoord +
                "} " + super.toString();
    }
}
