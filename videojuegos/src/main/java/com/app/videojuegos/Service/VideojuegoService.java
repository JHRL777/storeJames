package com.app.videojuegos.Service;

import com.app.videojuegos.Domain.VideoJuego;
import com.app.videojuegos.Repository.VideojuegosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideojuegoService {

     private  final VideojuegosRepository videojuegosRepository;

    public VideojuegoService(VideojuegosRepository videojuegosRepository) {
        this.videojuegosRepository = videojuegosRepository;
    }

    public List<VideoJuego> buscarvideojuegos(){
        return videojuegosRepository.buscarTodos();
    }

    public List<VideoJuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegosRepository.buscarPorDistribuidor(distribuidorId);
    }

    public  List<VideoJuego> buscarPorNombre(String nombre){
        return videojuegosRepository.findByNombreContaining((nombre));
    }

    public VideoJuego guardar(VideoJuego videoJuego){
        return videojuegosRepository.save(videoJuego);
    }
}
