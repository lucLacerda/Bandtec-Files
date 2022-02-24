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
public class PassagemMetro {

    public static void main(String[] args) {
        
        String usuario = "Lucas";
        Double saldo = 250.5;
        Double calculo = saldo / 4.40;
        
        
        System.out.println(String.format("Olá %s, você ainda pode usar o metro %d vezes", usuario, calculo.intValue()));
             
    }
}
