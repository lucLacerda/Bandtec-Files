package sptech.projetoaula2408.questao2_4;

public class Lutador {
    private String nome;
    private int forcaGolpe;
    private int forcaDefesa;
    private int vida = 100;

    public String getNome() {
        return nome;
    }

    public int getForcaGolpe() {
        return forcaGolpe;
    }

    public int getForcaDefesa() {
        return forcaDefesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = (vida < 0) ? 0 : vida;
    }

    public void apanhar(Lutador lutadorQueBate) {
        vida -= (lutadorQueBate.getForcaGolpe() - forcaDefesa);
        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean isVivo() {
        return vida > 0;
    }
}
