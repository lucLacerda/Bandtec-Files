/*
Ex 6: Crie uma classe Java que ajude Chicó a saber quanto será seu salário líquido. 

A classe deve ser executável 
O programa solicita o salário bruto 
O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto 
O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto 
O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho.  
O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de condução ida x 2 x 22. 
Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT 

Exiba, usando interpolação e com os valores numéricos com 2 casas decimais, uma frase como esta:  
"Seu salário bruto é R$A, tem um total de R$B em descontos e receberá um líquido de R$C"
 */
package com.mycompany.lista01;

import java.util.Scanner;

public class Chicó {

    public static void main(String[] args) {
        
        // Add scanner
        Scanner leitorNumero = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Insira seu salário bruto");
        Double salBruto = leitorNumero.nextDouble();
        
        System.out.println("Qual o valor da passagem só de ida");
        Double valorPassagem = leitorNumero.nextDouble();
        
        // Calcúlos
        Double descINSS = salBruto * 0.1;
        Double descIR = salBruto * 0.2;
        Double descPassagem = valorPassagem * 2 * 22;
        
        Double totalDesc = descINSS + descIR + descPassagem;
        Double liquido = salBruto - totalDesc;
        
        // Saída
        System.out.println(String.format
        ("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e "
        + "receberá um líquido de R$%.2f", salBruto, totalDesc, liquido));
        
        
    }
    
}
