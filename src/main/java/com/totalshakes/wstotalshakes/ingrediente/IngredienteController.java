package com.totalshakes.wstotalshakes.ingrediente;

import com.totalshakes.wstotalshakes.entities.Ingrediente;
import com.totalshakes.wstotalshakes.repository.IngredienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ingrediente")
class IngredienteController {
    private final IngredienteRepository repository;
    private final IngredienteService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Ingrediente> allIngredientes() {
        return service.getAllIngrediente();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Ingrediente ingredienteById(@PathVariable int id) {
        return service.getIngredientebyId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createIngrediente(@RequestBody Ingrediente newIngrediente) {
        service.createIngrediente(newIngrediente);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void replaceIngrediente(@RequestBody Ingrediente newIngrediente, @PathVariable int id) {
        service.replaceIngrediente(newIngrediente, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteIngrediente(@PathVariable int id) {
        repository.deleteById(id);
    }

}
