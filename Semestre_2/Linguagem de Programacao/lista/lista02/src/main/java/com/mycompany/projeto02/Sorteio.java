package com.mycompany.projeto02;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 100:");
        Integer numeroDigitado = leitorNumero.nextInt();
        
        Integer numeroSorteado;
        Integer primeiraVez = 0;
        Integer par = 0;
        Integer impar = 0;
        
        for (int i = 1; i <= 200; i++) {
            numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
            
            if (Objects.equals(numeroSorteado, numeroDigitado) 
                    && primeiraVez == 0) {
                primeiraVez = i;
            }
            
            if (numeroSorteado % 2 == 0) {
                par++;
            }
            
            if (numeroSorteado % 2 != 0) {
                impar++;
            }
        }
        
        if (primeiraVez == 0) {
            System.out.println(String.format
        ("Seu número não foi sorteado, "
                + "foram sortados %d números pares e %d números imparers",
                par, impar));
        }
        
        if (primeiraVez != 0) {
            System.out.println(String.format
        ("Seu número foi sorteado na %d vez, "
                + "foram sortados %d números pares e %d números imparers",
                primeiraVez, par, impar));
        }
        
    }
    
}
//Crie uma classe chamada “Sorteio” que: 
//
//Solicite um número de 1 a 100.
//Realize 200 sorteios. 
//Ao final, exibir:
//    Quando o número foi sorteado (pela 1ª vez, apresente o número do sorteio).
//
//    Quantos números pares foram sorteados.
//
//    Quantos números ímpares foram sorteados.