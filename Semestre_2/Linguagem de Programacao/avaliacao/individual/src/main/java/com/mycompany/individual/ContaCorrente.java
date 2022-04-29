package com.mycompany.individual;

public class ContaCorrente {

    private String nomeTitular;
    private Double saldo;

    public ContaCorrente(String nomeTitular, Double saldo) {
        this.nomeTitular = "";
        this.saldo = 0.0;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNome() {
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public void depositar(){
        getSaldo();
        
        
    }
}
