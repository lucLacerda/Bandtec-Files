package sptech.projetojpadtoquery.resposta;

public class MotoristaSimplesResponse {
    private int id;
    private String nome;

    public MotoristaSimplesResponse(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
