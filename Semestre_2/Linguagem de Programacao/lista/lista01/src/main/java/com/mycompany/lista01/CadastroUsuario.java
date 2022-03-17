/*
Ex 2: Crie uma classe Java chamada "CadastroUsuario" que: 
 
Seja executável 
Solicite o login do cliente 
Solicite a senha do cliente 
Solicite a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio 
Exiba uma frase como esta: "Seu login é L e sua senha é S. Você tem T tentativas antes de ser bloqueado"  
Use interpolação 
 */
package com.mycompany.lista01;

import java.util.Scanner;

public class CadastroUsuario {
    
    public static void main(String[] args) {
        
        // Add scanner
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Login");
        String login = leitorTexto.nextLine();
        
        System.out.println("Senha");
        String senha = leitorTexto.nextLine();
        
        System.out.println("Quantas tentativas até bloquear?");
        Integer vezes = leitorNumero.nextInt();
        
        // Saída
        System.out.println(String.format
            ("Seu login é %s e sua senha é %s. "
                + "Você tem %d tentativas antes de ser bloqueado"
                    , login, senha, vezes));
    }
    
}
