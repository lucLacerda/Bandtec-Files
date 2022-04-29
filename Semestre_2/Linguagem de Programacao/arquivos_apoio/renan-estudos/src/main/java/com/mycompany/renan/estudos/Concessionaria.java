package com.mycompany.renan.estudos;

/*
 * @author renan.silva@VALEMOBI.CORP
 */
public class Concessionaria {

    private String nome;
    private Integer qtdVeiculosVendidos;
    private Integer qtdDescontoAplicado;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.qtdVeiculosVendidos = 0;
        this.qtdDescontoAplicado = 0;
    }

    public void realizarVenda(Veiculo veiculoInformado, Double valorVenda) {
        if (veiculoInformado.getQtdEstoque() < 1) {
            System.out.println("\nOperação inválida!");
        } else {

            veiculoInformado.setValorVenda(valorVenda);
            qtdVeiculosVendidos++;
            veiculoInformado.setQtdEstoque(veiculoInformado.getQtdEstoque() - 1);
//            System.out.println("\nRealizando venda sem desconto:");
//            System.out.println(veiculoInformado);
            System.out.println(String.format("\nRealizando venda sem desconto:\n"
                    + "ID: %d\n"
                    + "Modelo: %s\n"
                    + "Valor de tabela: R$%.2f",
                    veiculoInformado.getId(), veiculoInformado.getModelo(), valorVenda));
        }
    }

    public void realizarVenda(Veiculo veiculoInformado, Double valorVenda, Double valorDesconto) {
        if (veiculoInformado.getQtdEstoque() < 1) {
            System.out.println("\nOperação inválida!");
        } else {

            veiculoInformado.setValorVenda(valorVenda);
            qtdVeiculosVendidos++;
            qtdDescontoAplicado++;
            veiculoInformado.setQtdEstoque(veiculoInformado.getQtdEstoque() - 1);
            Double valorBonus = (valorDesconto / 100) * valorVenda;
            Double valorTotal = valorVenda - valorBonus;

            System.out.println("\n" + veiculoInformado + "\n\n");
            System.out.println(String.format("-".repeat(25)
                    + "\nValor da venda: R$%.2f"
                    + "\nValor do desconto: R$%.2f\n"
                    + "-".repeat(25)
                    + "\nValor final: R$%.2f",
                    valorVenda, valorBonus, valorTotal));
        }
    }

    public void cadastrarEstoque(Veiculo veiculoInformado, Integer qtdInsertEstoque) {
        veiculoInformado.setQtdEstoque(veiculoInformado.getQtdEstoque() + qtdInsertEstoque);
        System.out.println(String.format("\n\nO estoque do carro %s foi alterado!", veiculoInformado.getModelo()));
    }

    @Override
    public String toString() {
        return String.format("\nConcessionária: %s\n"
                + "Quantidade de vendas: %d\n"
                + "Descontos aplicados: %d",
                nome, qtdVeiculosVendidos, qtdDescontoAplicado);
    }

}
