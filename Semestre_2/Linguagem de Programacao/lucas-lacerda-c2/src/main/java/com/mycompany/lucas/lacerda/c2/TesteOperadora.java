package com.mycompany.lucas.lacerda.c2;
// Autor: Lucas Lacerda
public class TesteOperadora {

    public static void main(String[] args) {

        Plano prePago = new Plano(1, "Pre pago");
        Plano posPago = new Plano(2, "Pos pago");

        Operadora vivo = new Operadora();

        System.out.println(prePago.toString());
        System.out.println(posPago.toString());

        vivo.realizarVenda(prePago, 29.99);

        vivo.cadastrarQuantidadeDisponivel(prePago, 10);
        vivo.cadastrarQuantidadeDisponivel(posPago, 15);

        vivo.realizarVenda(prePago, 29.99);
        vivo.realizarVenda(posPago, 49.99);

        System.out.println(prePago);
        System.out.println(posPago);

        System.out.println(vivo);

    }
}
