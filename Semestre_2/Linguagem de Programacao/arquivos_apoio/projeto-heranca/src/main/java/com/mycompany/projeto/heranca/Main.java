
package com.mycompany.projeto.heranca;

public class Main {
    public static void main(String[] args) {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(7, "Lucas", 8.0, 8.8);
        
        Aluno aluno = new Aluno(8, "lucas");
        
        System.out.println(alunoGraduacao.getNome());
        
    }
}
