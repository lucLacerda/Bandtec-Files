package com.mycompany.lista03;

import java.util.Scanner;

public class NumeroPrimo {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();
        
        while (numeroDigitado > 0) {            
            util.verificarPrimo(numeroDigitado);
            
            System.out.println("Digite um número:");
            numeroDigitado = leitor.nextInt();
            
        }
        
    }
    
}
