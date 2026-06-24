package com.ejemplo.strategydemo.strategy;

import org.springframework.stereotype.Component;

/**
 * Estrategia concreta: Pago por Transferencia Bancaria
 * El nombre del @Component ("transferencia") permite que Spring lo inyecte
 * automáticamente en el Map<String, MetodoPago> del ProcesadorPago.
 */
@Component("transferencia")
public class PagoTransferencia implements MetodoPago {

    @Override
    public String pagar(double monto) {
        return "✅ Pago realizado mediante transferencia por $" + monto;
    }
}
