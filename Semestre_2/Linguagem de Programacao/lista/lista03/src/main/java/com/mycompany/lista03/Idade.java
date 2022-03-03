package com.mycompany.lista03;

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        Integer idade = leitor.nextInt();
        
        util.classificaIdade(idade);
        
    }
    
}
