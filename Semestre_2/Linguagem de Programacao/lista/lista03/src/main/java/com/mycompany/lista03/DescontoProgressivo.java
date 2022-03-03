package com.mycompany.lista03;

import java.util.Scanner;

public class DescontoProgressivo {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo!"
                + "\n\nDigite o valor unitário do produto:");
        Double valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Integer quantidade = leitor.nextInt();
        
        util.desconto(valor, quantidade);
    }
    
}
