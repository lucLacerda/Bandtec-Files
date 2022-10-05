package sptech.projeto02;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cantores {

    @JsonIgnore
    private String senha;
    private int id;
    private String nome;
    private String categoria;
    private Integer cache;
    private boolean constaNoSpotify;

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getCache() {
        return cache;
    }

    public boolean isConstaNoSpotify() {
        return constaNoSpotify;
    }

    public void setId(int id) {
        this.id = id;
    }
}
