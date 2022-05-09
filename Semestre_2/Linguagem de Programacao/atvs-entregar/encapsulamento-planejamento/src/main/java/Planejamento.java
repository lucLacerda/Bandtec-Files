public class Planejamento {
    private final String atividade;
    private final String responsavel;
    private final Integer diasEstimados;
    private Integer diasUsados = 0;

    public Planejamento(String atividade, String responsavel, Integer diasEstimados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
        calcularTempo();
    }

    public void calcularTempo() {
        if (diasUsados > diasEstimados) {
            Integer diasUltrapassados =  diasUsados - diasEstimados;

            System.out.printf("" +
                            "Vc estimou %d dias, mas a tarefa foi feita em %d dias" +
                            "\n(%d dias a mais que o estimado). Melhore a estimativa\n",
                    diasEstimados, diasUsados, diasUltrapassados);

        } else if (diasUsados < diasEstimados){
            Integer diasAmenos = diasEstimados - diasUsados;
            System.out.printf("" +
                            "Você estimou %d dias, e a tarefa foi feita em %d dias " +
                            "\n(%d dias a menos que o estimado). Parabéns!\n",
                    diasEstimados, diasUsados, diasAmenos);
        } else {
            System.out.printf("" +
                            "Você estimou %d dias, e a tarefa foi feita em %d dias, " +
                            "\natendendo a estimativa com precisão\n",
                    diasEstimados, diasUsados);
        }

    }

    @Override
    public String toString() {
        return String.format("""
                \nAtividade: %s
                    Responsavel: %s
                    Dias Estimados: %d,
                    Dias Usados: %d

                """, atividade, responsavel, diasEstimados, diasUsados);
    }
}
