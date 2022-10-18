import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Funcionario> funcionarioList;

    public Empresa() {
        funcionarioList = new ArrayList();
    }

    public void adicionarFunc(Funcionario f) {
        funcionarioList.add(f);
    }

    public void exibirTodos() {
        if (funcionarioList.isEmpty()) {
            System.out.println("Contrate urgentemente, 0 funcionarios");
        }
        System.out.println("Lista de Funcionarios:");
        for (Funcionario f : funcionarioList) {
            System.out.println(f);
        }
    }

    public void exibirTotalSalario() {
        Double total = 0.0;
        for (Funcionario f : funcionarioList) {
            total += f.calcSalario();
        }

    }

    public void exibeHorista() {
        if (funcionarioList.isEmpty()) {
            System.out.println("Contrate urgentemente, 0 funcionarios");
        }
        System.out.println("Lista de Funcionarios:");
        for (Funcionario f : funcionarioList) {
            System.out.println(f instanceof Horista ? f : "");
        }
    }


}
