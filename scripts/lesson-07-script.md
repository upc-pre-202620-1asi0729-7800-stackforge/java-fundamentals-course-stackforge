# Guion — Lección 7: Proyecto final — Juego de adivinanzas con clases (≈ 9 min)

**Objetivo:** integrar variables, decisiones, bucles, métodos, Scanner, clases, encapsulación y arrays en un juego completo.
**Editor:** OnlineGDB · **Archivo:** `starter-files/lesson-07-final-project/Main.java`

| Tiempo | En pantalla | Texto en pantalla / anotación | Narración (voz en off) |
|---|---|---|---|
| 0:00–0:45 | Demo del juego terminado funcionando | "¡Hoy construyes esto!" | Mira este juego: la computadora piensa un número y tú lo adivinas con pistas. Al final de este video, tú lo habrás construido. |
| 0:45–1:45 | Diagrama: clase `JuegoAdivinanza` y clase `Jugador` | Lista de lo que usaremos: variables, if, while, métodos, Scanner, clases, array | Usaremos todo lo que aprendiste. Dos clases: el juego guarda el número secreto; el jugador guarda su nombre y sus intentos. |
| 1:45–3:15 | Completar `evaluar()` | Resaltar el `if / else if / else` | Primero, las pistas: mayor, menor o correcto. |
| 3:15–4:00 | Crear la clase `Jugador` con atributos privados y getters | "private + getters, como en la lección 6" | El jugador también protege sus datos. Solo el método registrarIntento puede sumar intentos. |
| 4:00–4:30 | Pausa breve | ** PAUSA: Retos 1 y 2** | Pausa y completa evaluar y la clase Jugador. |
| 4:30–6:45 | Bucle `while (!gano && intentos < max)` en `main` | Desglosar la condición del while | El juego se repite mientras no hayas ganado y te queden intentos. En cada vuelta leemos un número y mostramos la pista. |
| 6:45–7:45 | Pausa |  PAUSA: Retos 3, 4, 5 y extra | Termina el juego y pruébalo. Reto extra: guardar el historial en un array. |
| 7:45–9:00 | Probar el juego ganando y perdiendo; ideas para mejorarlo | "Ideas: niveles de dificultad · marcador · jugar otra vez" | ¿Funcionó? ¡Ya tienes un juego hecho con clases! Prueba agregar niveles de dificultad. En la última lección aprenderemos a encontrar y corregir errores como un profesional. |

## Errores comunes a mostrar
- Comparar textos con `==` en lugar de `.equals()` (por eso usamos `resultado.equals("correcto")`).
- Olvidar actualizar el contador de intentos → bucle infinito.
