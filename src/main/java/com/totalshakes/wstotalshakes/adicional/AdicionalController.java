package com.totalshakes.wstotalshakes.adicional;

import com.totalshakes.wstotalshakes.entities.Adicional;
import com.totalshakes.wstotalshakes.repository.AdicionalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/adicional")
public class AdicionalController {
    private final AdicionalRepository repository;
    private final AdicionalService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Adicional> allIngredientes() {
        return service.getAllIAdicional();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Adicional adicionalById(@PathVariable int id) {
        return service.getAdicionalbyId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAdicional(@RequestBody Adicional newAdicional) {
        service.createAdicional(newAdicional);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void replaceAdicional(@RequestBody Adicional newAdicional, @PathVariable int id) {
        service.replaceAdicional(newAdicional);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteAdicional(@PathVariable int id) {
        repository.deleteById(id);
    }
}
