import java.util.ArrayList;

public class Carrinho {
    private String cliente;
    public ArrayList<Produto> produtos{
        String
    };

    public Integer getQuantidade() {
        return null;
    }

    public void adicionar(Produto produto) {
        this.produtos.add(produto);
    }

    public Boolean existsPorNome(String nome) {
        return null;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        return null;
    }

    public void limpar() {
    }

    public void removerPorNome(String nome) {
    }

    /*
    public Produto getPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return produtos.get(i);
            }
        }
        return null;
    }


    public Double getValorTotal() {
        Double preco = 0.0;
        for (Produto produto : produtos) {
            preco += produto.getPreco();
        }
        return preco;
    }
*/
}
