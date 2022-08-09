public class Service implements Taxation {
    private final String description;
    private final Double price;

    public Service(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public Double getTax() {
        return price * 0.12;
    }
}
