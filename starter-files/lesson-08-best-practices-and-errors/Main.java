// Lección 8: Detective de errores
// Este programa tiene 5 errores escondidos. Tu misión:
//  1. Presiona "Run".
//  2. Lee el mensaje de error: te dice la LÍNEA y el PROBLEMA.
//  3. Corrige UN error, vuelve a ejecutar y repite.
// Cuando funcione, mejora los nombres de las variables poco claras.

class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante(String nombre, int nota) {
        nombre = nombre;
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
    public static void main(String[] args) {
        Estudiante[] salon = new Estudiante[3];
        salon[0] = new Estudiante("Ana", 17)
        salon[1] = new Estudiante("Bruno", 9);
        salon[2] = Estudiante("Camila", 19);

        int x = 0;
        for (int i = 0; i <= salon.length; i++) {
            Estudiante e = salon[i];
            x = x + e.getNota();
            if (e.getNota() >= 11) {
                System.out.println(e.getNombre() + " aprobó");
            } else {
                system.out.println(e.getNombre() + " desaprobó");
            }
        }

        System.out.println("Promedio: " + (double) x / salon.length);
    }
}
