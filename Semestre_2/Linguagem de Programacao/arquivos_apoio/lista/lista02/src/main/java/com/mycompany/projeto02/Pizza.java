package com.mycompany.projeto02;

import java.util.Scanner;

public class Pizza {
    
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer queijo = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println
            ("Digite seu voto (5 = mussarela, 25 = calabresa, 50 = 4 queijos:");
            Integer voto = leitorNumero.nextInt();
            
            if (voto == 5) {
                mussarela++;
            }
            if (voto == 25) {
                calabresa++;
            }
            if (voto == 50) {
                queijo++;
            }
            
        }
        
        if (mussarela > calabresa && mussarela > queijo) {
            System.out.println(String.format
            ("O resultado foi: \n "
            + "%d votos em mussarela; \n"
            + "%d votos em calabresa; \n"
            + "%d votos em 4 queijos; \n"
            + "O sabor favorito é: Mussarela", mussarela, calabresa, queijo));
        }
        
        if (calabresa > mussarela && calabresa > queijo) {
            System.out.println(String.format
            ("O resultado foi: \n "
            + "%d votos em mussarela; \n"
            + "%d votos em calabresa; \n"
            + "%d votos em 4 queijos; \n"
            + "O sabor favorito é: Calabresa", mussarela, calabresa, queijo));
        }
        
        if (queijo > mussarela && queijo > calabresa) {
            System.out.println(String.format
            ("O resultado foi: \n "
            + "%d votos em mussarela; \n"
            + "%d votos em calabresa; \n"
            + "%d votos em 4 queijos; \n"
            + "O sabor favorito é: 4 queijos", mussarela, calabresa, queijo));
        }
    }
    
}
