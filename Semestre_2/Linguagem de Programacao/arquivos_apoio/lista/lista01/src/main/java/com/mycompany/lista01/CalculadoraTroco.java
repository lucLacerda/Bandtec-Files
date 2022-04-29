/*
Ex 4: Crie uma classe  Java chamada “CalculadoraTroco” que: 

Seja executável. 
Solicite o valor unitário de um produto. 
Solicite a quantidade vendida. 
Solicite o valor pago pelo cliente. 
Calcule e exiba o troco com a seguinte frase:
"Seu troco será de R$ X", onde "X" é o valor a ser devolvido ao cliente.
*/
package com.mycompany.lista01;

import java.util.Scanner;


public class CalculadoraTroco {
    
    public static void main(String[] args) {
        
        // Add scanner
        Scanner leitorNumero = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Valor unitário");
        Double valor = leitorNumero.nextDouble();
        
        System.out.println("Quantidade vendida");
        Integer quantidade = leitorNumero.nextInt();
        
        System.out.println("Valor pago");
        Double pago = leitorNumero.nextDouble();
        
        // Calcúlos
        Double valorTotal = valor * quantidade;
        Double trocoTotal = pago - valorTotal;
        
        // Sáida
        System.out.println(String.format("Seu troco será de R$ %.2f", trocoTotal));
 
    }
    
}
