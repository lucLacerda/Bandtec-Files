/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

     
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class operadores {
 
   
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
       
        String nomeDigitado = leitor.nextLine();
        String nome = "diego";
       
        System.out.println("Olá, " + nomeDigitado);
       
       
        if (nomeDigitado == nome) {
            System.out.println("Bem vindo criador");
        } else {
            System.out.println("Você não é meu criador ");
        }
       
       
       
    }

   
}