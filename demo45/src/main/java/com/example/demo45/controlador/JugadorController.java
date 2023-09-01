package com.example.demo45.controlador;

import com.example.demo45.repositorio.JugadorRepository;
import com.example.demo45.repositorio.SeleccionRepository;
import org.springframework.stereotype.Controller;
import com.example.demo45.entidad.Jugador;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value="/lab2/jugador")
public class JugadorController {

    final JugadorRepository jugadorRepository;
    final SeleccionRepository seleccionRepository;

    public JugadorController(JugadorRepository jugadorRepository, SeleccionRepository seleccionRepository) {
        this.jugadorRepository = jugadorRepository;
        this.seleccionRepository = seleccionRepository;
    }


    @GetMapping(value ="")
    public String listarJugadores(Model model){
        model.addAttribute("listaJugadores",jugadorRepository.findAll());
        return "jugador/list";
    }

    @GetMapping("/nuevo")
    public String crearNuevo(Model model){
        model.addAttribute("listaSelecciones",seleccionRepository.findAll());
        return "jugador/newForm";
    }

    @PostMapping("/guardar")
    public String guardar(Jugador jugador) {
        jugadorRepository.save(jugador);
        return "redirect:/lab2/jugador";
    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Jugador> optional = jugadorRepository.findById(id);

        if (optional.isPresent()) {
            jugadorRepository.deleteById(id);
        }

        return "redirect:/lab2/jugador";
    }


}
