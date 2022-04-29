package com.mycompany.lista03;

import java.util.Scanner;

public class DescontoProgressivo {
    
    public static void main(String[] args) {
        
        Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo!"
                + "\n\nDigite o valor unitário do produto:");
        Double valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Integer quantidade = leitor.nextInt();
        
        util.desconto(valor, quantidade);
    }
    
}

/*
Um supermercado criou promoção onde comprando 1 produto o desconto será de 10%, 
2 produtos 20% e 3 ou mais produtos 30%. Para implementar o calculo da promoção 
no sistema de caixa, crie uma classe chamada “DescontoProgressivo”, que:

Solite o valor unitário de um determinado produto e a quantidade .
Contenha um método chamado calcularDesconto, que recebe o valor e quantidade, e 
retorna o valor final com desconto.
Contenha um método chamado exibirNotaFiscal, que possui o seguinte retorno. 
Exemplo de saída no console:


*/