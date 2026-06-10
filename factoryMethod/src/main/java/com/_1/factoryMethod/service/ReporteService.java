package com._1.factoryMethod.service;

import com._1.factoryMethod.factory.ReporteFactory;
import com._1.factoryMethod.interfaces.Reporte;

public class ReporteService {
    public String generarReporte(String tipo){
        Reporte reporte = ReporteFactory.crearReporte(tipo);
        return reporte.generarReporte();
    }
}
