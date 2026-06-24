package com._1.practicaSingleton.controller;
import com._1.practicaSingleton.service.EstadisticasService;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstructorController {

    private final EstadisticasService estadisticasService;

    public InstructorController(EstadisticasService estadisticasService) {
        this.estadisticasService = estadisticasService;
    }

    @GetMapping("/instructores")
    public List<String> obtenerInstructores() {

        estadisticasService.incrementarInstructores();

        return List.of(
                "Pedro Martínez",
                "Ana López"
        );
    }
}