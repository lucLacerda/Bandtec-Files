
package exemplo.agregacao;


public class Produto {
     //ATRIBUTOS PRIVADOS
    private String nome;
    private String categoria;
    private Double preco;
    
    //CONSTRUTOR 

    public Produto(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
  
    
    //METODOS DE ACESSO GET AND SET 

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    
    //TOSTRING 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("nome=").append(nome);
        sb.append(", categoria=").append(categoria);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}