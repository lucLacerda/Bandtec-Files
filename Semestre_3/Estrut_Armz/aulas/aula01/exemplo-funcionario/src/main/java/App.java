public class App {
    public static void main(String[] args) {

        Engenheiro eng = new Engenheiro("359", "Lucas", 50000.00);
        Horista hor  = new Horista("529", "Matheus", 8, 50.55);
        Vendedor vend = new Vendedor("359", "Antony", 200.00, 10.00);

        Empresa moodle = new Empresa();

        moodle.adicionarFunc(eng);
        moodle.adicionarFunc(hor);
        moodle.adicionarFunc(vend);

        moodle.exibeHorista();
        moodle.exibirTodos();
        moodle.exibirTotalSalario();

    }
}
