package sptech.projetojparelacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.projetojparelacionamentos.domain.Pais;

import java.util.List;

public interface PaisRepository extends JpaRepository<Pais, Integer> {

    List<Pais> findByContinenteIdContinente(int id);
    List<Pais> findByContinenteNomeContains(String id);


}
