package com.mycompany.projeto02;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um número entre 0 e 10:");
        Integer numeroDigitado = leitorNumero.nextInt();
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer vezes;
        
        for (vezes = 0; !Objects.equals(numeroDigitado, numeroSorteado); vezes++) {
            System.out.println(String.format("Errou! o número soteado era: %d", numeroSorteado));
            numeroDigitado = leitorNumero.nextInt();
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
        }
        
        if (vezes <= 3) {
            System.out.println("Você é muito sortudo");
        }else if (vezes <= 10) {
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
    }
    
}
