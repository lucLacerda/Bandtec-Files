package com.mycompany.lista03;

import java.util.Scanner;

public class ClassesSociais {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
     
        System.out.println("Digite sua renda:");
        Double renda = leitor.nextDouble();
        
        Double salarios = util.calcRenda(renda);
        
        
        System.out.println(String.format
        ("Você recebe aproximadamente %.1f salários mínimo", salarios));
        
        String classe = util.classeSocial(renda);
        
        System.out.println(String.format
        ("Você pertence a classe social: %s", classe));
    }
    
}

/*
Você foi contratado(a) para criar um software para ajudar o IBGE(Instituto 
Brasileiro de Geografia e Estatística) a identificar qual a classe social que um
determinado entrevistado pertence através da sua renda mensal.

Para exibir corretamente a classe social do indivíduo, utilize a tabela abaixo 
como referência:



Crie uma classe chamada ClassesSociais.
Solicite a renda para o usuário.
Crie um método que calcule e devolva a quantidade de salários mínimo a pessoa 
ganha aproximadamente.
Crie outro método que identifique e devolva qual classe a pessoa pertence.
Exiba as informações ao final da execução, exemplo:


Obs* considere o valor do salário mínimo: R$1.100
*/