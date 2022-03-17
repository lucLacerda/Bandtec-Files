package com.mycompany.projeto.poo;

public class App {

    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente();
        
        ContaCorrente conta2 = new ContaCorrente();
        
        conta1.titular = "Huk";
        conta1.saldo = 0.00;

        conta2.titular = "Lucas";
        conta2.saldo = 4.00;


        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);

    }
}
