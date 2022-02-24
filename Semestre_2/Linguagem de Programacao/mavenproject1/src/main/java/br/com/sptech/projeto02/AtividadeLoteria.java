
package br.com.sptech.projeto02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AtividadeLoteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe um número de 0 a 10, e teste sua sorte:");
        
        Integer numeroDigitado = leitor.nextInt();
        Integer contadorVezes = 0;
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        
        while (numeroDigitado != numeroSorteado) {
            System.err.println("Errou :( ... o numéro sorteado era: " + numeroSorteado);
            numeroDigitado = leitor.nextInt();
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            contadorVezes++;
        }
        
        if (contadorVezes < 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (contadorVezes >= 4 && contadorVezes <= 10) {
            System.out.println("Você é sortudo");
        } else {     
           System.out.println("É melhor você parar de apostar e ir trabalha");
        }
        
        System.out.println("Você tentou: " + contadorVezes + " vezes");
    }
}

// Desenrolado por: Lucas Lacerda