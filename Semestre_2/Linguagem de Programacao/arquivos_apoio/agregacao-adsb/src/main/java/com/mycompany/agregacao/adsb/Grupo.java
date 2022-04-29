
package com.mycompany.agregacao.adsb;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }
    
    public void adiciona(Contato cont){
        contatos.add(cont);
    }
    
    public void remove(Contato cont){
        contatos.remove(cont);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grupo{\n");
        sb.append("nome=\n").append(nome);
        sb.append(", contatos=\n").append(contatos);
        sb.append('}');
        return sb.toString();
    }
    
    
}
