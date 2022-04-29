/*
Ex 5: Crie uma classe Java chamada “Calculadora” que:  

Seja executável (possui o método main). 
Solicite um número para o usuário(número real). 
Solicite outro número para o usuário(número real). 
Calcule e exiba a soma dos dois números digitados. 
Calcule e exiba a subtração do primeiro número pelo segundo. 
Calcule e exiba a multiplicação do primeiro número pelo segundo. 
Calcule e exiba a divisão do primeiro número pelo segundo.  

Exemplo:   

Digite um número: 
10 

Digite outro número: 
4 

Resultado da soma: 
14.0 

Resultado da subtração: 
6.0 

Resultado da multiplicação: 
40.0 

Resultado da divisão: 
2.5 
 */
package com.mycompany.lista01;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        // Add scanner
        Scanner leitorNumero = new Scanner(System.in);
        
        // Pegando os números
        System.out.println("Digite um número");
        Double numero1 = leitorNumero.nextDouble();
        
        System.out.println("Digite outro número");
        Double numero2 = leitorNumero.nextDouble();
        
        // Calcúlos
        Double soma = numero1 + numero2;
        Double subtracao = numero1 - numero2;
        Double multiplicacao = numero1 * numero2;
        Double divisao = numero1 / numero2;
        
        // Saída
        System.out.println(String.format
        ("Resultado da soma: \n %.1f "
        + "\n Resultado da subtração: \n %.1f"
        + "\n Resultado da multiplicação: \n %.1f"
        + "\n Resultado da divisão: \n %.1f",
        soma, subtracao, multiplicacao, divisao));
        
    }
    
}
