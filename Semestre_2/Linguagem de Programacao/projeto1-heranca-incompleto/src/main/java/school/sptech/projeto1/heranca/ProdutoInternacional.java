package school.sptech.projeto1.heranca;

public class ProdutoInternacional extends Produto {
    public ProdutoInternacional(Integer id, String nome, String categoria, Double preco) {
        super(id, nome, categoria, preco);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public Double getPreco() {
        if (super.getPreco() > 0) {
            return super.getPreco() + (super.getPreco() * 0.6);

        } else return super.getPreco();
    }
}
