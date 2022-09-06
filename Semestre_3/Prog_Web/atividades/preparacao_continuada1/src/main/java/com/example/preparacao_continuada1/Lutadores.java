package com.example.preparacao_continuada1;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Lutadores {
    String nome;
    int vida = 100;
    int forcaGolpe;
    int forcaDefesa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(int forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public int getForcaDefesa() {
        return forcaDefesa;
    }

    public void setForcaDefesa(int forcaDefesa) {
        this.forcaDefesa = forcaDefesa;
    }
}
