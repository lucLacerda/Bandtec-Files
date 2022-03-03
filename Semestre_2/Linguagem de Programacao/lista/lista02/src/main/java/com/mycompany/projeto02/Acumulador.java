package com.mycompany.projeto02;

import java.util.Scanner;

public class Acumulador {
    
    public static void main(String[] args) {
        
        Scanner leitorTexto = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitorTexto.nextInt();
        Integer soma = 0;
        
        while (numeroDigitado != 0) {
            soma += numeroDigitado;
            System.out.println("Errou! Tente novamente:");
            numeroDigitado = leitorTexto.nextInt();
        }
        
        System.out.println(String.format("A soma dos números sortados foi %d", soma));
        
    }
    
}
