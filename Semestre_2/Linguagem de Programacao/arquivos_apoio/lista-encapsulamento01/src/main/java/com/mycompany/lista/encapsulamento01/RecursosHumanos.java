/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento01;

public class RecursosHumanos {

    private Integer totalReajustados;
    private Integer totalPromovidos;

    public RecursosHumanos(Integer totalReajustados, Integer totalPromovidos) {
        this.totalReajustados = 0;
        this.totalPromovidos = 0;
    }

    public void reajustarSalario(Colaborador colab, Double valorReajuste) {
        Double novoSalario = colab.getSalario() + valorReajuste;

        colab.setSalario(novoSalario);

        totalReajustados++;
    }

    public void promoverColaborador(Colaborador colab, String novoCargo, Double novoSalario) {

        if (colab.getSalario() < novoSalario) {
            colab.setCargo(novoCargo);
            colab.setSalario(novoSalario);
            totalPromovidos++;
            
        } else {
            System.out.println("O novo salario deve ser maior do que salario atual");
        }
    }

    public Integer getTotalReajustados() {
        return totalReajustados;
    }

    public void setTotalReajustados(Integer totalReajustados) {
        this.totalReajustados = totalReajustados;
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

}
