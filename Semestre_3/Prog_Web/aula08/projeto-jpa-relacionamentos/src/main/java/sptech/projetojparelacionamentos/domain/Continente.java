package sptech.projetojparelacionamentos.domain;

import javax.persistence.*;

@Entity
public class Continente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContinente;

    @Column(length = 25)
    private String nome;

    public int getIdContinente() {
        return idContinente;
    }

    public void setIdContinente(int idContinente) {
        this.idContinente = idContinente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
