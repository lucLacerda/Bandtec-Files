package com.mycompany.projeto02;

import java.util.Scanner;

public class Login {
    
    public static void main(String[] args) {
        
        Scanner leitorLogin = new Scanner(System.in);
        Scanner leitorSenha = new Scanner(System.in);
        
        System.out.println("Digite o login: ");
        String login = leitorLogin.nextLine();
        
        System.out.println("Digite a senha: ");
        String senha = leitorSenha.nextLine();
        
        while (!("admin".equals(login) && "#Bandtec".equals(senha))) {            
            System.out.println("Login e/ou senha inválidos");
            
            System.out.println("Digite o login: ");
            login = leitorLogin.nextLine();
        
            System.out.println("Digite a senha: ");
            senha = leitorSenha.nextLine();
        }
        
        System.out.println("Login realizado com sucesso");
        
    }
    
}
