package com.bandtec.heranca.aluno;

public class Aluno {
    private Integer ra;
    protected String nome;
    protected String email;

    //Construtor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.email = "";
    }
    
    public Aluno(Integer ra, String nome, String email) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
    }
    
    //GET & SET
    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double calcularMedia(){
        return 10.0 + 10.0;
    }
    
    @Override
    public String toString() {
        return String.format("RA: %d \nNome: %s", ra, nome);
    }
    
}
