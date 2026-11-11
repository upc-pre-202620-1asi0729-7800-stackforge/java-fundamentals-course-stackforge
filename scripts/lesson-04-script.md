# Guion — Lección 4: Métodos y entrada con Scanner (≈ 9 min)

**Objetivo:**crear métodos con parámetros y valor de retorno, y leer datos del usuario con `Scanner`.
**Editor:**OnlineGDB · **Archivo:**`starter-files/lesson-04-methods-and-input/Main.java`

| Tiempo | En pantalla | Texto en pantalla / anotación | Narración (voz en off) |
|---|---|---|---|
| 0:00–0:45 | Animación: botón "preparar jugo" en una licuadora | "Método = bloque de código con nombre" | Un método es como el botón de una licuadora: lo presionas y hace una tarea completa. Lo escribes una vez y lo usas muchas veces. |
| 0:45–2:30 | Escribir `saludar(String nombre)` y llamarlo 2 veces | Resaltar el parámetro `nombre` | Los paréntesis reciben datos: los parámetros. Así el mismo método saluda a cualquier persona. |
| 2:30–4:00 | `calcularPromedio(int a, int b, int c)` con `return` | "`void` = no devuelve · `double` = devuelve un decimal" | Algunos métodos hacen algo; otros calculan y devuelven un resultado con return. |
| 4:00–6:00 | `Scanner teclado = new Scanner(System.in)`, `nextLine()`, `nextInt()` | Flecha a la consola: "¡escribe aquí y presiona Enter!" | Hasta ahora el programa hablaba solo. Con Scanner puede escucharte. En OnlineGDB, escribe tu respuesta en la consola y presiona Enter. |
| 6:00–7:45 | Pantalla de pausa | **PAUSA: Retos 1 a 4**| Completa calcularPromedio, crea estaAprobado y conecta todo con las notas que escribas. |
| 7:45–9:00 | Solución y resumen | "Parámetros entran · return sale" | Ya sabes organizar tu código. En la próxima lección crearemos nuestros propios tipos de datos: ¡clases! |

## Errores comunes a mostrar
- Olvidar `import java.util.Scanner;` → error "cannot find symbol".
- Llamar un método con tipos distintos a los parámetros.
- Escribir texto cuando el programa espera un número (`InputMismatchException`).
