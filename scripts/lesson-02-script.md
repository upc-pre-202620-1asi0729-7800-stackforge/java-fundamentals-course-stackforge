# Guion — Lección 2: Variables, tipos de datos y operadores (≈ 8 min)

**Objetivo:**guardar datos en variables, conocer `String`, `int`, `double`, `boolean`, `char` y operar con `+ - * / %`.
**Editor:**OnlineGDB · **Archivo:**`starter-files/lesson-02-variables-and-operators/Main.java`

| Tiempo | En pantalla | Texto en pantalla / anotación | Narración (voz en off) |
|---|---|---|---|
| 0:00–0:45 | Animación de cajas con etiquetas | "Variable = caja con etiqueta" | Imagina una caja con una etiqueta que dice "edad" y adentro el número 14. Eso es una variable: un lugar con nombre donde guardamos un dato. |
| 0:45–2:30 | Escribir en vivo `String nombre`, `int edad`, `double estatura`, `boolean esEstudiante`, `char inicial` | Tabla: tipo → ejemplo → para qué sirve | Cada caja tiene un tipo: texto, entero, decimal, verdadero/falso o un solo carácter. El tipo le dice a Java qué cabe en la caja. |
| 2:30–3:00 | Error: `int edad = "catorce";` | "No puedes guardar texto en un int" | Si intentas meter texto en una caja de números, Java se queja. ¡Y está bien! Te avisa antes de que el programa falle. |
| 3:00–5:00 | Operadores `+ - * /` con la edad y el promedio de notas | Resaltar `/ 3.0` | Ahora hagamos cuentas. Ojo con la división: si divides enteros, Java descarta los decimales. Por eso usamos 3.0. |
| 5:00–6:00 | Ejemplo de caramelos con `/` y `%` | Dibujo: 17 caramelos en 5 grupos | El operador % nos da lo que sobra de una división. Muy útil para repartir cosas o saber si un número es par. |
| 6:00–6:45 | `puntos += 5` y `edad >= 18` | "`+=` suma y guarda" · "comparar da true/false" | Las variables pueden cambiar. Y si comparamos dos valores, obtenemos verdadero o falso. |
| 6:45–7:30 | Pantalla de pausa | **PAUSA: Retos 1 a 5**| Pausa y completa los retos. El reto 5 es de figuritas: ¡usa la división y el residuo! |
| 7:30–8:00 | Solución rápida y resumen | Resumen de tipos y operadores | En la próxima lección tu programa empezará a tomar decisiones. |

## Errores comunes a mostrar
- Usar comillas simples para texto (`'Hola'`): eso es un `char`, no un `String`.
- Dividir `int / int` y perder decimales.
- Nombres de variables con espacios o que empiezan con número.

## Buenas prácticas
- Nombres descriptivos en camelCase: `edadEnCincoAnios`, no `x`.
