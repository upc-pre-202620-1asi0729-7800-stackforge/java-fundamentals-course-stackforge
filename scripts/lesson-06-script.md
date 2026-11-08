# Guion — Lección 6: Encapsulación, arrays y cadenas (≈ 8 min)

**Objetivo:**proteger atributos con `private`, usar getters/setters con validación, guardar objetos en un array y usar métodos de `String`.
**Editor:**OnlineGDB · **Archivo:**`starter-files/lesson-06-encapsulation-and-arrays/Main.java`

| Tiempo | En pantalla | Texto en pantalla / anotación | Narración (voz en off) |
|---|---|---|---|
| 0:00–0:45 | Libreta de notas con candado | "¿Quién puede cambiar tu nota?" | ¿Te gustaría que cualquiera pudiera cambiar tu nota en el registro? Claro que no. Por eso protegemos los datos. |
| 0:45–2:30 | `private int nota;` y el error al intentar `e.nota = 25` desde Main | "`private` = solo la clase puede tocarlo" | Con private, nadie fuera de la clase puede cambiar el atributo directamente. A esto se le llama encapsulación. |
| 2:30–4:00 | Getter `getNota()` y setter `setNota()` con validación 0–20 | "get = leer · set = cambiar con reglas" | Entonces, ¿cómo leemos o cambiamos la nota? Con métodos que ponen las reglas. Si alguien escribe 25, el setter lo detecta. |
| 4:00–5:30 | `Estudiante[] salon = new Estudiante[4];` y recorrido con `for` | Dibujo de 4 casilleros numerados 0, 1, 2, 3 | Un array es una fila de casilleros. ¡Ojo: empiezan en 0! Con un for y `salon.length` recorremos todo el salón. |
| 5:30–6:00 | `toUpperCase()` y `length()` | "Los String también tienen métodos" | Los textos también son objetos y traen métodos útiles. |
| 6:00–7:15 | Pantalla de pausa | **PAUSA: Retos 1 a 5 y extra**| Completa el getter, la validación, el recorrido y el promedio del salón. |
| 7:15–8:00 | Solución y resumen | "private + get/set = datos seguros" | Ya tienes todo para el proyecto final: ¡un juego! |

## Errores comunes a mostrar
- `ArrayIndexOutOfBoundsException` por usar `i <= salon.length`.
- Comparar textos con `==` en vez de `.equals()`.
