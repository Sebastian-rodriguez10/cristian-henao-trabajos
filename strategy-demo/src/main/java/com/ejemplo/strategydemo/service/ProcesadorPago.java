package com.ejemplo.strategydemo.service;

import com.ejemplo.strategydemo.strategy.MetodoPago;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Contexto (Context) del patrón Strategy
 *
 * Spring inyecta automáticamente un Map donde:
 *   - La clave  = nombre del @Component (ej: "tarjeta", "paypal", "transferencia")
 *   - El valor  = instancia de la clase que implementa MetodoPago
 *
 * Esto permite seleccionar la estrategia en tiempo de ejecución
 * sin necesidad de condicionales if/else o switch en el código principal.
 */
@Service
public class ProcesadorPago {

    private final Map<String, MetodoPago> estrategias;

    public ProcesadorPago(Map<String, MetodoPago> estrategias) {
        this.estrategias = estrategias;
    }

    public String procesarPago(String metodo, double monto) {

        MetodoPago estrategia = estrategias.get(metodo.toLowerCase());

        if (estrategia == null) {
            return "❌ Método de pago no válido. Métodos disponibles: tarjeta, paypal, transferencia.";
        }

        return estrategia.pagar(monto);
    }
}
