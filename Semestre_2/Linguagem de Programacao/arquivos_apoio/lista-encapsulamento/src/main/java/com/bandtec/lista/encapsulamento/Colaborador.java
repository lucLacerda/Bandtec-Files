package com.bandtec.lista.encapsulamento;

public class Colaborador {
    //declarando atributos como privados
    //Só essa classe acessa diretamente
    private String nome;
    private String cargo;
    private Double salario;
    
    // Construtor que recebe nome e cargo
    //Aqui o salário começa zerado 0
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }

    //Sobrecarga do construtor
    //aqui o salário começa com o que foi informado no momento do new
    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    //get e set é o que vai permitir acessar os atributos fora da classe
    //já que agora eles são privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if(salario > 0){            
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return "Colaborador{" + "nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
   
    
}
