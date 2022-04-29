
package com.mycompany.agregacao.adsb;

public class App {

    public static void main(String[] args) {
        Contato c1 = new Contato("João","68645",false);
        Contato c2 = new Contato("Lucas","25615",false);
        
        Grupo g1 = new Grupo("Teste grupo");
        
        g1.adiciona(c2);
        g1.adiciona(c1);
        System.out.println(g1.getContatos());
        
    }
}
