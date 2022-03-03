package com.mycompany.individual;

import java.util.Scanner;

public class Opcao2 {

    Scanner leitor = new Scanner(System.in);

    void CustoBeneficio() {

        Integer armazenamento = Armazenamento();
        Integer memoria = Memoria();
        Integer custo = Custo();

        if (custo > 3000) {
            if (armazenamento == 256) {
                if (memoria == 8) {
                    System.out.println("Custo Beneficio está ok");
                } else {
                    System.out.println("Não ta compensando não");
                }
            } else {
                System.out.println("Não ta compensando não");
            }
        } else if (custo <= 3000 && Custo() > 1500) {
            if (armazenamento == 128 || armazenamento == 64) {
                if (memoria == 6 || memoria == 4) {
                    System.out.println("Custo Beneficio tá bão");
                } else {
                    System.out.println("Não ta compensando não");
                }
            } else {
                System.out.println("Não ta compensando não");
            }
        } else if (custo <= 1500) {
            if (armazenamento == 64 || armazenamento == 32) {
                if (memoria == 4) {
                    System.out.println("Custo Beneficio da pra melhorar");
                } else {
                    System.out.println("Não ta compensando não");
                }
            } else {
                System.out.println("Não ta compensando não");
            }
        }

    }

    String Marca() {
        System.out.println("Qual a marca dele?");
        System.out.println("1 - Samgung");
        System.out.println("2 - Motorola");
        System.out.println("3 - Apple");
        System.out.println("4 - Asus");

        Integer opcaoMarca;

        String marcaCelular = null;

        do {
            System.out.println("Digite o número correspodente a opção");
            opcaoMarca = leitor.nextInt();

            switch (opcaoMarca) {
                case 1:
                    marcaCelular = "Samsung";
                    break;

                case 2:
                    marcaCelular = "Motorola";
                    break;

                case 3:
                    marcaCelular = "Apple";
                    break;

                case 4:
                    marcaCelular = "Asus";
                    break;

                default:
                    System.out.println("Informe uma opção válida!");

            }
        } while (marcaCelular == null);

        return marcaCelular;
    }

    Integer Armazenamento() {
        System.out.println("Quanto ele tem de armazenamento interno?");
        System.out.println("1 - 256Gb");
        System.out.println("2 - 128Gb");
        System.out.println("3 - 64Gb");
        System.out.println("4 - 32Gb");

        Integer opcaoArmazenamento;

        Integer armazenamentoInterno = null;

        do {
            System.out.println("Digite o número correspodente a opção");
            opcaoArmazenamento = leitor.nextInt();

            switch (opcaoArmazenamento) {
                case 1:
                    armazenamentoInterno = 256;
                    break;

                case 2:
                    armazenamentoInterno = 128;
                    break;

                case 3:
                    armazenamentoInterno = 64;
                    break;

                case 4:
                    armazenamentoInterno = 32;
                    break;

                default:
                    System.out.println("Informe uma opção válida!");

            }
        } while (armazenamentoInterno == null);

        return armazenamentoInterno;
    }

    Integer Memoria() {
        System.out.println("Quanto ele tem de Memoria RAM?");
        System.out.println("1 - 8Gb");
        System.out.println("2 - 6Gb");
        System.out.println("3 - 4Gb");

        Integer opcaoMemoria;

        Integer memoriaRam = null;

        do {
            System.out.println("Digite o número correspodente a opção");
            opcaoMemoria = leitor.nextInt();

            switch (opcaoMemoria) {
                case 1:
                    memoriaRam = 8;
                    break;

                case 2:
                    memoriaRam = 6;
                    break;

                case 3:
                    memoriaRam = 4;
                    break;

                default:
                    System.out.println("Informe uma opção válida!");

            }
        } while (memoriaRam == null);

        return memoriaRam;
    }

    Integer Custo() {
        System.out.println("Quanto ele custa atualmente? (Arredonde os centavos)");
        Integer custoCelular = leitor.nextInt();

        return custoCelular;
    }

}
