package br.com.sptech.projeto02;

import java.awt.BorderLayout;
import java.util.Scanner;

public class NovaCondicao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//        System.out.println("Digiti um número: ");

//        Integer numeroDigitado = leitor.nextInt();

//        switch (numeroDigitado) {
//            case 1:
//                System.out.println("Domingou...");
//                break;
//            case 2:
//                System.out.println("Segundou...");
//                break;
//            case 3:
//                System.out.println("Terçou...");
//                break;
//            case 4:
//                System.out.println("Quartou...");
//                break;
//            case 5:
//                System.out.println("Quintou...");
//                break;
//            case 6:
//                System.out.println("Sextou");
//                break;
//            default:
//                System.out.println("Numero inválido");
//                break;
//             
//        }
        System.out.println("Digite o ranking 1, 2, ou 3: ");

        Integer numeroEscolhido = leitor.nextInt();

        switch (numeroEscolhido) {
            case 1:
                System.out.println("Ganhou uma beterraba");
            case 2:
                System.out.println("Ganhou uma garrafa de agua bonafont");
            case 3:
                System.out.println("Ganhou uma escavadeira invisivel");
                break;
            default:
                System.out.println("Ganhou um Joaquin Phoenix");
        }
    }
}
