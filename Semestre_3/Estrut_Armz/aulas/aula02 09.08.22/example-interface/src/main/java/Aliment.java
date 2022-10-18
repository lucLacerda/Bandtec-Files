public class Aliment extends Product {
    private final Integer qtVitamin;

    public Aliment(Integer code, String description, Double price, Integer qtVitamin) {
        super(code, description, price);
        this.qtVitamin = qtVitamin;
    }

    @Override
    public Double getTax() {
        return getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "qtVitamin=" + qtVitamin +
                "} " + super.toString();
    }
}
