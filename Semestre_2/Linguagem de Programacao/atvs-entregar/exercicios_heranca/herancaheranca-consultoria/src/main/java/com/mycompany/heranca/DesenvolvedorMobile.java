package com.mycompany.heranca;

public class DesenvolvedorMobile extends Desenvolvedor {

    private Integer qtdHorasTrabalhadas;
    private Double valorHoraTrabalhada;

    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada, Integer qtdHorasTrabalhadas1, Double valorHoraTrabalhada1) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas1;
        this.valorHoraTrabalhada = valorHoraTrabalhada1;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + getSalario();
    }

}
