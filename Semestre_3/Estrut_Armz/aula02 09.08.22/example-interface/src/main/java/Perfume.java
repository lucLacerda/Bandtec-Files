public class Perfume extends Product {

    private final String fragrance;

    public Perfume(Integer code, String description, Double price, String scent) {
        super(code, description, price);
        this.fragrance = scent;
    }

    @Override
    public Double getTax() {
        return getPrice() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragrance='" + fragrance + '\'' +
                "} " + super.toString();
    }
}
