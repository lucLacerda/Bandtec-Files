/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

import java.util.Scanner;

/**
 *
 * @author lucas.lacerda@VALEMOBI.CORP
 */
public class Condicionais {

    public static void main(String[] args) {
        Integer numero = 42;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero maior que 42:");

        Integer numeroUsuario = input.nextInt();

        // IF
        if (numero <= numeroUsuario) {
            System.out.println("É maior");
        } else {
            System.out.println("Não é");
        }
        
        String nome1 = "matheus";
            
        
    }
}
