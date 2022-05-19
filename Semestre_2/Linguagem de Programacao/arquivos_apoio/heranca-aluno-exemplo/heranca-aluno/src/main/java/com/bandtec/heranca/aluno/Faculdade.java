
package com.bandtec.heranca.aluno;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome, List<Aluno> alunos) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }

    
}
