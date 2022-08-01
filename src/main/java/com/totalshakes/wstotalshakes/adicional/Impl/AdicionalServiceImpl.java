package com.totalshakes.wstotalshakes.adicional.Impl;

import com.totalshakes.wstotalshakes.adicional.AdicionalService;
import com.totalshakes.wstotalshakes.entities.Adicional;
import com.totalshakes.wstotalshakes.repository.AdicionalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdicionalServiceImpl implements AdicionalService {
    private final AdicionalRepository repository;

    @Override
    public void createAdicional(Adicional newAdicional) {
        repository.save(newAdicional);
    }

    @Override
    public void replaceAdicional(Adicional newAdicional) {
        var id = newAdicional.getId();
        repository.findById(id)
                .map(adicional -> {
                    adicional.setIngrediente(newAdicional.getIngrediente());
                    return repository.save(newAdicional);
                });
    }

    @Override
    public List<Adicional> getAllIAdicional() {
        return (List<Adicional>) repository.findAll();
    }

    @Override
    public Adicional getAdicionalbyId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteAdicional(int id) {
        repository.delete(getAdicionalbyId(id));
    }
}
