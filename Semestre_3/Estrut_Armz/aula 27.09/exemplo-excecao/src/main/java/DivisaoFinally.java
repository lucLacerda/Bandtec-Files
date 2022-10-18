import javax.swing.*;

public class DivisaoFinally {
    public static void main(String[] args) {
        String snum1, snum2;
        snum1 = JOptionPane.showInputDialog("Digite um numero");
        snum2 = JOptionPane.showInputDialog("Digite outro numero");

        try {
            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);

            JOptionPane.showMessageDialog(null,
                    num1 / num2);
            System.out.println(num1 / num2);
        } catch (NumberFormatException |ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Digita um numero cacete! " + e,
                    "Errooooooo",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("Não dá pra dividir por zero, otário! " + e);
        } finally {
            JOptionPane.showMessageDialog(null,
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
