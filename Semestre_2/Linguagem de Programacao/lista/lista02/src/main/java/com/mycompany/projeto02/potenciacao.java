package com.mycompany.projeto02;

import java.util.Scanner;

public class potenciacao {
 
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Número base:"); 
        Integer base = leitorNumero.nextInt();
        
        System.out.println("Número expoente:");
        Integer expoente = leitorNumero.nextInt();
        
        Integer total = base * base;
        
        for (int i = 2; i < expoente; i++) {
            total = total * base;
        }
        
        System.out.println(String.format("Resultado: %d", total));
        
    }
    
}
