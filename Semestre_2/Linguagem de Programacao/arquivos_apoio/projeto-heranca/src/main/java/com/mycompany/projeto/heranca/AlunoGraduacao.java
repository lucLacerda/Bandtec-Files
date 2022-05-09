
package com.mycompany.projeto.heranca;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(Integer ra, String nome, Double continuada, Double notaIntegrada) {
        super(ra, nome);
        this.continuada = continuada;
        this.notaIntegrada = notaIntegrada;
    }
        
    private Double continuada;
    private Double notaIntegrada;

    public Double getContinuada() {
        return continuada;
    }

    public void setContinuada(Double continuada) {
        this.continuada = continuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }
    
    
    
}
