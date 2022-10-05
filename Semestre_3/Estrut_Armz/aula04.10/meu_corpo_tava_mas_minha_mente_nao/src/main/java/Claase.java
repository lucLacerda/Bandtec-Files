import java.util.Scanner;

public class Claase {

    public static Double divide(Double a, Double b) throws ArithmeticException{
        return a/b;
    };

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite uma nota");
            Double nota1 = leitor.nextDouble();

            System.out.println("Digite uma segunda nota");
            Double nota2 = leitor.nextDouble();

            System.out.println(nota1 + "/" + nota2 + "=" +
                    divide(nota1, nota2));
        }
        catch (ArithmeticException erro){
            System.out.println("Divisão por zero!");
            erro.printStackTrace();
        }
    }
}
