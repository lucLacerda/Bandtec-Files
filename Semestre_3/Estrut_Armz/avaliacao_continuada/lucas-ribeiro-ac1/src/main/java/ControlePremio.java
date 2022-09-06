import java.util.ArrayList;
import java.util.List;

public class ControlePremio {

    List<Clube> clubeList = new ArrayList<>();

    public void addClubes(Clube clube) {
        clubeList.add(clube);
    }

    public Integer totalPremiacao() {
        Integer premioTotal = 0;
        for (Clube clube : clubeList) {
            premioTotal += clube.getPremio();
        }
        return premioTotal;
    }

}
