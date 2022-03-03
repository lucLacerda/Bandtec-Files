package com.mycompany.lista03;

import java.util.Scanner;

public class Peso {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite seu genero(m ou f):");
        String genero = leitor.nextLine();
        
        System.out.println("Digite sua altura:");
        Double altura = leitorNumero.nextDouble();
        
        Double pesoIdeal = util.calculaPesoIdeal(genero, altura);
        
        System.out.println(String.format("Seu peso ideal é %.2f", pesoIdeal));
        
    }
    
}
