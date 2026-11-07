# Guion — Lección 3: Decisiones y bucles (≈ 9 min)

**Objetivo:**usar `if / else if / else`, operadores lógicos y repetir tareas con `for` y `while`.
**Editor:**OnlineGDB · **Archivo:**`starter-files/lesson-03-control-structures/Main.java`

| Tiempo | En pantalla | Texto en pantalla / anotación | Narración (voz en off) |
|---|---|---|---|
| 0:00–0:45 | Diagrama de flujo: "¿Llueve? → paraguas / gorra" | "Los programas también deciden" | Todos los días tomas decisiones: si llueve, llevas paraguas. Los programas hacen lo mismo con `if`. |
| 0:45–3:00 | Escribir el `if / else if / else` de la nota | Flechas que muestran qué rama se ejecuta | Java revisa las condiciones de arriba hacia abajo y entra solo en la primera que sea verdadera. Cambiemos la nota a 19, a 8… y veamos qué pasa. |
| 3:00–4:00 | `edad >= 12 && tienePermiso` | Tabla: `&&` = y · `||` = o · `!` = no | Podemos combinar condiciones: "y", "o" y "no". |
| 4:00–4:45 | Pantalla de pausa | **PAUSA: Reto 1**| Pausa y completa el if de la nota. |
| 4:45–6:45 | Bucle `for` con la tabla del 7 | Desglosar: inicio `i = 1` · condición `i <= 10` · paso `i++` | ¿Escribirías 10 líneas para una tabla de multiplicar? Mejor un bucle. El for tiene tres partes: dónde empieza, hasta cuándo sigue y cómo avanza. |
| 6:45–7:45 | Bucle `while` con cuenta regresiva | "Sin `cuentaRegresiva--` el bucle no termina" | El while repite mientras la condición sea verdadera. Si olvidas cambiar la variable, tendrás un bucle infinito. Mostrar cómo detenerlo con el botón Stop. |
| 7:45–8:30 | Pantalla de pausa | **PAUSA: Retos 2, 3 y extra**| Tabla del 5, cuenta regresiva desde 10 y, si te animas, los impares del 1 al 20. |
| 8:30–9:00 | Solución y resumen | "if decide · for cuenta · while espera" | Ya tienes las herramientas para decidir y repetir. Ahora aprenderemos a organizar código en métodos. |

## Errores comunes a mostrar
- Usar `=` (asignar) en lugar de `==` (comparar) dentro de un `if`.
- Poner `;` justo después de `if (...)`.
- Bucle infinito por no actualizar la variable.
