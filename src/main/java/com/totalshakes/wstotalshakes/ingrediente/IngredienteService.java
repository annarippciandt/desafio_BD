package com.totalshakes.wstotalshakes.ingrediente;

import com.totalshakes.wstotalshakes.entities.Ingrediente;

import java.util.List;


public interface IngredienteService {

    void createIngrediente(Ingrediente newIngrediente);

    void replaceIngrediente(Ingrediente newIngrediente);

    List<Ingrediente> getAllIngrediente();

    Ingrediente getIngredientebyId(int id);

    void deleteIngrediente(int id);
}
