/*
Ex 1: No país “Quisito” existe um benefício social chamado "Bolsa Filhos". 

Crie uma classe Java que: 
Solicite ao usuário quantos filhos de 0 a 3 anos possui. 
Solicite ao usuário quantos filhos de 4 a 16 anos possui. 
Solicite ao usuário quantos filhos de 17 a 18 anos possui. 
Calcule o valor da Bolsa, sendo que o governo paga: 

 
* R$25,12 por filhos com menos de 4 anos  
* R$15,88 por filhos entre 4 e 16 anos  
* R$12,44 por filhos entre 17 e 18 anos 

Exiba uma frase como esta:  
"Você tem um total de T filhos e vai receber R$B de bolsa"
Use interpolação com 2 casas decimais para o valor da bolsa
 */
package com.mycompany.lista01;

import java.util.Scanner;

public class BolsaFilhos {

    public static void main(String[] args) {
        
        // Add scanner
        Scanner leitorFilhos = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Quantos filhos de 0 a 3 anos?");
        Integer filhosNovo = leitorFilhos.nextInt();

        System.out.println("Quantos filhos de 4 a 16 anos?");
        Integer filhosMedio = leitorFilhos.nextInt();

        System.out.println("Quantos filhos de 17 e 18 anos?");
        Integer filhosVelho = leitorFilhos.nextInt();
        
        // Calcúlos
        Double bolsaNovo = filhosNovo * 25.12;
        Double bolsaMedio = filhosMedio * 15.88;
        Double bolsaVelho = filhosVelho * 12.44;

        Double totalBolsa = bolsaNovo + bolsaMedio + bolsaVelho;
        Integer totalFilho = filhosNovo + filhosMedio + filhosVelho;
        
        // Saída
        System.out.println(String.format("Você tem um total de %s filhos e vai receber R$%.2f de bolsa.",
                 totalFilho, totalBolsa));

    }

}
