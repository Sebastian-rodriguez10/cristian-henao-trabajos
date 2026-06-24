package com._1.practicaSingleton.controller;


import com._1.practicaSingleton.service.EstadisticasService;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AprendizController {

    private final EstadisticasService estadisticasService;

    public AprendizController(EstadisticasService estadisticasService) {
        this.estadisticasService = estadisticasService;
    }

    @GetMapping("/aprendices")
    public List<String> obtenerAprendices() {

        estadisticasService.incrementarAprendices();

        return List.of(
                "Juan Pérez",
                "María Gómez",
                "Carlos Rodríguez"
        );
    }
}