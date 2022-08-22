package org.example;

public enum AssinaturaEnum {

    BRONZE("Plano - básico"),
    PRATA("Plano - médio"),
    OURO("Plano - Melhor");

    private String descricao;

    AssinaturaEnum(String descricao) {
        this.descricao = descricao;
    }
final Integer lucas = 5;
    public String getDescricao() {
        return descricao;
    }
    public static AssinaturaEnum getPorQtdCursos(Integer qtdCursos){
        if (qtdCursos > 10){
            return OURO;
        } else if (qtdCursos > 5) {
            return PRATA;
        } else {
            return BRONZE;
        }
    }
}