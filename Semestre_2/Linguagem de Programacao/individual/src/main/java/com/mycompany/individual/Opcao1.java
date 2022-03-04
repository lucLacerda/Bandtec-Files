package com.mycompany.individual;

import java.util.Scanner;

public class Opcao1 {

    void Prazo() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor do Celular: ");
        Double precoTotal = leitor.nextDouble();

        System.out.println("Informe a quantidade de parcelas que quer pagar: ");
        Integer parcelas = leitor.nextInt();

        System.out.println("Tem juros? ");
        System.out.println("1 - Sim ");
        System.out.println("2 - Não ");

        Double temJuros = leitor.nextDouble();
        Double valorJuros = 1.0;
        Integer parcelaJuros = 0;

        if (temJuros == 1) {
            System.out.println("A partir de qual parcela?");
            parcelaJuros = leitor.nextInt();

            if (parcelas >= parcelaJuros) {
                System.out.println("De quantos % ?");
                valorJuros = leitor.nextDouble() / 100;
                
                Double calculo1 = ((precoTotal * valorJuros) + precoTotal) / parcelas;
               
            }
        } else {
            System.out.println("Opa, que maravilha");
        }
        System.out.println("Calculando...\n");

        Double calculo1 = (precoTotal / parcelas) * parcelaJuros;
        Double calculo2 = precoTotal - calculo1;
        Double calculo3 = calculo2 * parcelaJuros + precoTotal;

//        Integer calculo1 = parcelas - parcelaJuros;
//
//        Double calculo2 = precoTotal * valorJuros * parcelaJuros / parcelaJuros;
//
//        Double calculo3 = precoTotal / calculo1;
//
//        Double calculo4 = calculo2 + calculo3;

        System.out.println("Analisando...\n");
        System.out.println("Finalizando...\n");

//        System.out.println(calculo1);
//        System.out.println(calculo2);
//        System.out.println(calculo3);

        System.out.println(String.format("Cada parcela sairá por volta de: %.2f", calculo1));

    }

}
