package com._1.practicaSingleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com._1.practicaSingleton.service.EstadisticasService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EstadisticasController {

    private final EstadisticasService estadisticasService;

    public EstadisticasController(EstadisticasService estadisticasService) {
        this.estadisticasService = estadisticasService;
    }

    @GetMapping("/estadisticas")
    public Map<String, Integer> obtenerEstadisticas() {

        Map<String, Integer> estadisticas = new HashMap<>();

        estadisticas.put("consultasAprendices",
                estadisticasService.getTotalConsultasAprendices());

        estadisticas.put("consultasInstructores",
                estadisticasService.getTotalConsultasInstructores());

        estadisticas.put("consultasProgramas",
                estadisticasService.getTotalConsultasProgramas());

        estadisticas.put("totalConsultas",
                estadisticasService.getTotalConsultas());

        return estadisticas;
    }
}