package com.mycompany.heranca;

public class Desenvolvedor {

    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    

    public Double getSalario() {
        Double calculoHoraTrabalhada = valorHoraTrabalhada * qtdHorasTrabalhadas;
        
        return calculoHoraTrabalhada;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" + "nome=" + nome + ", qtdHorasTrabalhadas=" + qtdHorasTrabalhadas + ", valorHoraTrabalhada=" + valorHoraTrabalhada + '}';
    }
}
