package sptech.projeto02;

public class Heroi {

    private String nome;
    private String poder;
    private double forca;
    private boolean vivo;

    private String classe = "X";

    public Heroi(String nome, String poder, double forca, boolean vivo) {
        this.nome = nome;
        this.poder = poder;
        this.forca = forca;
        this.vivo = vivo;
    }
/*
Campo virtual
Campo calculado
Atributo virtual
Atributo calculado
 */
    public String getDescricao() {
        return forca > 500.0 ? "Herói forte" : "Meia boca";
    }

    public String getNome() {
        return nome;
    }

    public String getPoder() {
        return poder;
    }

    public double getForca() {
        return forca;
    }

    public boolean isVivo() {
        return vivo;
    }

    public String getClasse() {
        return classe;
    }
}
