package com.mycompany.lista.encapsulamento;

public class RecursosHumanos {

    Integer totalPromovidos = 0;
    Integer totalSalariosReajustados = 0;

    public void reajustarSalario(Colaborador colaborador, Double reajusteSalario) {
        colaborador.setSalario(colaborador.getSalario() + reajusteSalario);
        totalSalariosReajustados++;

        System.out.println(colaborador);
        System.out.println("Salário reajustado");

    }

    public void promoverColaborador(Colaborador colaborador, String cargo, Double novoSalario) {
        if (novoSalario >= colaborador.salario) {

            colaborador.setCargo(cargo);
            colaborador.setSalario(novoSalario);

            totalPromovidos++;
            System.out.println(colaborador);
            System.out.println("Colaborador promovido");

        } else {
            System.out.println("\nOperação inválida");
        }
    }

    public String toString() {
        return String.format("" +
                        "\nTotal promovidos: %d"
                        + "\nTotal Salarios Reajustados: %d",
                totalPromovidos, totalSalariosReajustados);
    }

}
