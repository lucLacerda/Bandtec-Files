package sptech.projetojpa01.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.projetojpa01.dominio.Anime;

/*
Esta interface é uma Repository para a Entidade Anime
Ou seja, ela contém os métodos de
inclusão/exclusão/alteração/consulta de Anime.

o <Anime, Integer> indica:
a classe de Entidade e a classe do Id da Entidade
 */
public interface AnimeRepository extends
                                    JpaRepository<Anime, Integer> {
}
