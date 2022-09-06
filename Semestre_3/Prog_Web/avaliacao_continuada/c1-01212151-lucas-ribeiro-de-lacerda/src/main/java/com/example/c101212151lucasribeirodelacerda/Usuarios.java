package com.example.c101212151lucasribeirodelacerda;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Usuarios {
    private String usuario;
    private String senha;
    private String nome;
    private Boolean isAutenticado = false;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean validarSenha(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        }
        return false;
    }
    public Boolean isAutenticado() {
        return isAutenticado;
    }

    public void setAutenticado(boolean isAutenticado) {
        this.isAutenticado = isAutenticado;
    }
}
