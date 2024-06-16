package com.app.videojuegos.Service;

import com.app.videojuegos.Domain.VideojuegoDistribuidor;
import com.app.videojuegos.Repository.DistribuidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Distribuidorservice {
    private final DistribuidorRepository distribuidorRepository;

    public Distribuidorservice(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    public List<VideojuegoDistribuidor> buscarTodos(){
        return distribuidorRepository.findAll();
    }
}
