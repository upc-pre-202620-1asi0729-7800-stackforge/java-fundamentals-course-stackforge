// Lección 8: Detective de errores — versión corregida y con buenas prácticas
//
// Errores corregidos:
//  1. Faltaba ";" al final de una línea                 -> error de compilación
//  2. Faltaba "new" al crear un objeto                  -> error de compilación
//  3. "system" en minúscula (Java distingue mayúsculas) -> error de compilación
//  4. "i <= salon.length" se salía del array            -> ArrayIndexOutOfBoundsException
//  5. "nombre = nombre" no guardaba el dato (faltaba this) -> se mostraba "null"
//
// Buenas prácticas aplicadas:
//  - Nombres descriptivos (sumaNotas en lugar de x)
//  - Constante con nombre para el "número mágico" 11
//  - Un método pequeño con una sola tarea
//  - Indentación consistente

class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
}

public class Main {
    static final int NOTA_MINIMA_APROBATORIA = 11;

    static void mostrarResultado(Estudiante estudiante) {
        if (estudiante.getNota() >= NOTA_MINIMA_APROBATORIA) {
            System.out.println(estudiante.getNombre() + " aprobó");
        } else {
            System.out.println(estudiante.getNombre() + " desaprobó");
        }
    }

    public static void main(String[] args) {
        Estudiante[] salon = new Estudiante[3];
        salon[0] = new Estudiante("Ana", 17);
        salon[1] = new Estudiante("Bruno", 9);
        salon[2] = new Estudiante("Camila", 19);

        int sumaNotas = 0;
        for (int i = 0; i < salon.length; i++) {
            sumaNotas += salon[i].getNota();
            mostrarResultado(salon[i]);
        }

        double promedio = (double) sumaNotas / salon.length;
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
