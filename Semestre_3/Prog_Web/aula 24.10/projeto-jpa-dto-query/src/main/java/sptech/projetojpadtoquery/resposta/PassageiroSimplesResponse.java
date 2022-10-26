package sptech.projetojpadtoquery.resposta;

public class PassageiroSimplesResponse {
    private int id;
    private String nome;

    public PassageiroSimplesResponse(int id, String nome) {
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
