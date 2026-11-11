// Lección 4: Métodos (funciones), parámetros y entrada con Scanner

import java.util.Scanner;

public class Main {

    // Un método es un bloque de código con nombre que podemos reutilizar.
    // "nombre" es un parámetro: el dato que el método recibe.
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
    }

    // Este método recibe tres números y DEVUELVE (return) un resultado
    public static double calcularPromedio(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static boolean estaAprobado(double promedio) {
        return promedio >= 11;
    }

    public static void main(String[] args) {
        // Scanner lee lo que el usuario escribe en la consola
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        System.out.print("Escribe tu primera nota: ");
        int nota1 = teclado.nextInt();
        System.out.print("Escribe tu segunda nota: ");
        int nota2 = teclado.nextInt();
        System.out.print("Escribe tu tercera nota: ");
        int nota3 = teclado.nextInt();

        double promedio = calcularPromedio(nota1, nota2, nota3);
        System.out.printf("Tu promedio es %.2f%n", promedio);

        if (estaAprobado(promedio)) {
            System.out.println("¡Aprobaste, " + nombre + "!");
        } else {
            System.out.println("Aún no apruebas, " + nombre + ". ¡A practicar!");
        }

        teclado.close();
    }
}
