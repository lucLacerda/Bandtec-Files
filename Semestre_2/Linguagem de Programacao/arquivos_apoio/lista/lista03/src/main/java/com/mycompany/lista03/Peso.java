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

/*
Escreva o método calculaPesoIdeal, que recebe o sexo (caractere ‘M’ ou ‘F’) e a 
altura de uma pessoa (em metros). 

Este método deverá calcular e exibir o peso ideal dessa pessoa. Escreva também o
método main, que solicita que o usuário digite os valores correspondentes a 
pessoas diferentes e chame o método calculaPesoIdeal para exibir o peso ideal de 
cada uma delas. 

A fórmula para calcular o peso ideal é:

Para mulheres: (62.1 * altura) – 44.7
Para homens: (72.7 * altura) - 58

*/