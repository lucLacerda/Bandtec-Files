/*
Ex 7: Crie uma classe Java chamada “Elevador” que: 

Seja executável. 
Solicite ao usuário o limite de peso de um elevador (número real). 
Solicite ao usuário o limite de pessoas em um elevador (número inteiro). 
Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real). 
Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real). 
Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real).  

Ao final, exiba uma frase assim:  
"Entraram 3 pessoas no elevador, no qual cabem X pessoas. 
O peso total no elevador é de Y, sendo que ele suporta Z". 

(onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das 3 pessoas) 
*/
package com.mycompany.lista01;

import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args) {
        
        // Add scanner
        Scanner leitorNumero = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Digite o limite de peso do elevador");
        Double limitePeso = leitorNumero.nextDouble();
        
        System.out.println("Digite o limite de pessoas no elevador");
        Integer limitePessoa = leitorNumero.nextInt();
        
        System.out.println("Peso da primeira pessoa");
        Double peso1 = leitorNumero.nextDouble();
        
        System.out.println("Peso da primeira pessoa");
        Double peso2 = leitorNumero.nextDouble();
        
        System.out.println("Peso da primeira pessoa");
        Double peso3 = leitorNumero.nextDouble();
        
        // Soma peso
        Double totalPeso = peso1 + peso2 + peso3;
        
        // Saída
        System.out.println(String.format
        ("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. \n" +
        "O peso total no elevador é de %.2f, sendo que ele suporta %.2f",
                limitePessoa, totalPeso, limitePeso));
        
    }
    
}
