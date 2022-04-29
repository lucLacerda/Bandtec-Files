
package br.com.sptech.projeto02;

import java.util.Scanner;

/*
 
@author Lucas Lacerda

*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitorUser = new Scanner (System.in);
        Scanner leitorPassword = new Scanner (System.in);

        
        Boolean verificacaoUsuario = false;
        Boolean verficacaoSenha = false;

        
        do {
            System.out.println("Informe seu usúario: ");
                String loginDigitado = leitorUser.nextLine();
            System.out.println("Informe sua senha: ");
                String senhaDigitada = leitorPassword.nextLine();
            
            if (loginDigitado.equals("admin") && senhaDigitada.equals("#Bandtec")) {
                verificacaoUsuario = true;
                verficacaoSenha = true;
            } else {
                System.out.println("Login e/ou senha inválidos. Tente novamente...");
            }
        } while (!verificacaoUsuario || !verficacaoSenha );
        
        System.out.println("Login realizado com sucesso");  
    }
         
}
/*
Elaborar um programa java que simule a autenticação de um usuário em um sistema. Solicite o nome de usuário e senha.

Enquanto o nome for diferente de “admin” e a senha for diferente de “#Bandtec” exiba: “Login e/ou senha inválidos” e solicite novamente.

Caso o usuário digite os campos corretamente, exiba: “Login realizado com sucesso”

*/