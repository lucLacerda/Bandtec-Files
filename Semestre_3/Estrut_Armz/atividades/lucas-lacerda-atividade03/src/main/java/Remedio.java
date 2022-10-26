public class Remedio {
    private int idadeMinIndicada;
    private String nome;
    private Double preco;
    private int estoque;
    private String marca;

    public Remedio(int idadeMinIndicada, String nome, Double preco, int estoque, String marca) {
        this.idadeMinIndicada = idadeMinIndicada;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.marca = marca;
    }

    public int getIdadeMinIndicada() {
        return idadeMinIndicada;
    }

    public void setIdadeMinIndicada(int idadeMinIndicada) {
        this.idadeMinIndicada = idadeMinIndicada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setTipoDeUso(int estoque) {
        this.estoque = estoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Remedio{");
        sb.append("idadeMinIndicada=").append(idadeMinIndicada);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", estoque=").append(estoque);
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
