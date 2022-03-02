package com.mycompany.individual;

import java.util.Scanner;

public class Opcao1 {

    void Prazo() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor do Celular: ");
        Double precoTotal = leitor.nextDouble();

        System.out.println("Informe a quantidade de parcelas que quer pagar: ");
        Double parcelas = leitor.nextDouble();

        System.out.println("Tem juros? ");
        System.out.println("1 - Sim ");
        System.out.println("2 - Não ");

        Double temJuros = leitor.nextDouble();

        if (temJuros == 1) {
            System.out.println("A partir de qual parcela?");
            Double parcelaJuros = leitor.nextDouble();

            if (parcelas >= parcelaJuros) {
                System.out.println("De quantos % ?");
                Double valorJuros = leitor.nextDouble();
            }
        } else {
            System.out.println("Opa, que maravilha");
        }
        System.out.println("Calculando...\n");
        Double calculo = precoTotal / parcelas;
        System.out.println("Analisando...\n");
        System.out.println("Finalizando...\n");

        System.out.println(String.format("Resultado: %.2f", calculo));

    }

}
