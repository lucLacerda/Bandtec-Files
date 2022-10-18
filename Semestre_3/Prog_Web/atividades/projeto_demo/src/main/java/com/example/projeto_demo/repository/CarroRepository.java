package com.example.projeto_demo.repository;

import com.example.projeto_demo.domain.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarroRepository extends
        JpaRepository<CarroEntity, Integer> {

    List<CarroEntity> findByFabricanteNomeContains(String nome);

}
