package com._1.factoryMethod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._1.factoryMethod.service.ReporteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    private ReporteService service;

    @GetMapping("/{tipo}")
    public String generar(@PathVariable String tipo) {
        return service.generarReporte(tipo);
    }
    
    
}