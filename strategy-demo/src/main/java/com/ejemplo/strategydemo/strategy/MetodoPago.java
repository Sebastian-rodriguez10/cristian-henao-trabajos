package com.ejemplo.strategydemo.strategy;

/**
 * Interfaz Strategy
 * Define el contrato que deben cumplir todos los métodos de pago.
 * Cada implementación concreta representará una estrategia diferente de pago.
 */
public interface MetodoPago {
    String pagar(double monto);
}
