package com.mycompany.heranca;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    private String nome;
    private Integer vagas;
    
    private List<Desenvolvedor> lucas = new ArrayList<>();

    public Boolean existePorNome(String nome) {
        return true;
    }

    public void contratar(Desenvolvedor d) {

    }

    public Integer getQuantidadeDesenvolvedores() {
        return 0;
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        return 0;
    }

    public Double getTotalSalarios() {
        return 0.0;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        Desenvolvedor d = new Desenvolvedor("Lucas", 8, 10.000);
        return d;
    }

}
