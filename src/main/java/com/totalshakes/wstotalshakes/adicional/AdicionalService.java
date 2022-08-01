package com.totalshakes.wstotalshakes.adicional;

import com.totalshakes.wstotalshakes.entities.Adicional;

import java.util.List;

public interface AdicionalService {
    void createAdicional(Adicional newAdicional);

    void replaceAdicional(Adicional newAdicional);

    List<Adicional> getAllIAdicional();

    Adicional getAdicionalbyId(int id);

    void deleteAdicional(int id);

}
