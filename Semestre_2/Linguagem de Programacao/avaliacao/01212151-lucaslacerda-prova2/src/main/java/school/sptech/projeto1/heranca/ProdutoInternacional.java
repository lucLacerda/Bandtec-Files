package school.sptech.projeto1.heranca;

public class ProdutoInternacional extends Produto {

    public ProdutoInternacional(Integer id, String nome, String categoria, Double preco) {
        super(id, nome, categoria, preco);
    }

    @Override
    public Double getPreco() {
        return super.getPreco() + (super.getPreco() * 0.6);
    }
}
