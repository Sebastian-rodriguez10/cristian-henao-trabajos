# Strategy Demo - Patrón de Diseño Strategy en Spring Boot

## ¿Qué es el patrón Strategy?

El patrón **Strategy** permite definir una familia de algoritmos, encapsular cada uno en una clase separada y hacerlos intercambiables en tiempo de ejecución, sin modificar el código que los usa.

---

## Estructura del proyecto

```
strategy-demo
│
├── pom.xml
└── src/main/java/com/ejemplo/strategydemo/
    │
    ├── StrategyDemoApplication.java         ← Punto de entrada
    │
    ├── controller/
    │   └── PagoController.java              ← Expone el endpoint REST
    │
    ├── service/
    │   └── ProcesadorPago.java              ← Contexto (selecciona la estrategia)
    │
    └── strategy/
        ├── MetodoPago.java                  ← Interfaz Strategy
        ├── PagoTarjeta.java                 ← Estrategia concreta
        ├── PagoPaypal.java                  ← Estrategia concreta
        └── PagoTransferencia.java           ← Estrategia concreta
```

---

## Cómo ejecutar el proyecto

### Requisitos
- Java 17 o superior
- Maven 3.8+

### Pasos

```bash
# 1. Clonar o descomprimir el proyecto
cd strategy-demo

# 2. Compilar y ejecutar
mvn spring-boot:run
```

El servidor iniciará en `http://localhost:8080`

---

## Endpoints de prueba

### Pago con Tarjeta
```
GET http://localhost:8080/pagar?metodo=tarjeta&monto=250000
```
**Respuesta:** `✅ Pago realizado con tarjeta por $250000.0`

---

### Pago con PayPal
```
GET http://localhost:8080/pagar?metodo=paypal&monto=150000
```
**Respuesta:** `✅ Pago realizado con PayPal por $150000.0`

---

### Pago por Transferencia
```
GET http://localhost:8080/pagar?metodo=transferencia&monto=500000
```
**Respuesta:** `✅ Pago realizado mediante transferencia por $500000.0`

---

### Método inválido
```
GET http://localhost:8080/pagar?metodo=bitcoin&monto=100
```
**Respuesta:** `❌ Método de pago no válido. Métodos disponibles: tarjeta, paypal, transferencia.`

---

## ¿Cómo funciona el patrón en Spring Boot?

Spring Boot inyecta automáticamente todas las implementaciones de `MetodoPago` en un `Map<String, MetodoPago>` dentro del `ProcesadorPago`. La clave del mapa es el nombre definido en el `@Component` de cada clase.

```
@Component("tarjeta")    → clave: "tarjeta"
@Component("paypal")     → clave: "paypal"
@Component("transferencia") → clave: "transferencia"
```

Así, para agregar un nuevo método de pago, **solo se crea una nueva clase** que implemente `MetodoPago` — sin tocar el código existente. ✔️

---

## Bibliografía

- Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). *Design Patterns*. Addison-Wesley.
- Freeman, E., Robson, E. (2021). *Head First Design Patterns* (2nd ed.). O'Reilly Media.
- https://spring.io/projects/spring-framework
