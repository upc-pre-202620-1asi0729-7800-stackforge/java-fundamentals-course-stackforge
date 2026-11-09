// Lección 2: Variables, tipos de datos y operadores
// Una variable es como una caja con etiqueta donde guardamos un dato.

public class Main {
    public static void main(String[] args) {
        // Tipos de datos más usados
        String nombre = "Valeria";      // texto (va entre comillas dobles)
        int edad = 14;                  // número entero
        double estatura = 1.58;         // número con decimales
        boolean esEstudiante = true;    // verdadero o falso
        char inicial = 'V';             // un solo carácter (comillas simples)

        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial: " + inicial);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("¿Es estudiante? " + esEstudiante);

        // Operadores aritméticos: +  -  *  /  %
        int edadEnCincoAnios = edad + 5;
        System.out.println("En 5 años tendrá " + edadEnCincoAnios + " años.");

        int nota1 = 15;
        int nota2 = 18;
        int nota3 = 17;
        // Usamos 3.0 para que la división conserve los decimales
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Promedio de notas: " + promedio);

        // El operador % da el residuo de una división
        int caramelos = 17;
        int amigos = 5;
        System.out.println("A cada amigo le tocan " + (caramelos / amigos) + " caramelos.");
        System.out.println("Sobran " + (caramelos % amigos) + " caramelos.");

        // Las variables pueden cambiar de valor
        int puntos = 0;
        puntos = puntos + 10;
        puntos += 5; // forma corta de puntos = puntos + 5
        System.out.println("Puntos acumulados: " + puntos);

        // Operadores de comparación: dan como resultado true o false
        boolean esMayorDeEdad = edad >= 18;
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
    }
}
