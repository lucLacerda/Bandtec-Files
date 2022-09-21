public class Remedio {
    private int id = 10;
    private int idadeMinIndicada;
    private String nome;
    private Double preco;
    private String tipoDeUso;

    public Remedio(int idadeMinIndicada, String nome, Double preco, String tipoDeUso) {
        this.idadeMinIndicada = idadeMinIndicada;
        this.nome = nome;
        this.preco = preco;
        this.tipoDeUso = tipoDeUso;
    }

    public int getId() {
        return id++ ;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUso(String tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Remedio{");
        sb.append("id=").append(id);
        sb.append(", idadeMinIndicada=").append(idadeMinIndicada);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", tipoDeUso='").append(tipoDeUso).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
