package com.mycompany.lucas.lacerda.c1;

import java.awt.BorderLayout;
import java.util.Scanner;

public class VendaLivro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo escritor! Realize o controle do lançamento"
                + "de seu livro: ");
        System.out.println("\nQuantidade de livros em estoque: ");
        Integer quantidadeEstoque = leitor.nextInt();

        System.out.println("\nMeta de venda dos livros (%): ");
        Integer metaVendaLivros = leitor.nextInt();
        Double metaVenda = metaVendaLivros / 100.00;

        Double calculoMetaDeVenda = metaVenda * quantidadeEstoque;
        System.out.println(
                String.format(
                        "\nPara atingir a meta, você precisa vender %.2f livros!",
                        calculoMetaDeVenda));

        Integer opcaoDigitada;

        do {
            System.out.println("\nEscolha os próximos passos: ");
            System.out.println("1- Vender Livros");
            System.out.println("2- Sair");
            opcaoDigitada = leitor.nextInt();

            switch (opcaoDigitada) {
                case 1:
                    if (quantidadeEstoque == 0) {
                        System.out.println("Operação inválida - Não existem "
                                + "tarefas pendentes!");
                        break;

                    } else {
                        System.out.println("\nDigite a quantidade de livros "
                                + "escolhida: ");
                        Integer quantidadeVenda = leitor.nextInt();

                        while (quantidadeVenda > quantidadeEstoque) {
                            System.out.println("\nInfelizmente você não possui"
                                    + " exemplares suficientes para a venda");
                            System.out.println(
                                    String.format("Quantidade disponivel: %d", quantidadeEstoque));
                            System.out.println("\nDigite uma quantidade válida:");
                            quantidadeVenda = leitor.nextInt();
                        }

                        for (int i = 1; i < quantidadeVenda + 1; i++) {
                            System.out.println(
                                    String.format("Vendendo %d° livro", i));
                        }

                        System.out.println(
                                String.format("\nVocê acabou de vender %d livros!",
                                        quantidadeVenda));
                        quantidadeEstoque = quantidadeEstoque - quantidadeVenda;

                        System.out.println(
                                String.format("Quantidade em estoque: %d", quantidadeEstoque));

                        System.out.println(String.format("Meta de vendas: %.2f",
                                calculoMetaDeVenda));
                    }
                    break;

                case 2:
                    System.out.println("Até logo");
                    break;

                default:
                    System.out.println("Número inválido");
            }

        } while (opcaoDigitada == 1);

        System.out.println("Foi um grande prazer");
    }
}
