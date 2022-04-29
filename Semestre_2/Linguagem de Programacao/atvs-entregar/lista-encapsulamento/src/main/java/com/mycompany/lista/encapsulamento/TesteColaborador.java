package com.mycompany.lista.encapsulamento;

public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador("Lucas", "Estagiario", 2000.00);
        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(String.format(
                "\nNome: %s"
                + "\n  Cargo: %s"
                + "\n  Salario: %.2f", colab1.nome, colab1.cargo, colab1.salario));

        rh.promoverColaborador(colab1, "Dev Mobile Júnior", 5000.00);
        rh.promoverColaborador(colab1, "Cliente", 0.0);

        rh.reajustarSalario(colab1, 4200.0);
        
        System.out.println(colab1);

    }
}
