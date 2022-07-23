package com.adaptativos.pc4.controller;

import com.adaptativos.pc4.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstudianteController {

    @Autowired
    private IEstudianteService serviceEstudiante;

    @RequestMapping(value = {"", "/", "index"})
    public String listarEstudiantes(Model model) {

        model.addAttribute("estudiantes", serviceEstudiante.listarEstudiantes());

        model.addAttribute("titulo", "PC4 - Desarrollo Adaptativo e Integrado del Software");

        return "index";
    }

}
