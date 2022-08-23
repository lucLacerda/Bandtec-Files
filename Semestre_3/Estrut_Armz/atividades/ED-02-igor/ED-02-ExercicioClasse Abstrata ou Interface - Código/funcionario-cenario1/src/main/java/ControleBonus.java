import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<FuncionarioComBonus> funcionarios;

    public ControleBonus() {
        this.funcionarios = new ArrayList<>();
    }

    public void add(FuncionarioComBonus funcionario) {
        if (funcionarios.indexOf(funcionario) != -1) return;
        funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado");
    }

    public Double totalBonus() {
        if (funcionarios.size() == 0) return null;

        double total = 0.0;
        for (FuncionarioComBonus funcionario:
             funcionarios) {
            total += funcionario.getBonus();
        }
        return total;
    }
}
