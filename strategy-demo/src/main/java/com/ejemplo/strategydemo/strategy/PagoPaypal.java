package com.ejemplo.strategydemo.strategy;

import org.springframework.stereotype.Component;

/**
 * Estrategia concreta: Pago con PayPal
 * El nombre del @Component ("paypal") permite que Spring lo inyecte
 * automáticamente en el Map<String, MetodoPago> del ProcesadorPago.
 */
@Component("paypal")
public class PagoPaypal implements MetodoPago {

    @Override
    public String pagar(double monto) {
        return "✅ Pago realizado con PayPal por $" + monto;
    }
}
