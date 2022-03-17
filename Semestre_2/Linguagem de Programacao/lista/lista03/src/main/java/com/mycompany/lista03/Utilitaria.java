package com.mycompany.lista03;

public class Utilitaria {
    
    Double calcularMedia(Double nota1, Double nota2){
        Double media = (nota1 * 0.4) + (nota2 * 0.6);
        return media;
    }
    
    Double calcRenda(Double renda){
        Double salMin = renda / 1100;
        return salMin;
    }
    
    String classeSocial(Double renda){
        String classe;
        
        if (renda >= 20900.01) {
            classe = "A";
        }else if (renda >= 10450.01) {
            classe = "B";
        }else if (renda >= 4180.01) {
            classe = "C";
        }else if (renda >= 2090.01) {
            classe = "D";
        }else {
            classe = "E";
        }
        return classe;
    }
    
    void classificaIdade(Integer idade) {
        if (idade >= 0 && idade <= 2) {
            System.out.println("Bebê");
        }
        else if (idade >= 3 && idade <= 11) {
            System.out.println("Criança");
        }
        else if (idade >= 12 && idade <= 19) {
            System.out.println("Adolescente");
        }
        else if (idade >= 20 && idade <= 30) {
            System.out.println("Jovem");
        }
        else if (idade >= 31 && idade <= 60) {
            System.out.println("Adulto");
        }
        else if (idade >= 61) {
            System.out.println("Idoso");
        }
        else {
            System.out.println("Número Inválido");
        }   
    }
    
    void desconto(Double valor, Integer quantidade){
        System.out.println("-".repeat(40));
        System.out.println(String.format
            ("Valor do Produto: R$%.2f"
                + "\nQuantidade: %d", valor, quantidade));
        System.out.println("-".repeat(40));
        
        Double desconto;
        
        if (quantidade == 1) {
            desconto = 0.1;
        }else if (quantidade == 2) {
            desconto = 0.2;
        }else if (quantidade >= 3) {
            desconto = 0.3;
        }else{
            desconto = 1.0;
        }
        
        Double valorTotal = valor * quantidade;
        Double valorFinal = valorTotal - (valorTotal*desconto);
        System.out.println(String.format("Valor com desconto: R$%.2f", valorFinal));
    }
    
    Double calculaPesoIdeal(String genero, Double altura){
        Double pesoIdeal = 0.0;
        
        switch (genero) {     
            case "m":         
                pesoIdeal = (72.7 * altura) - 58;
                break;
            case "f":
                pesoIdeal = (62.1 * altura) - 44.7;
                break;
        }
        return pesoIdeal;
    }
    
    void  verificarPrimo(Integer numeroDigitado){
        Integer vezes = 0;
        for (int i = 1; i <= numeroDigitado; i++) {
            if (numeroDigitado % i == 0) {
                vezes++;
            }
        }
        if (vezes == 2) {
            System.out.println("Número primo");
        } else {
            System.out.println("Número não é primo");
        }
        
    }
    
}
