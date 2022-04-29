package com.mycompany.lista.encapsulamento;

public class RecursosHumanos {

    Integer totalPromovidos;
    Integer totalSalariosReajustados;

    public void reajustarSalario(Colaborador colaborador, Double reajusteSalario) {
        colaborador.setSalario(colaborador.getSalario() + reajusteSalario);
        totalSalariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador, String cargo, Double novoSalario) {
        if (novoSalario >= colaborador.salario) {

            colaborador.setCargo(cargo);
            colaborador.setSalario(novoSalario);

            totalPromovidos++;

        } else {
            System.out.println("Operação inválida");
        }
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" + "totalPromovidos=" + totalPromovidos + ", totalSalariosReajustados=" + totalSalariosReajustados + '}';
    }

}
