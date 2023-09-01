package com.example.demo45.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/lab2", method = RequestMethod.GET)
    @ResponseBody
    public String mensajeCreativo(){
        return "Yo soy FRANCHESCO FIUUUUUUM!";
    }
}
