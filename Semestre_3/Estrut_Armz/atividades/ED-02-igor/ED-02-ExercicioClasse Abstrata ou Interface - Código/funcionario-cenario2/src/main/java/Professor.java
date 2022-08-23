public class Professor extends Educador{
    private Integer qtdHorasAula;
    private Double vlrHoraAula;

    public Professor(String nome, Integer qtdHorasAula, Double vlrHoraAula) {
        super(nome);
        this.qtdHorasAula = qtdHorasAula;
        this.vlrHoraAula = vlrHoraAula;
    }

    @Override
    public double getBonus() {
        return qtdHorasAula * vlrHoraAula * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qtdHorasAula=" + qtdHorasAula +
                ", vlrHoraAula=" + vlrHoraAula +
                "} " + super.toString();
    }
}
