package com.totalshakes.wstotalshakes.ingrediente.Impl;

import com.totalshakes.wstotalshakes.entities.Ingrediente;
import com.totalshakes.wstotalshakes.ingrediente.IngredienteService;
import com.totalshakes.wstotalshakes.repository.IngredienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredienteServiceImpl implements IngredienteService {

    private final IngredienteRepository repository;


    @Override
    public void createIngrediente(Ingrediente newIngrediente) {
        repository.save(newIngrediente);
    }

    @Override
    public void replaceIngrediente(Ingrediente newIngrediente) {
        var id = newIngrediente.getId();
        repository.findById(id)
                .map(ingrediente -> {
                    ingrediente.setNome(newIngrediente.getNome());
                    return repository.save(newIngrediente);
                });
    }

    @Override
    public List<Ingrediente> getAllIngrediente() {
        return (List<Ingrediente>) repository.findAll();
    }

    @Override
    public Ingrediente getIngredientebyId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteIngrediente(int id) {
        repository.delete(getIngredientebyId(id));
    }
}
