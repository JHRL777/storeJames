package com.app.videojuegos.Repository;

import com.app.videojuegos.Domain.VideoJuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideojuegosRepository extends JpaRepository<VideoJuego,Integer> {

    @Query("select v from VideoJuego v order by v.nombre")
    List<VideoJuego> buscarTodos();

    @Query("from VideoJuego v where v.distribuidor.id = ?1")
    List<VideoJuego> buscarPorDistribuidor(int distribuidorId);


    List<VideoJuego> findByNombreContaining(String nombre);

}
