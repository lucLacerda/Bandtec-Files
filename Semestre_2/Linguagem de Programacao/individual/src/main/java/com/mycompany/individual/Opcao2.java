package com.mycompany.individual;

import java.util.Scanner;

public class Opcao2 {

    void CustoBeneficio() {
        System.out.println("A marca do celular é: " + Marca());
        System.out.println("A marca do celular é: " + Armazenamento();

    }
    
    String Marca() {
        System.out.println("Qual a marca dele?");
        System.out.println("1 - Samgung");
        System.out.println("2 - Motorola");
        System.out.println("3 - Apple");
        System.out.println("4 - Asus");
        Scanner leitor = new Scanner(System.in);

        Integer marca;
        
        String marcaCelular = null;

        do {
            System.out.println("Digite o número correspodente a opção");
            marca = leitor.nextInt();

            switch (marca) {
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
        } while (marcaCelular == null );
        
        return marcaCelular;
    }
    
    String Armazenamento() {
        System.out.println("Quanto ele tem de armazenamento interno?");
        System.out.println("1 - 256Gb");
        System.out.println("2 - 128Gb");
        System.out.println("3 - 64Gb");
        System.out.println("4 - 32Gb");
        
        return "batata";
    }
}
