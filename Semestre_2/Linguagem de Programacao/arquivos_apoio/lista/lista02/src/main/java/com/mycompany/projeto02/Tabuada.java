package com.mycompany.projeto02;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitorNumero.nextInt();
        
        Integer tabuada;
        
        for (int i = 0; i <= 10; i++) {
            tabuada = numeroDigitado * i;
            
            System.out.println(String.format
            ("%d X %d = %d", numeroDigitado, i, tabuada));
            
        }
        
    }
    
}
