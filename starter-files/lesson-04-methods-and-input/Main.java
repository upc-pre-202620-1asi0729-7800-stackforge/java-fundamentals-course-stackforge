// Lección 4: Métodos (funciones), parámetros y entrada con Scanner

import java.util.Scanner;

public class Main {

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // RETO 1: Completa este método para que devuelva el promedio de a, b y c.
    public static double calcularPromedio(int a, int b, int c) {
        return 0; // cambia esta línea
    }

    // RETO 2: Crea un método estaAprobado(double promedio) que devuelva
    // true si el promedio es 11 o más.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        // RETO 3: Pide 3 notas con teclado.nextInt(), llama a calcularPromedio
        // y muestra el resultado.

        // RETO 4: Usa tu método estaAprobado para mostrar si aprobó o no.

        teclado.close();
    }
}
