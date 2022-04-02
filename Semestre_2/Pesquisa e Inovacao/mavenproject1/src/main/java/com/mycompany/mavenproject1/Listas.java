package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(1);
        numerosInteiros.add(10);
        numerosInteiros.add(100);
        numerosInteiros.add(1000);

        for (Integer numeroInteiro : numerosInteiros) {
            System.out.println(numeroInteiro);
        }

        Animacao a1 = new Animacao("Shrek", 2001);
        Animacao a2 = new Animacao("Toy Story", 1995);
        Animacao a3 = new Animacao("Pucca", 2004);
        Animacao a4 = new Animacao("Carros", 2006);
        Animacao a5 = new Animacao("Branca de Neve", 2006);

        List<Animacao> animacoes = new ArrayList<>();
        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(a3);
        animacoes.add(a4);
        animacoes.add(a5);

        for (Animacao animacao : animacoes) {
            System.out.println(animacao);
        }
        
    }
}
