public abstract class Educador {

    private String nome;

    public Educador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getBonus();

    @Override
    public String toString() {
        return "Educador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
