public abstract class Product implements Salable {

    private Integer code;
    private Double priceCost;

    public Product(Integer code, Double priceCost) {
        this.code = code;
        this.priceCost = priceCost;
    }

    @Override
    public Double getValueSale() {
        return null;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", priceCost=" + priceCost +
                '}';
    }
}
