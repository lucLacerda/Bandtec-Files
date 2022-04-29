/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento01;

public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador colab1 = new Colaborador("Huk", "Dev", 20000.00);
        Colaborador colab2 = new Colaborador("Giuliana", "Dev");

        RecursosHumanos rh = new RecursosHumanos(10,35);
        
        System.out.println(colab1);
        System.out.println(colab2);
        
        rh.promoverColaborador(colab1, "Senior", 5000.00);

    }
}
