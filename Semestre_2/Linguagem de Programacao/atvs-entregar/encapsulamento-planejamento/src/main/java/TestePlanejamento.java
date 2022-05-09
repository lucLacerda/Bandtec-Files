public class TestePlanejamento {
    public static void main(String[] args) {
        Planejamento planejamento = new Planejamento("Jogar", "Lucas", 10);

        System.out.println(planejamento);

        planejamento.terminarAtividade(7);

        System.out.println(planejamento);
    }
}
