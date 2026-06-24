package com._1.practicaSingleton.controller;

import com._1.practicaSingleton.service.EstadisticasService;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramaController {

    private final EstadisticasService estadisticasService;

    public ProgramaController(EstadisticasService estadisticasService) {
        this.estadisticasService = estadisticasService;
    }

    @GetMapping("/programas")
    public List<String> obtenerProgramas() {

        estadisticasService.incrementarProgramas();

        return List.of(
                "Análisis y Desarrollo de Software",
                "Gestión Empresarial",
                "Contabilidad"
        );
    }
}