// Lección 3: Decisiones (if-else) y bucles (for, while)

public class Main {
    public static void main(String[] args) {
        // --- Decisiones con if / else if / else ---
        int nota = 14;

        if (nota >= 18) {
            System.out.println("¡Excelente!");
        } else if (nota >= 11) {
            System.out.println("Aprobado. ¡Sigue así!");
        } else {
            System.out.println("Desaprobado. ¡Puedes mejorar!");
        }

        // Operadores lógicos: && (y), || (o), ! (no)
        int edad = 13;
        boolean tienePermiso = true;
        if (edad >= 12 && tienePermiso) {
            System.out.println("Puedes entrar al taller de robótica.");
        }

        // --- Bucle for: cuando sabemos cuántas veces repetir ---
        int numero = 7;
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // --- Bucle while: repetir mientras se cumpla una condición ---
        int cuentaRegresiva = 5;
        while (cuentaRegresiva > 0) {
            System.out.println(cuentaRegresiva + "...");
            cuentaRegresiva--; // ¡Importante! Sin esto el bucle nunca termina
        }
        System.out.println("¡Despegue!");

        // Combinando bucles y decisiones: números pares del 1 al 10
        System.out.print("Números pares: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
