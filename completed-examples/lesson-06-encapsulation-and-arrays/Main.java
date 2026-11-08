// Lección 6: Encapsulación (private + getters/setters), arrays de objetos y cadenas

class Estudiante {
    // "private": nadie fuera de la clase puede cambiar estos datos directamente
    private String nombre;
    private int nota;

    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        setNota(nota); // reutilizamos la validación del setter
    }

    // Getter: permite LEER un atributo privado
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    // Setter: permite CAMBIAR un atributo, pero con reglas
    public void setNota(int nota) {
        if (nota >= 0 && nota <= 20) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida para " + nombre + ": " + nota + " (debe estar entre 0 y 20)");
            this.nota = 0;
        }
    }

    public boolean estaAprobado() {
        return nota >= 11;
    }
}

public class Main {
    public static void main(String[] args) {
        // Un array guarda varios valores del mismo tipo
        Estudiante[] salon = new Estudiante[4];
        salon[0] = new Estudiante("Ana", 17);
        salon[1] = new Estudiante("Bruno", 9);
        salon[2] = new Estudiante("Camila", 19);
        salon[3] = new Estudiante("Diego", 25); // ¡el setter lo detecta!

        salon[3].setNota(14); // corregimos usando el setter

        int suma = 0;
        Estudiante mejor = salon[0];

        // salon.length nos dice cuántos elementos tiene el array
        for (int i = 0; i < salon.length; i++) {
            Estudiante e = salon[i];
            String estado = e.estaAprobado() ? "Aprobado" : "Desaprobado";
            System.out.println(e.getNombre() + ": " + e.getNota() + " -> " + estado);

            suma += e.getNota();
            if (e.getNota() > mejor.getNota()) {
                mejor = e;
            }
        }

        double promedio = (double) suma / salon.length;
        System.out.printf("Promedio del salón: %.2f%n", promedio);

        // Algunas operaciones útiles con String
        String nombreMejor = mejor.getNombre();
        System.out.println("Mejor nota: " + nombreMejor.toUpperCase()
                + " (" + nombreMejor.length() + " letras en su nombre)");
    }
}
