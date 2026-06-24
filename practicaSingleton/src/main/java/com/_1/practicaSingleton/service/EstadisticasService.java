package com._1.practicaSingleton.service;

import org.springframework.stereotype.Service;

@Service
public class EstadisticasService {

    private int totalConsultasAprendices;
    private int totalConsultasInstructores;
    private int totalConsultasProgramas;

    public void incrementarAprendices() {
        totalConsultasAprendices++;
    }

    public void incrementarInstructores() {
        totalConsultasInstructores++;
    }

    public void incrementarProgramas() {
        totalConsultasProgramas++;
    }

    public int getTotalConsultasAprendices() {
        return totalConsultasAprendices;
    }

    public int getTotalConsultasInstructores() {
        return totalConsultasInstructores;
    }

    public int getTotalConsultasProgramas() {
        return totalConsultasProgramas;
    }

    public int getTotalConsultas() {
        return totalConsultasAprendices
                + totalConsultasInstructores
                + totalConsultasProgramas;
    }
}