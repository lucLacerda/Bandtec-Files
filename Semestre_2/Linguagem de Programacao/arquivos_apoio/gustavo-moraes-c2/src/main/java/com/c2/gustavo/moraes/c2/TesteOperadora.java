package com.c2.gustavo.moraes.c2;

public class TesteOperadora {
    
    public static void main(String[] args) {
        Plano plano1 = new Plano(1, "Claro internet");
        Plano plano2 = new Plano(2, "Claro pré");
    
        Operadora operadora = new Operadora("Claro");
        
        System.out.println(plano1);
        System.out.println(plano2);
        
        operadora.realizarVenda(plano1, 64.99);
        
        operadora.cadastrarQuantidadeDisponivel(plano1, 3);
        operadora.cadastrarQuantidadeDisponivel(plano2, 5);
        
        operadora.realizarVenda(plano1, 64.99);
        operadora.realizarVenda(plano2, 100.0, 20);
        
        System.out.println(plano1);
        System.out.println(plano2);
        
        System.out.println(operadora);
    }
}
