// Lección 6: Encapsulación (private + getters/setters) y arrays de objetos

class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        setNota(nota);
    }

    public String getNombre() {
        return nombre;
    }

    // RETO 1: Crea el getter getNota().

    // RETO 2: Completa el setter para que solo acepte notas entre 0 y 20.
    // Si la nota no es válida, muestra un mensaje y guarda 0.
    public void setNota(int nota) {
        this.nota = nota; // agrega la validación con if
    }

    // RETO 3: Crea un método estaAprobado() que devuelva true si nota >= 11.
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] salon = new Estudiante[3];
        salon[0] = new Estudiante("Ana", 17);
        salon[1] = new Estudiante("Bruno", 9);
        salon[2] = new Estudiante("Camila", 25); // ¿qué debería pasar aquí?

        // RETO 4: Recorre el array con un for y muestra el nombre y la nota
        // de cada estudiante. Pista: salon.length te da el tamaño.

        // RETO 5: Calcula el promedio del salón.

        // RETO EXTRA: Muestra en MAYÚSCULAS el nombre del estudiante con mejor nota.
        // Pista: nombre.toUpperCase()

    }
}
