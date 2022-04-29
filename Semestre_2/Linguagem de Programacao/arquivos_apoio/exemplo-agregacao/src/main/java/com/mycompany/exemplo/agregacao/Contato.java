package com.mycompany.exemplo.agregacao;

public class Contato {

    private String nome;
    private String telefone;
    private Boolean bloquado;

    public Contato(String nome, String telefone, Boolean bloquado) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloquado = bloquado;
    }

    public void bloquear() {
        this.bloquado = true;
    }

    public void desbloquear() {
        this.bloquado = false;
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

    public Boolean getBloquado() {
        return bloquado;
    }

    public void setBloquado(Boolean bloquado) {
        this.bloquado = bloquado;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", bloquado=" + bloquado + '}';
    }
    

}
