package com.mycompany.heranca;

public class DesenvolvedorMobile extends Desenvolvedor {

    private Integer qtdHorasTrabalhadas;
    private Double valorHoraTrabalhada;

    @Override
    public Double getSalario() {
        return super.getSalario() + getSalario();
    }

}
