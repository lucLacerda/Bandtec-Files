package sptech.projetojpa01.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/*
@Entity - indica que a classe será uma Entidade,
ou seja, a ela mapeia, ela espelha uma tabela.
O nome da tabela, por padrão é o "mesmo", mudando apenas
de PascalCase para snake_case
 */
@Entity // do javax.persistence
public class Anime {
/*
@Id indica que o campo é o "id", ou seja, a chave primária da Entidade

@GeneratedValue(strategy = GenerationType.IDENTITY)
Indica que o campo é autoincremento
 */
    @Id  // do javax.persistence
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnime;
    private String nome;
    private LocalDate dataLancamento;
    private Integer downloads;

    // get e set de todos! SEM CONSTRUTOR nem toString()!!!
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

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }
}
