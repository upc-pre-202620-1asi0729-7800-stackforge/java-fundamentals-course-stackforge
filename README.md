# Fundamentos de Java para Principiantes — código fuente

Código de práctica y soluciones del curso en video **Fundamentos de Java para Principiantes**, dirigido a estudiantes de secundaria (12 a 17 años) sin experiencia previa en programación.

Plan completo del curso, con enlaces a los videos: [`course-plan.md`](course-plan.md)

## Estructura del repositorio

```
java-fundamentals-course-stackforge/
├── README.md
├── course-plan.md                         <- Plan del curso con enlaces a YouTube y editores en línea
├── starter-files/                         <- Código inicial con RETOS para completar
│   ├── lesson-01-hello-world/Main.java
│   ├── lesson-02-variables-and-operators/Main.java
│   ├── lesson-03-control-structures/Main.java
│   ├── lesson-04-methods-and-input/Main.java
│   ├── lesson-05-classes-and-objects/Main.java
│   ├── lesson-06-encapsulation-and-arrays/Main.java
│   ├── lesson-07-final-project/Main.java
│   └── lesson-08-best-practices-and-errors/Main.java
├── completed-examples/                    <- Soluciones completas de cada lección
│   ├── lesson-01-hello-world/Main.java
│   ├── lesson-02-variables-and-operators/Main.java
│   ├── lesson-03-control-structures/Main.java
│   ├── lesson-04-methods-and-input/Main.java
│   ├── lesson-05-classes-and-objects/Main.java
│   ├── lesson-06-encapsulation-and-arrays/Main.java
│   ├── lesson-07-final-project/Main.java
│   └── lesson-08-best-practices-and-errors/Main.java
└── scripts/                               <- Guiones de cada video
    ├── lesson-01-script.md
    ├── lesson-02-script.md
    ├── lesson-03-script.md
    ├── lesson-04-script.md
    ├── lesson-05-script.md
    ├── lesson-06-script.md
    ├── lesson-07-script.md
    └── lesson-08-script.md
```

Cada lección tiene su carpeta (`lesson-01-hello-world`, `lesson-02-variables-and-operators`, …) con un único archivo `Main.java`.

## Instrucciones de configuración (¡sin instalar nada!)

Solo necesitas un navegador web (Chrome, Firefox, Safari o Edge).

**Opción A — Enlace directo (recomendada)**
1. Abre el enlace de práctica de la lección en [`course-plan.md`](course-plan.md). El código ya está cargado.
2. Presiona **Run**.

**Opción B — Copiar y pegar**
1. Entra a [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y verifica que el lenguaje sea **Java**.
2. Abre el archivo `Main.java` de la lección en este repositorio y presiona el botón **Copy raw file**.
3. Borra el código del editor, pega el tuyo y presiona **Run**.

También funciona en [JDoodle](https://www.jdoodle.com/online-java-compiler) o [Replit](https://replit.com/). Todas las clases de cada lección están en un solo archivo y solo la clase `Main` es `public`, por eso el código corre igual en cualquiera de estos editores.

> En las lecciones 4 y 7 el programa te hace preguntas: escribe tu respuesta en la consola y presiona **Enter**.

## Lecciones

| # | Lección | Duración | Conceptos |
|---|---|---|---|
| 1 | ¿Qué es programar y qué es Java? | 6 min | Programa, consola, `println` |
| 2 | Variables, tipos de datos y operadores | 8 min | `int`, `double`, `String`, `boolean`, `char`, operadores |
| 3 | Decisiones y bucles | 9 min | `if / else`, `for`, `while` |
| 4 | Métodos y entrada con Scanner | 9 min | Parámetros, `return`, `Scanner` |
| 5 | Clases y objetos | 9 min | Clase, objeto, constructor, `new` |
| 6 | Encapsulación, arrays y cadenas | 8 min | `private`, getters/setters, arrays |
| 7 | Proyecto final: juego de adivinanzas | 9 min | Integración de todo el curso |
| 8 | Buenas prácticas y errores comunes | 6 min | Leer errores, nombres claros, constantes |

> El archivo `starter-files/lesson-08-best-practices-and-errors/Main.java` **no compila a propósito**: el reto es encontrar y corregir sus errores.

## Requisitos técnicos

Los ejemplos usan Java estándar (sin bibliotecas externas) y fueron probados con Java 21 (compatibles con Java 17 o superior).

## Licencia

Contenido educativo de uso libre con fines de aprendizaje.
