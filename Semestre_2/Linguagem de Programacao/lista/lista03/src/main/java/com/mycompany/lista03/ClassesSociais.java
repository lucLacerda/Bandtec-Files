package com.mycompany.lista03;

import java.util.Scanner;

public class ClassesSociais {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
     
        System.out.println("Digite sua renda:");
        Double renda = leitor.nextDouble();
        
        Double salarios = util.calcRenda(renda);
        
        
        System.out.println(String.format
        ("Você recebe aproximadamente %.1f salários mínimo", salarios));
        
        String classe = util.classeSocial(renda);
        
        System.out.println(String.format
        ("Você pertence a classe social: %s", classe));
    }
    
}
