import org.w3c.dom.ls.LSOutput;

public class TesteOperadora {
    public static void main(String[] args) {
        Plano plano1 = new Plano(1, "Claro Pré");
        Plano plano2 = new Plano(2, "Claro Pós");

        Operadora operadora = new Operadora("Claro");

        System.out.println(plano1);
        System.out.println(plano2);

        operadora.realizarVenda(plano1, 64.99);

        operadora.cadastrarQuantidadeDisponivel(plano1, 3);
        operadora.cadastrarQuantidadeDisponivel(plano2, 2);

        operadora.realizarVenda(plano1, 64.99);

        operadora.realizarVendaComDesconto(plano2, 100.0, 20);

        System.out.println(plano1);
        System.out.println(plano2);

        System.out.println(operadora);
    }

}
