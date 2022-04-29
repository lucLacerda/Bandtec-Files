package com.mycompany.projeto02;

public class NumerosPares {
    
    public static void main(String[] args) {
        
        Integer cont = 0;
        while (cont <= 40) {            
            cont++;
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
        }
        
    }
    
}
