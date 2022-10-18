import java.util.ArrayList;
import java.util.List;

public class Tax {
    List<Taxation> listTaxation;

    public Tax() {
        this.listTaxation = new ArrayList<>();
    }

    public void addTaxation(Taxation taxation) {
        listTaxation.add(taxation);
    }

    public double calculateTotalTax() {
        double total = 0;
        for(Taxation taxation : listTaxation) {
            total += taxation.getTax();
        }
        return total;
    }
}
