public abstract class FuncionarioComBonus implements Bonificavel{
    private String nome;

    public FuncionarioComBonus(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "FuncionarioComBonus{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
