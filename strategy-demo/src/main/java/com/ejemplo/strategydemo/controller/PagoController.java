package com.ejemplo.strategydemo.controller;

import com.ejemplo.strategydemo.service.ProcesadorPago;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST
 * Expone el endpoint GET /pagar que recibe el método y el monto como parámetros.
 *
 * Ejemplos de uso:
 *   GET /pagar?metodo=tarjeta&monto=250000
 *   GET /pagar?metodo=paypal&monto=150000
 *   GET /pagar?metodo=transferencia&monto=500000
 */
@RestController
public class PagoController {

    private final ProcesadorPago procesadorPago;

    @GetMapping("/pagar")
    public String pagar(@RequestParam String metodo, @RequestParam double monto) {

        return procesadorPago.procesarPago(metodo, monto);
    }
}
