package com.mycompany.projetobanco;

public class Pokemon {

    private Integer id;
    private String nome;
    private String tipo;

    public Pokemon(Integer id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pokemon() {}
    
    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + '}';
    }
    

}
