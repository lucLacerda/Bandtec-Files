package com.c2.gustavo.moraes.c2;

public class Operadora {
    private String nome;
    private Integer quantidadePlanosVendidos = 0;
    private Integer quantidadeDescontosAplicados = 0;

    public Operadora(String nome) {
        this.nome = nome;
    }
    
    
    public void realizarVenda(Plano plano, Double valorVenda) {
        if (plano.getQuantidadeDisponivel() >= 1) {
            quantidadePlanosVendidos++;
            
            plano.setQuantidadeDisponivel(plano.getQuantidadeDisponivel() -1);
            plano.setValorVenda(valorVenda);

            
            System.out.println("" +
                    "\nID: " + plano.getId() +
                    "\nNome: " + plano.getNomePlano() +
                    "\nQuantidade disponível: " + plano.getQuantidadeDisponivel() +
                    "\nValor: " + plano.getValorVenda());
        } else {
            System.out.println("\nOperação inválida");
        }
    }
    
    public void cadastrarQuantidadeDisponivel(Plano plano, Integer quantidadeCadastro) {
        plano.setQuantidadeDisponivel(quantidadeCadastro);
        System.out.println("\nA quantidade disponível do plano " + plano.getNomePlano() + " foi aumentada");
    }
    
    public void realizarVenda(Plano plano, Double valorVenda, Integer valorBonus) {
        if (plano.getQuantidadeDisponivel() >= 1) {
            quantidadePlanosVendidos++;
            quantidadeDescontosAplicados++;
            
            plano.setQuantidadeDisponivel(plano.getQuantidadeDisponivel() -1);
            plano.setValorVenda(valorVenda);
            
            Double valorDesconto = (valorBonus / 100.0) * valorVenda;
            Double valorPago = valorVenda - valorDesconto;
            
            System.out.println("\nRealizando venda com desconto:");
            
            System.out.println(
                    "\nID: " + plano.getId() +
                    "\nNome: " + plano.getNomePlano() +
                    "\nQuantidade disponível: " + plano.getQuantidadeDisponivel() +
                    "\nValor: " + plano.getValorVenda() +
                    "\nValor do desconto: " + valorPago);
        } else {
            System.out.println("\nOperação inválida");
        }
    }

    @Override
    public String toString() {
        return 
                "\nOperadora: " + nome + 
                "\nQuantidade de vendas: " + quantidadePlanosVendidos + 
                "\nDescontos aplicados: " + quantidadeDescontosAplicados;
    }
}
