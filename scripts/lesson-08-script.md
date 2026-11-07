# Guion — Lección 8: Buenas prácticas y errores comunes (≈ 6 min)

**Objetivo:**aprender a leer mensajes de error, corregir los 5 errores más comunes de quien empieza y escribir código claro.
**Editor:**OnlineGDB · **Archivo:**`starter-files/lesson-08-best-practices-and-errors/Main.java`

| Tiempo | En pantalla | Texto en pantalla / anotación | Narración (voz en off) |
|---|---|---|---|
| 0:00–0:30 | Lupa de detective sobre código | "Misión: encontrar 5 errores" | Todos los programadores se equivocan, incluso los expertos. La diferencia es que saben leer los errores. Hoy serás detective. |
| 0:30–1:15 | Presionar Run y mostrar el error de `;` | Señalar: número de línea + "';' expected" | El mensaje de error no es tu enemigo: te dice en qué línea está el problema y qué falta. Aquí falta un punto y coma. |
| 1:15–2:30 | Corregir `new` faltante y `system` en minúscula | "Java distingue MAYÚSCULAS y minúsculas" | Corregimos uno, ejecutamos de nuevo. Ahora falta `new` para crear el objeto. Y aquí, `system` debe empezar con S mayúscula. |
| 2:30–3:00 | Pausa | **PAUSA: encuentra los 2 errores que quedan**| El programa ya compila, pero algo sigue mal. Pausa y búscalo. |
| 3:00–4:00 | Error `ArrayIndexOutOfBoundsException` y el `null` en el nombre | Dibujo de los casilleros 0, 1, 2 · "no existe el 3" · resaltar `this.nombre` | El array tiene 3 casilleros: 0, 1 y 2. Con `<=` intentamos abrir el 3, que no existe. Y el nombre sale `null` porque olvidamos `this`. |
| 4:00–5:15 | Refactorizar: `x` → `sumaNotas`, constante `NOTA_MINIMA_APROBATORIA`, método `mostrarResultado` | Checklist: nombres claros constantes métodos pequeños indentación ejecutar seguido | Que funcione no basta: el código también se lee. Nombres claros, constantes en lugar de números sueltos y métodos pequeños. |
| 5:15–6:00 | Cierre del curso | "¡Felicitaciones! Ya programas en Java" · enlace a la documentación oficial | Empezaste con un "Hola, mundo" y terminaste construyendo un juego con clases. Sigue practicando y consulta la documentación oficial de Java. ¡Comparte lo que creaste! |

## Resumen de errores comunes
`;` faltante · mayúsculas/minúsculas · olvidar `new` · índices de arrays desde 0 · olvidar `this` · `=` vs `==` · comparar textos con `.equals()` · bucles infinitos.
