package sptech.projetojpa01.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnime;
    private String nome;
    private LocalDate lancamento;
    private Integer downloads;

    public Integer getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(Integer idAnime) {
        this.idAnime = idAnime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }
}
