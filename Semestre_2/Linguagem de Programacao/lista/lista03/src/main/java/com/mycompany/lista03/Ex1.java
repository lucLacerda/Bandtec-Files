package com.mycompany.lista03;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite uma nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite outra nota:");
        Double nota2 = leitor.nextDouble();
        
        Double media = util.calcularMedia(nota1, nota2);
        String frase = "A média foi de: %.2f";
        System.out.println(String.format(frase, media));
    }
    
}
