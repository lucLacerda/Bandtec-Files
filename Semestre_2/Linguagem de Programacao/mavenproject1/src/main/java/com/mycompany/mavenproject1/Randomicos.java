package br.com.sptech.projeto02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {
        
        // Math.random();
        
        // Podemos gerar aleatorios com o objeto random
        // da classe Random
        Random random = new Random();
        
        Integer numeroGerado =
                ThreadLocalRandom.current().nextInt(0, 200);
        
        System.out.println("" + numeroGerado);
        
        
    }   
}