public class Coordenador extends Professor{
    private Integer qtdHorasCoord;
    private Double vlrHoraCoord;

    public Coordenador(String nome, Integer qtdHorasAula, Double vlrHoraAula, Integer qtdHorasCoord, Double vlrHoraCoord) {
        super(nome, qtdHorasAula, vlrHoraAula);
        this.qtdHorasCoord = qtdHorasCoord;
        this.vlrHoraCoord = vlrHoraCoord;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + qtdHorasCoord * vlrHoraCoord * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHorasCoord=" + qtdHorasCoord +
                ", vlrHoraCoord=" + vlrHoraCoord +
                "} " + super.toString();
    }
}
