package com.totalshakes.wstotalshakes.ingrediente;

import com.totalshakes.wstotalshakes.entities.Ingrediente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface IngredienteService {

    void createIngrediente(Ingrediente newIngrediente);

    void replaceIngrediente(Ingrediente newIngrediente, int id);

    List<Ingrediente>getAllIngrediente();

    Ingrediente getIngredientebyId(int id);

    void deleteIngrediente(int id);
}
