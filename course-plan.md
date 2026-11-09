# Fundamentos de Java para Principiantes

## Resumen del curso

Este curso de aproximadamente una hora introduce a estudiantes de secundaria a la programación con Java, incluyendo los conceptos esenciales de la Programación Orientada a Objetos (POO). Empiezas con tu primer "¡Hola, mundo!" y terminas construyendo un juego con clases y objetos, siempre con ejemplos cotidianos (notas del colegio, mascotas virtuales, juegos) y pausas para practicar. **¡No requiere descargas ni instalaciones!** Solo necesitas abrir tu navegador web.

**Duración total**: ~64 minutos (8 lecciones)  
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: Solo tu navegador web (Chrome, Firefox, Safari o Edge)  
**Editor en línea**: [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) — gratuito, no requiere registro  
** Repositorio de código fuente**:  [Repositorio de GitHub](https://github.com/upc-pre-202620-1asi0729-7800-stackforge/java-fundamentals-course-stackforge.git)

### ¿Cómo usar este curso?

1. Mira la lección en YouTube.
2. Cuando aparezca PAUSA, detén el video y abre el enlace de práctica: el código ya está cargado.
3. Resuelve los **RETOS** marcados en el código y presiona **Run**.
4. Compara tu resultado con la solución del video o de la carpeta `/completed-examples`.

### Ruta de aprendizaje

| Lección | Tema | Duración |
|---|---|---|
| 1 | ¿Qué es programar y qué es Java? | 6 min |
| 2 | Variables, tipos de datos y operadores | 8 min |
| 3 | Decisiones y bucles | 9 min |
| 4 | Métodos y entrada con Scanner | 9 min |
| 5 | Clases y objetos: tu mascota virtual | 9 min |
| 6 | Encapsulación, arrays y cadenas | 8 min |
| 7 | Proyecto final: juego de adivinanzas con clases | 9 min |
| 8 | Buenas prácticas y errores comunes | 6 min |

---

## Secuencia de lecciones

### Lección 1: ¿Qué es programar y qué es Java? (6 minutos)

- **Descripción**: Descubre qué es un programa, por qué Java es uno de los lenguajes más usados del mundo y ejecuta tu primer código sin instalar nada.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=QfCTnbuxAgE)
- **Conceptos clave**:
  - Un programa es una lista de instrucciones que la computadora sigue en orden
  - Java se usa en aplicaciones móviles, sistemas de empresas y videojuegos
  - Todo programa Java tiene una clase `Main` con un método `main`
  - `System.out.println("Hola");` muestra texto en la consola
- **Empieza a programar**: [Abrir OnlineGDB — Hola mundo](https://www.onlinegdb.com/edit/Li7EcCDAu#) 

---

### Lección 2: Variables, tipos de datos y operadores (8 minutos)

- **Descripción**: Aprende a guardar información en variables y a hacer cálculos con ellas, como el promedio de tus notas.
- **Enlace**: [Ver la lección](https://youtu.be/ENLACE-LECCION-2)
- **Conceptos clave**:
  - Una variable es una caja con etiqueta que guarda un dato: `int edad = 14;`
  - Tipos básicos: `int`, `double`, `String`, `boolean`, `char`
  - Operadores aritméticos: `+`, `-`, `*`, `/`, `%` (el `%` da el residuo)
  - Dividir entre `3.0` en lugar de `3` conserva los decimales
  - Comparar dos valores (`>=`, `==`, `!=`) da `true` o `false`
- **Práctica**: [Clic para programar](https://onlinegdb.com/ENLACE-PRACTICA-2)  **¡Inicio inmediato!**

---

### Lección 3: Decisiones y bucles (9 minutos)

- **Descripción**: Haz que tu programa tome decisiones con `if-else` y repita tareas con `for` y `while`: tablas de multiplicar, cuentas regresivas y más.
- **Enlace**: [Ver la lección](https://youtube/watch?v=xc7Lo5C7M9I)
- **Conceptos clave**:
  - `if` ejecuta un bloque solo si se cumple una condición; `else if` y `else` cubren los otros casos
  - `&&` (y), `||` (o) y `!` (no) combinan condiciones
  - `for` repite una cantidad conocida de veces: `for (int i = 1; i <= 10; i++)`
  - `while` repite mientras la condición sea verdadera; si no cambias la variable, el bucle nunca termina
- **Práctica**: [Clic para programar](https://onlinegdb.com/bUspz02Dq)  **¡No necesitas registrarte!**

---

### Lección 4: Métodos y entrada con Scanner (9 minutos)

- **Descripción**: Organiza tu código en métodos reutilizables y haz que tu programa te haga preguntas y use tus respuestas.
- **Enlace**: [Ver la lección](https://youtu.be/ENLACE-LECCION-4)
- **Conceptos clave**:
  - Un método es un bloque de código con nombre que puedes usar muchas veces
  - Los parámetros son los datos que recibe un método; `return` devuelve un resultado
  - Un método `void` hace algo pero no devuelve nada
  - `Scanner teclado = new Scanner(System.in);` lee lo que escribe el usuario
- **Práctica**: [Haz clic para practicar](https://onlinegdb.com/ENLACE-PRACTICA-4)  **¡Escribe en la consola y presiona Enter!**

---

### Lección 5: Clases y objetos — tu mascota virtual (9 minutos)

- **Descripción**: Bienvenido a la Programación Orientada a Objetos. Crea tu primera clase con atributos, constructor y métodos, y da vida a varias mascotas virtuales.
- **Enlace**: [Ver la lección](https://youtu.be/ENLACE-LECCION-5)
- **Conceptos clave**:
  - Una clase es el molde; un objeto es lo que creas con ese molde
  - Los atributos son lo que el objeto **tiene**; los métodos, lo que **hace**
  - El constructor prepara el objeto al crearlo con `new`
  - `this.nombre` se refiere al atributo del objeto actual
- **Práctica**: [Crea tu mascota](https://onlinegdb.com/ENLACE-PRACTICA-5)  **¡No necesitas registrarte!**

---

### Lección 6: Encapsulación, arrays y cadenas (8 minutos)

- **Descripción**: Protege los datos de tus objetos con `private`, getters y setters, y guarda a todo un salón de estudiantes en un array.
- **Enlace**: [Ver la lección](https://youtu.be/ENLACE-LECCION-6)
- **Conceptos clave**:
  - `private` impide que se cambie un atributo desde fuera de la clase
  - El getter permite leer; el setter permite cambiar con reglas (por ejemplo, notas entre 0 y 20)
  - Un array guarda varios valores del mismo tipo y sus índices empiezan en `0`
  - Los textos también tienen métodos: `.length()`, `.toUpperCase()`, `.equals()`
- **Práctica**: [Clic para programar](https://onlinegdb.com/ENLACE-PRACTICA-6)  **¡Inicio inmediato!**

---

### Lección 7: Proyecto final — Juego de adivinanzas con clases (9 minutos)

- **Descripción**: Construye un juego en el que la computadora piensa un número y tú lo adivinas con pistas. Integra todo lo aprendido en el curso.
- **Enlace**: [Ver la lección](https://youtu.be/ENLACE-LECCION-7)
- **Conceptos clave**:
  - Dividir el programa en clases (`JuegoAdivinanza` y `Jugador`) hace el código más fácil de entender
  - Un `while` con dos condiciones controla cuándo termina el juego
  - Los atributos privados y los getters protegen el estado del juego
  - Un array guarda el historial de intentos
- **Proyecto final**: [Crea tu juego](https://onlinegdb.com/ENLACE-PRACTICA-7)  **¡Guarda y comparte!**

---

### Lección 8: Buenas prácticas y errores comunes (6 minutos)

- **Descripción**: Conviértete en detective: encuentra y corrige los 5 errores de un programa leyendo los mensajes de error, y aprende hábitos para escribir código claro.
- **Enlace**: [Ver la lección](https://youtu.be/ENLACE-LECCION-8)
- **Conceptos clave**:
  - El mensaje de error indica la línea y el problema: léelo completo
  - Errores típicos: `;` faltante, mayúsculas/minúsculas, olvidar `new`, salirse del array, olvidar `this`
  - Usa nombres descriptivos (`sumaNotas`, no `x`) y constantes en lugar de números sueltos
  - Ejecuta tu programa seguido: es más fácil encontrar un error a la vez
- **Práctica**: [Encuentra los errores](https://onlinegdb.com/ENLACE-PRACTICA-8) **¡Inicio inmediato!**

---

## Recursos adicionales

**Código fuente completo**: [Repositorio de GitHub](https://github.com/upc-pre-202620-1asi0729-7800-stackforge/java-fundamentals-course-stackforge.git)

**Todas las actividades prácticas**:

| Lección | Actividad | Empezar a programar | Solución |
|---|---|---|---|
| 1 | Hola mundo | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-1) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-01-hola-mundo) |
| 2 | Perfil y calculadora de notas | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-2) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-02-variables-y-operadores) |
| 3 | Tablas de multiplicar y cuenta regresiva | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-3) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-03-decisiones-y-bucles) |
| 4 | Promedio con métodos y Scanner | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-4) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-04-metodos-y-entrada) |
| 5 | Mascota virtual | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-5) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-05-clases-y-objetos) |
| 6 | Registro de estudiantes | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-6) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-06-encapsulacion-y-arrays) |
| 7 | Juego de adivinanzas | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-7) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-07-proyecto-final) |
| 8 | Detective de errores | [OnlineGDB](https://onlinegdb.com/ENLACE-PRACTICA-8) | [Ver código](https://github.com/nombre-organizacion/java-fundamentals-course-nombre-equipo/tree/main/completed-examples/leccion-08-buenas-practicas-y-errores) |

**Documentación oficial de Java**: [docs.oracle.com/en/java](https://docs.oracle.com/en/java/)  
**Compartir**: #JavaBeginners

**¡Gracias por completar el curso!**

---

## 🎓 Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202620  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 7800

**Nombre del equipo**: stackforge
**Líder del equipo**: Ramirez Ruiz, Nickolas  
**Integrantes del equipo**:
- [Apellidos], Eddo ([código])
- [Apellidos], Jose ([código])
- [Apellidos], Mathias ([código])
- Ramirez Ruiz, Nickolas (u202415551)
- [Apellidos], Salvador ([código])



### Resumen de la elaboración en equipo

| Integrante | Lecciones (guion, código y video) | Otras responsabilidades |
|---|---|---|
| Ramirez Ruiz, Nickolas | Lección 1 | Coordinación, documento del plan de curso (`course-plan.md`), informe de participación |
| [Apellidos], Mathias | Lecciones 2 y 6 | `README.md` del repositorio |
| [Apellidos], Salvador | Lecciones 3 y 8 | Revisión técnica de todo el código Java |
| [Apellidos], Jose | Lecciones 4 y 5 | Creación y prueba de los enlaces de práctica en OnlineGDB |
| [Apellidos], Eddo | Lección 7 | Plantilla de edición (textos en pantalla, pausas) y control de calidad de audio y video |

**Forma de trabajo**: cada integrante trabajó en una rama propia del repositorio e integró sus aportes mediante *pull requests* revisados por al menos otro integrante. Los commits de cada persona evidencian su participación. Todos los ejemplos fueron probados en OnlineGDB antes de grabar.
