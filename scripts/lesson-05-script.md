# Guion — Lección 5: Clases y objetos — tu mascota virtual (≈ 9 min)

**Objetivo:**entender clase vs. objeto, atributos, constructor y métodos de instancia.
**Editor:**OnlineGDB · **Archivo:**`starter-files/lesson-05-classes-and-objects/Main.java`

| Tiempo | En pantalla | Texto en pantalla / anotación | Narración (voz en off) |
|---|---|---|---|
| 0:00–1:00 | Molde de galletas y varias galletas decoradas | "Clase = molde · Objeto = galleta" | Con un molde puedes hacer muchas galletas, cada una con su propia decoración. En programación, el molde es la clase y cada galleta es un objeto. |
| 1:00–2:30 | Ficha de mascota dibujada: nombre, especie, energía, felicidad / comer, jugar | "Atributos = lo que TIENE · Métodos = lo que HACE" | Pensemos en una mascota virtual. ¿Qué tiene? Nombre, energía, felicidad. ¿Qué hace? Come, juega, duerme. |
| 2:30–4:30 | Escribir `class Mascota` con atributos y constructor | Resaltar `this.nombre = nombre` | El constructor se ejecuta cuando creamos la mascota. `this` significa "el atributo de esta mascota". |
| 4:30–6:00 | `new Mascota("Firulais", "Perro")` y `new Mascota("Michi", "Gato")` | Dos tarjetas lado a lado con sus valores | Con new creamos objetos. Firulais y Michi salen del mismo molde, pero cada uno guarda sus propios datos. |
| 6:00–7:00 | `perro.comer()` y la energía cambia | Animación de la barra de energía | Usamos el punto para pedirle a un objeto que haga algo. Solo cambia la energía de Firulais, no la de Michi. |
| 7:00–8:15 | Pantalla de pausa | **PAUSA: Retos 1, 2, 3 y extra**| Crea jugar(), mostrarEstado() y tu propia segunda mascota. Si te sobra tiempo, agrega dormir(). |
| 8:15–9:00 | Solución y resumen | "class → new → objeto.metodo()" | ¡Acabas de usar programación orientada a objetos! En la próxima lección vamos a proteger los datos de nuestros objetos. |

## Errores comunes a mostrar
- Olvidar `new` al crear el objeto.
- Llamar `Mascota.comer()` en lugar de `perro.comer()`.
- Confundir el parámetro `nombre` con el atributo `this.nombre`.

## Nota técnica
- Todas las clases van en un solo archivo `Main.java`; solo `Main` es `public`. Así funciona igual en OnlineGDB, JDoodle o Replit.
