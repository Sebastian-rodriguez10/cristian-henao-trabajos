package com._1.factoryMethod.implementations;

import com._1.factoryMethod.interfaces.Reporte;

public class ReporteWord implements Reporte{
    @Override
    public String generarReporte() {
        return "Reporte generado en formato word";
    }
}
