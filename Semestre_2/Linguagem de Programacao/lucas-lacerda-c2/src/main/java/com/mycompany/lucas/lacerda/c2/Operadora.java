package com.mycompany.lucas.lacerda.c2;
// Autor: Lucas Lacerda
public class Operadora {

    String nome;
    Integer quantidadePlanosVendidos = 0;
    Integer quantidadeDescontosAplicados;

    void realizarVenda(Plano plano, Double valorVenda) {

        if (plano.getQuantidadeDisponivel() <= 0) {
            System.out.println("\nOperação inválida");

        } else {

            plano.setQuantidadeDisponivel(plano.getQuantidadeDisponivel() - 1);
            plano.setValorVenda(valorVenda);
            quantidadePlanosVendidos++;

        }
    }

    void cadastrarQuantidadeDisponivel(Plano plano, Integer quantidadeDisponivelCadastro) {
        plano.setQuantidadeDisponivel(plano.getQuantidadeDisponivel() + quantidadeDisponivelCadastro);

        System.out.println(String.format("A quantidade disponível do plano %s foi aumentada em %d", plano.nomePlano, plano.quantidadeDisponivel));
    }

}
