public class App {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos", 35, 5.5);
        Coordenador coordenador = new Coordenador("José", 35, 5.5, 25, 6.0);
        System.out.println(professor.getBonus());
        System.out.println(coordenador.getBonus());
        ControleBonus ctrl = new ControleBonus();
        ctrl.add(professor);
        ctrl.add(coordenador);
        System.out.println(ctrl.totalBonus());
    }
}
