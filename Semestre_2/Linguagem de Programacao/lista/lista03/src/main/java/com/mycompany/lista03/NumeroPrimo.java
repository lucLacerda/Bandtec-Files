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

/*
Crie uma classe Java e escreva um método chamado verificarPrimo, que recebe um 
número inteiro e exibe se esse número é ou não primo (Dica: para saber se o 
número é primo, veja quantos divisores o número tem, ou seja, verifique se ele é 
divisível por 1, por 2, por 3, etc. até ele próprio, e conte quantos divisores 
são. Se o número de divisores for 2, então ele é primo.) Escreva o método main 
que solicita que o usuário digite vários valores positivos e chame o método 
verificaPrimo para exibir se o número lido é primo ou não. O programa deve 
encerrar quando o usuário digitar um valor negativo. 
*/