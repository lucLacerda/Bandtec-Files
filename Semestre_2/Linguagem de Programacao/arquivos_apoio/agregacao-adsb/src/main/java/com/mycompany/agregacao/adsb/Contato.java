
package com.mycompany.agregacao.adsb;

public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone, Boolean bloqueado) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = bloqueado;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
    public void bloquear(){
        setBloqueado(true);
    }
    
    public void desbloquear(){
        setBloqueado(false);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("nome: \n").append(nome);
        sb.append("telefone: \n").append(telefone);
        sb.append("bloqueado: \n").append(bloqueado);
        sb.append("\n");
        return sb.toString();
    }
    
}
