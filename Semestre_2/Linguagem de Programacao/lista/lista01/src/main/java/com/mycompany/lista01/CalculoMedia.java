/*
Ex 8: Crie uma classe Java chamada "CalculoMedia" que: 

Seja executável 
Solicite o nome e duas notas ao usuário. 
As notas são números reais. 
Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript) 

Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA" 
Use Interpolação com 1 casa decimal para a média. 
*/
package com.mycompany.lista01;

import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        
        // Add scanners
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Digite seu nome");
        String nome = leitorTexto.nextLine();
        
        System.out.println("Digite uma nota");
        Double nota1 = leitorNumero.nextDouble();
        
        System.out.println("Digite outra nota");
        Double nota2 = leitorNumero.nextDouble();
        
        // Calcúlo
        Double media = (nota1 + nota2) / 2;
        
        // Saída
        System.out.println(String.format
        ("Olá, %s. Sua média foi de %.1f", nome, media));
        
    }
    
}
