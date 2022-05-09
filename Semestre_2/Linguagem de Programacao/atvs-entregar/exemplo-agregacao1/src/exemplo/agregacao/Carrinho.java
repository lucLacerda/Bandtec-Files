package exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

  

    //Metodos 
    public Integer getQuantidade() {
        return produtos.size(); //tamanho da lista 
    }

    //Adionar a lista
    public void adiciona(Produto iphone7) {
        this.produtos.add(iphone7);

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    //Verificar a lista 
    public Boolean existsPorNome(String nome) {

        //for (Produto produto : produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return true;
            }

        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        return produtos.size(); //tamanho da lista 
    }

    //Limpar
    public void limpar(Produto produtos) {
        this.produtos.clear();
    }

    public void removePornome(Produto produtos) {
        this.produtos.remove(produtos);

    }

    public void getRemovePorNome(String nome) {
        for (int i = 0; i < 10; i++) {
            if (this.produtos.get(i).getNome().equals(nome)) {

            }

        }
    }

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
}

