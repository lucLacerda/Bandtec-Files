package com.bandtec.lista.encapsulamento;

public class RecursosHumanos {

    //Atributos do RH
    private Integer totalPromovidos;
    private Integer totalReajustados;

    //Construtor, não preciso receber nenhum argumento
    //já que inicia tudo com 0
    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalReajustados = 0;
    }

    //Métodos = comportamentos de um RH
    public void reajustarSalario(Colaborador colab,
            Double valorReajuste) {
        totalReajustados++;

        Double novoSalario = colab.getSalario() + valorReajuste;

        colab.setSalario(novoSalario);

    }

    public void promoverColaborador(Colaborador colab,
            String novoCargo,
            Double novoSalario) {

        Double salarioAtual = colab.getSalario();
        if (salarioAtual < novoSalario) {
            totalPromovidos++;
            colab.setCargo(novoCargo);
            colab.setSalario(novoSalario);
        }else{
            System.out.println("Não tente pagar menos "
                    + "para o colaborador! ò_ó");
        }

    }

    //GET & SET já que os atributos são privados
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }    
    
    public Integer getTotalReajustados() {
        return totalReajustados;
    }


    @Override
    public String toString() {
        return "Relatório: \nRecursosHumanos{" + "totalPromovidos=" + totalPromovidos + ", totalReajustados=" + totalReajustados + '}';
    }

    
    
}
