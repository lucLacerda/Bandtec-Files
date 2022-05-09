public class Pokemon {
    String nome;
    String tipo;
    Double forca;
    Integer doces = 0;

    public Pokemon(String nome, String tipo, Double forca, Integer doces) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    @Override
    public String toString() {
        return String.format("""
               \n
               Pokemon: %s
                  Tipo: %s
                 Forca: %.2f
                 Doces: %d""", nome, tipo, forca, doces);
    }
}
