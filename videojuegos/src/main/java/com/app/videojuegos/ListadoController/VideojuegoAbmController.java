package com.app.videojuegos.ListadoController;



import com.app.videojuegos.Domain.VideoJuego;
import com.app.videojuegos.Service.Distribuidorservice;
import com.app.videojuegos.Service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoAbmController {

    private final Distribuidorservice distribuidorservice;
    private  final VideojuegoService videojuegoService;

    public VideojuegoAbmController(Distribuidorservice distribuidorservice, VideojuegoService videojuegoService) {
        this.distribuidorservice = distribuidorservice;
        this.videojuegoService = videojuegoService;
    }


    @RequestMapping("/v/crear")
    public String mostrarFormulario(Model model){
        model.addAttribute("distribuidores", distribuidorservice.buscarTodos());
        model.addAttribute("Objetovideojuego", new VideoJuego());
        return "formVideojuego";
    }

    @PostMapping("/v/guardar")
    private String guardar(VideoJuego videoJuego){
        videojuegoService.guardar(videoJuego);
        return "redirect:/";
    }



}
