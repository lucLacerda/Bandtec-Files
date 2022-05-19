package com.mycompany.heranca;

public class Teste {
    public static void main(String[] args) {
        Consultoria tradeMap = new Consultoria("TradeMap", 10);

        Desenvolvedor lucas = new Desenvolvedor("Lucas", 8, 120.00);
        Desenvolvedor donilo = new Desenvolvedor("Donilo", 3, 150.00);
        Desenvolvedor jp = new Desenvolvedor("João Pedro", 10, 130.00);

        tradeMap.contratar(lucas);
        tradeMap.contratar(donilo);
        tradeMap.contratar(jp);

    }
}
