package com.mycompany.heranca;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    private String nome;
    private Integer vagas = 0;
    List<Desenvolvedor> listDesenvolvedores = new ArrayList<>();

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
    }

    public Boolean existePorNome(String nome) {
        for (Desenvolvedor desenvolvedor : listDesenvolvedores) {
            if (desenvolvedor.nome == nome) {
                return true;
            }
        }
        return false;
    }

    public void contratar(Desenvolvedor desenvolvedor) {
        if (listDesenvolvedores.size() < vagas) {
            listDesenvolvedores.add(desenvolvedor);
            System.out.printf("\n Novo contradado \n" + desenvolvedor);
        } else {
            System.out.printf("Ta cheio campeao");
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        return listDesenvolvedores.size();
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer count = 0;
        for (Desenvolvedor desenvolvedor : listDesenvolvedores) {
            if (desenvolvedor instanceof DesenvolvedorMobile) {
                count ++;
            }
        }
        return count;
    }

    public Double getTotalSalarios() {
        Double countSalarios = 0.0;
        for (Desenvolvedor desenvolvedor : listDesenvolvedores) {
            countSalarios += desenvolvedor.getSalario();
        }
            return countSalarios;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        for (Desenvolvedor desenvolvedor : listDesenvolvedores) {
            if (desenvolvedor.nome == nome) {
                return desenvolvedor;
            }
        }
        return null;
    }
}
