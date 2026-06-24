package com.ejemplo.strategydemo.strategy;

import org.springframework.stereotype.Component;

/**
 * Estrategia concreta: Pago con Tarjeta
 * El nombre del @Component ("tarjeta") permite que Spring lo inyecte
 * automáticamente en el Map<String, MetodoPago> del ProcesadorPago.
 */
@Component("tarjeta")
public class PagoTarjeta implements MetodoPago {

    @Override
    public String pagar(double monto) {
        return "✅ Pago realizado con tarjeta por $" + monto;
    }
}
