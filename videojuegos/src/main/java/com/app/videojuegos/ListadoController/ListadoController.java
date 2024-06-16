package com.app.videojuegos.ListadoController;

import com.app.videojuegos.Domain.VideoJuego;
import com.app.videojuegos.Repository.VideojuegosRepository;
import com.app.videojuegos.Service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import java.util.List;

@Controller
public class ListadoController {
    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String ListaVideoJuegos(Model model){
        List<VideoJuego> destacados = videojuegoService.buscarvideojuegos();
        model.addAttribute("videojuego", destacados);
        return"listado";
    }

    @RequestMapping("/Videojuegopordistribuidor")
    public String Videojuegopordistribuidor(@RequestParam("q")  int distribuidorId, Model model){
        List<VideoJuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuego", juegos);
        return "listado";
    }

    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String nombre, Model model){
        List<VideoJuego> busqueda = videojuegoService.buscarPorNombre(nombre);
        model.addAttribute("videojuego", busqueda);
        return "listado";

    }


}
