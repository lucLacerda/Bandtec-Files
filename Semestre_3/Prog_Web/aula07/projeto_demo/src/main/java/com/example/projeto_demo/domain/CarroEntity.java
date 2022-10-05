package com.example.projeto_demo.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class CarroEntity {

    @Id  // do javax.persistence
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarro;
    private String modelo;
    private String fabricante;
    private LocalDate dataFabricacao;
    private int anoFabricacao;
    private double potenciaMotor;

    public Integer getIdAnime() {
        return idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}
