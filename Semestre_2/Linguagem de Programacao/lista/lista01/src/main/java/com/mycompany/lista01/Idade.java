/*
Ex 9: Crie uma classe Java chamada “Idade” que:  
 
Seja executável.  
Solicite que o usuário digite o seu nome.  
Em seguida, o programa deverá exibir a mensagem:
“Olá, Fulano! Qual o ano de seu nascimento?”. 

Depois, o programa deverá exibir:
“Em 2030 você terá 25 anos” (sendo "Fulano" o nome digitado pelo usuário e "xx" a idade do usuário). 

Exemplo: 
Qual é o seu nome?
Maria
Olá, Maria! Qual o ano de seu nascimento?
1995
Em 2030 você terá 35 anos. 
 
 */
package com.mycompany.lista01;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        
        // Add scanners
        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Digite seu nome");
        String nome = leitorTexto.nextLine();
        
        System.out.println(String.format
        ("Olá, %s! Qual o ano de seu nascimento?", nome));
        Integer ano = leitorNumero.nextInt();
        
        // Calcúlo
        Integer idade = 2030 - ano;
        
        // Saída
        System.out.println(String.format("Em 2030 você terá %d anos", idade));
        
    }
    
}
