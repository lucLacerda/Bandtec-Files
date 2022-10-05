package exception;

import java.util.Scanner;

public class ExemploThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("nota 1");
            Double nota1 = scanner.nextDouble();
            if (nota1 < 0 || nota1 > 10.0) {
                throw new Exception("valor invalido");
            }

            System.out.println("nota 1");
            Double nota2 = scanner.nextDouble();
            if (nota2 < 0 || nota2 > 10.0) {
                throw new Exception("valor invalido");
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}