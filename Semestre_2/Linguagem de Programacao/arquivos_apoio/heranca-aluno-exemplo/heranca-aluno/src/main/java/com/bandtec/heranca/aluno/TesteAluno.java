package com.bandtec.heranca.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(123, "José");
        AlunoGraduacao a2 = new AlunoGraduacao(10.0, 10.0, 234, "Maria");

        // System.out.println(a1);
        // System.out.println(a2);
        List<Aluno> alunos = new ArrayList();

        alunos.add(a1);
        alunos.add(a2);

        System.out.println(alunos);

        Faculdade facul = new Faculdade("bandtec", alunos);

        facul.matricularAluno(a1);
        facul.matricularAluno(a2);

        System.out.println(facul);

        if (a2 instanceof AlunoGraduacao) {
            System.out.println("É um aluno de graduação");
        }
        
        final Aluno a3 = new AlunoGraduacao(10.0, 10.0, 10, "Lucas");
               
    }
}
