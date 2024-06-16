package com.app.videojuegos.Repository;

import com.app.videojuegos.Domain.VideoJuego;
import com.app.videojuegos.Domain.VideojuegoDistribuidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistribuidorRepository extends JpaRepository<VideojuegoDistribuidor,Integer> {



}
