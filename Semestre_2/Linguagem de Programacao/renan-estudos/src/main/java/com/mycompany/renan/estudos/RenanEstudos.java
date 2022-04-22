package com.mycompany.renan.estudos;

/*
 * @author renan.silva@VALEMOBI.CORP
 */
public class RenanEstudos {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo(1, "Kadett");
        Veiculo veiculo2 = new Veiculo(2, "SpaceFox");

        Concessionaria concessionaria1 = new Concessionaria("Renanzinho Motors");

        System.out.println(veiculo1);
        System.out.println(veiculo2);

        concessionaria1.realizarVenda(veiculo1, 2000.0);

        concessionaria1.cadastrarEstoque(veiculo1, 10);
        concessionaria1.cadastrarEstoque(veiculo2, 5);

        concessionaria1.realizarVenda(veiculo1, 2000.0);
        concessionaria1.realizarVenda(veiculo2, 1000.0, 20.5);

        System.out.println(veiculo1);
        System.out.println(veiculo2);

        System.out.println(concessionaria1);

    }
}
