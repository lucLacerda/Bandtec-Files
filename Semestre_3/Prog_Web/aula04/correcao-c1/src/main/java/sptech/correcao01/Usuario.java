package sptech.correcao01;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Usuario {

    private String usuario;

    private String senha;
    private String nome;
    private boolean autenticado;

    public boolean autenticar(String usuario, String senha) {
        autenticado = usuario.equals(this.usuario) && senha.equals(this.senha);
        return autenticado;
    }

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

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
}
