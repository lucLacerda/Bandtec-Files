package com.mycompany.individual;

import java.util.Scanner;

public class ProjetoIndividual {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero correspondente a sua opção: ");
        System.out.println("1 - Calcule se parcelar vale a pena");
        System.out.println("2 - Custo X Beneficio");
        System.out.println("4 - Encerrar Programa");

        Integer opcaoDigitada;

        do {
            System.out.println("Digite o número correspodente a opção");
            opcaoDigitada = leitor.nextInt();

            switch (opcaoDigitada) {
                case 1:
                    System.out.println("Você selecionou a opção A Prazo\n"
                            + "Vamos lá: ");
                    Opcao1 funcao1 = new Opcao1();
                    funcao1.Prazo();
                    break;

                case 2:
                    System.out.println("Você selecionou a opção Custo x Beneficio!\n"
                            + "Vamos lá: ");
                    Opcao2 funcao2 = new Opcao2();
                    funcao2.CustoBeneficio();
                    break; 
                    
                case 3: 
                    System.out.println("Ainda em análise");
                    break;
                    
                case 4:
                    System.out.println("Foi um prazer tê-lo conosco, volte logo!");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
            }
        } while (opcaoDigitada != 1 && opcaoDigitada != 2 && opcaoDigitada != 3 && opcaoDigitada != 4);

    }
}
