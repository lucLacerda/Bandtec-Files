package sptech.projeto02;

import java.util.UUID;

public class Investimento {

    private UUID id = UUID.randomUUID();
    private String nome;
    private Double minimo;
    private Double jurosAnuais;
    private boolean aberto;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getMinimo() {
        return minimo;
    }

    public Double getJurosAnuais() {
        return jurosAnuais;
    }

    public boolean isAberto() {
        return aberto;
    }
}
