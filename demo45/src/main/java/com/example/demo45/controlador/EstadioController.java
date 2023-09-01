package com.example.demo45.controlador;

import com.example.demo45.entidad.Estadio;
import com.example.demo45.repositorio.EstadioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value="/lab2/estadio")
public class EstadioController {
    final EstadioRepository estadioRepository;

    public EstadioController(EstadioRepository estadioRepository) {
        this.estadioRepository = estadioRepository;
    }

    @GetMapping(value ="")
    public String listarEstadios(Model model){
        model.addAttribute("listaEstadios",estadioRepository.findAll());
        return "estadio/list";
    }

    @GetMapping("/nuevo")
    public String crearNuevo(Model model){
        return "estadio/newForm";
    }

    @PostMapping("/guardar")
    public String guardar(Estadio estadio) {
        estadioRepository.save(estadio);
        return "redirect:/lab2/estadio";
    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Estadio> optional = estadioRepository.findById(id);

        if (optional.isPresent()) {
            estadioRepository.deleteById(id);
        }

        return "redirect:/lab2/estadio";
    }
}
