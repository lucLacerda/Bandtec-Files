/*
Ex 3: Chicó começou a se exercitar e deseja saber quantas calorias vai perder nos exercícios. 

Crie uma classe Java que: 
Seja executável 
Solicite ao usuário o tempo, em minutos (valor inteiro) que ele passou se aquecendo 
Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios aeróbicos (correr, andar, pedalar etc) 
Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios de musculação  
Calcule quantas calorias o Jorge perdeu, sendo que:
* cada minuto de aquecimento faz perder 12 calorias
* cada minuto de ex aeróbico faz perder 20 calorias
* cada minuto de musculação faz perder 25 calorias 
Exiba, usando interpolação e apenas valores numéricos inteiros, uma frase como esta:  

"Olá, Jorge. Você fez um total de X minutos de exercícios e perdeu cerca de Y calorias".
 */
package com.mycompany.lista01;

import java.util.Scanner;

public class CalcCalorias {

    public static void main(String[] args) {
        
        // Add scanner
        Scanner leitorNumero = new Scanner(System.in);
        
        // Pegando informações
        System.out.println("Tempo de aquecimento");
        Integer aquecimento = leitorNumero.nextInt();
        
        System.out.println("Tempo de aeróbico");
        Integer aerobico = leitorNumero.nextInt();
        
        System.out.println("Tempo de musculação");
        Integer musculacao = leitorNumero.nextInt();
        
        // Calcúlos
        Integer caloriaAqueceimento = aquecimento * 12;
        Integer caloriaAerobico = aerobico * 20;
        Integer caloriaMusculacao = musculacao * 25;
        
        Integer totalTempo = aquecimento + aerobico + musculacao;
        Integer totalCaloria = caloriaAqueceimento + caloriaAerobico + caloriaMusculacao;
        
        // Saída
        System.out.println(String.format
            ("Olá, Jorge. Você fez um total de %d minutos de exercícios e "
                    + "perdeu cerca de %d calorias", totalTempo, totalCaloria));
        
    }
    
}
