public abstract class Product implements Taxation {
    private final Integer code;
    private final String description;
    private final Double price;

    public Product(Integer code, String description, Double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product {" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", tax=" + getClass() +
                '}';
    }
}
