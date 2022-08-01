package com.totalshakes.wstotalshakes.repository;

import com.totalshakes.wstotalshakes.entities.Ingrediente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepository extends CrudRepository<Ingrediente, Integer> {
}
