package com.mycompany.lista03;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite uma nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite outra nota:");
        Double nota2 = leitor.nextDouble();
        
        Double media = util.calcularMedia(nota1, nota2);
        String frase = "A média foi de: %.2f";
        System.out.println(String.format(frase, media));
    }
    
}

/*
Crie uma classe Java e escreva um método chamado calcularMedia, que recebe duas 
notas e retorna a média das notas, como é calculada a média da Faculdade Bandtec 
(nota1 * 0.4 + nota2 * 0.6). No método main, solicite que o usuário digite 2 
notas, chame o método calcularMedia passando as notas digitadas como argumento 
e exiba o valor retornado pelo método. 
*/