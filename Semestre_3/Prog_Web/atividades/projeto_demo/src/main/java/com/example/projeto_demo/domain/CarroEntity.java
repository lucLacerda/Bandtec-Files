package com.example.projeto_demo.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class CarroEntity {

    @Id  // do javax.persistence
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarro;
    @Length(min = 2, max = 12, message = "O modelo deverá ter no min 2, e no max 12 letras")
    @NotNull
    private String modelo;
    @ManyToOne
    @JoinColumn(name = "fabricante_id_fabricante") @NotNull
    private FabricanteVeiculosEntity fabricante;
    private LocalDate dataFabricacao = LocalDate.now();
    @Min(1960) @Max(2021) @NotNull
    private int anoFabricacao;
    @NotNull
    private double potenciaMotor;

    public Integer getIdCarro() {
        return idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public FabricanteVeiculosEntity getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteVeiculosEntity fabricante) {
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
