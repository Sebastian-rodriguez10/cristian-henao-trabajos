package com._1.factoryMethod.factory;

import com._1.factoryMethod.implementations.ReporteCSV;
import com._1.factoryMethod.implementations.ReporteExcel;
import com._1.factoryMethod.implementations.ReportePDF;
import com._1.factoryMethod.implementations.ReporteWord;
import com._1.factoryMethod.interfaces.Reporte;

public class ReporteFactory {
    public static Reporte crearReporte(String tipo){
        if (tipo.equalsIgnoreCase("PDF")) {
            return new ReportePDF();
        }
        if (tipo.equalsIgnoreCase("EXCEL")) {
            return new ReporteExcel();
        }
        if (tipo.equalsIgnoreCase("CSV")) {
            return new ReporteCSV();
        }
        if (tipo.equalsIgnoreCase("WORD")) {
            return new ReporteWord();
        }

        throw new  IllegalArgumentException("Tipo de reporte no valido");
    }
}
