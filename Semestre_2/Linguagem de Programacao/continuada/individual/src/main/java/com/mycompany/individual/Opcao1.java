package com.mycompany.individual;

import java.util.Scanner;

public class Opcao1 {

    void Prazo() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme o valor do Celular: ");
        Double precoTotal = leitor.nextDouble();

        System.out.println("\nInforme a quantidade de parcelas que quer pagar: ");
        Integer parcelas = leitor.nextInt();

        System.out.println("\nTem juros? ");
        System.out.println("1 - Sim ");
        System.out.println("2 - Não ");

        Double temJuros = leitor.nextDouble();
        Double valorJuros = 1.0;

        if (temJuros == 1) {
            System.out.println("\nDe quantos % ?");
            valorJuros = leitor.nextDouble() / 100;

        } else {
            System.out.println("Opa, que maravilha");

        }

        System.out.println("\nCalculando...\n");

        Double calculoJuros = precoTotal * valorJuros;
        Double calculoParcelas = (calculoJuros + precoTotal) / parcelas;

        System.out.println("Analisando...\n");

        System.out.println("Finalizando...\n");

        System.out.println(String.format("Cada parcela sairá por volta de: %.2f", calculoParcelas));
        System.out.println(String.format("Valor dos juros: %.2f\n", calculoJuros));

        if (calculoJuros >= 50) {
            System.out.println("Não está compensando!");
        }

    }

}
