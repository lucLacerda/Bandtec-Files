public class AppTax {
    public static void main(String[] args) {
        Aliment aliment = new Aliment(558, "bananão", 10.0, 2);
        Perfume perfume = new Perfume(237, "flagrancia", 10.0, "menta");
        Service service = new Service("faculdade", 10.0);

        Tax tax = new Tax();

        tax.addTaxation(aliment);
        tax.addTaxation(perfume);
        tax.addTaxation(service);

        System.out.println(tax.calculateTotalTax());

        System.out.println(aliment.getTax());
        System.out.println(perfume.getTax());
        System.out.println(service.getTax());

        System.out.println(aliment.getTax() + perfume.getTax() + service.getTax());

    }
}
