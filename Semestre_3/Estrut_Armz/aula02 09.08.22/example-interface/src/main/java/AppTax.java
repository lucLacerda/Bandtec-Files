import java.lang.annotation.Repeatable;

public class AppTax {
    public static void main(String[] args) {
        Aliment aliment = new Aliment(558, "bananão", 10.0, 2);
        Perfume perfume = new Perfume(237, "flagrancia", 10.0, "menta");
        Service service = new Service("faculdade", 10.0);

        Tax tax = new Tax();

        tax.addTaxation(aliment);
        tax.addTaxation(perfume);
        tax.addTaxation(service);

        System.out.println("\n");
        System.out.println("Imposto do alimento: " + aliment.getTax());
        System.out.println("-".repeat(30));
        System.out.println("Imposto do perfume: " + perfume.getTax());
        System.out.println("-".repeat(30));
        System.out.println("Imposto do serviço: " + service.getTax());
        System.out.println("-".repeat(30));
        System.out.println("Calculo do imposto total: " + tax.calculateTotalTax());


    }
}
