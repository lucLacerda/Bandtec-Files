public class Operadora {
    private String nome;
    private Integer quantidadePlanosVendidos = 0;
    private Integer quantidadeDescontosAplicados = 0;

    public Operadora(String nome) {
        this.nome = nome;
    }

    public void realizarVenda(Plano plano, Double valorVenda) {
        if (plano.getQuantidadeDisponível() >= 1) {
            quantidadePlanosVendidos++;
            plano.setQuantidadeDisponível(plano.getQuantidadeDisponível() - 1);
        } else {
            System.out.println("\nOperação inválida");
        }
    }

    public void realizarVendaComDesconto(Plano plano, Double valorVenda, Integer descontoInformado) {

        if (plano.getQuantidadeDisponível() >= 1) {
            Double valorDesconto = (descontoInformado / 100.0) * valorVenda;
            Double valorTotal = valorDesconto - descontoInformado;
            quantidadePlanosVendidos++;
            quantidadeDescontosAplicados++;
            plano.setQuantidadeDisponível(plano.getQuantidadeDisponível() -1);

            System.out.println("" +
                    "\nRealizando venda com desconto\n" +
                    "\n\nID: " + plano.getId() +
                    "\nNome: " + plano.getNomePlano() +
                    "\nQuantidade Disponível: " + plano.getQuantidadeDisponível() +
                    "\nValor: " + valorTotal +
                    "\nValor do desconto: " + valorDesconto);
        } else {
            System.out.println("Operação inválida");
        }
    }

    public void cadastrarQuantidadeDisponivel(Plano plano, Integer quantidade) {
        plano.setQuantidadeDisponível(quantidade);
        System.out.println("A quantidade disponível do plano " + plano.getNomePlano() + " foi aumentada.");
    }

    @Override
    public String toString() {
        return
                "\nOperadora: " + nome +
                "\nQuantidade de Vendas: " + quantidadePlanosVendidos +
                "\nDescontos aplicados: " + quantidadeDescontosAplicados;
    }
}
