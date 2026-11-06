// Lección 7: Proyecto final — Juego de adivinanzas con clases
// Integra: variables, if-else, while, métodos, Scanner, clases, encapsulación y arrays.

import java.util.Random;
import java.util.Scanner;

class Jugador {
    private String nombre;
    private int[] intentos;   // historial de números que probó
    private int totalIntentos;

    public Jugador(String nombre, int maxIntentos) {
        this.nombre = nombre;
        this.intentos = new int[maxIntentos];
        this.totalIntentos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalIntentos() {
        return totalIntentos;
    }

    public void registrarIntento(int numero) {
        if (totalIntentos < intentos.length) {
            intentos[totalIntentos] = numero;
            totalIntentos++;
        }
    }

    public void mostrarHistorial() {
        System.out.print("Tus intentos: ");
        for (int i = 0; i < totalIntentos; i++) {
            System.out.print(intentos[i] + " ");
        }
        System.out.println();
    }
}

class JuegoAdivinanza {
    private int numeroSecreto;
    private int maxIntentos;

    public JuegoAdivinanza(int limite, int maxIntentos) {
        Random azar = new Random();
        this.numeroSecreto = azar.nextInt(limite) + 1; // número entre 1 y limite
        this.maxIntentos = maxIntentos;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    // Devuelve una pista para el jugador
    public String evaluar(int intento) {
        if (intento == numeroSecreto) {
            return "correcto";
        } else if (intento < numeroSecreto) {
            return "El número secreto es MAYOR";
        } else {
            return "El número secreto es MENOR";
        }
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int LIMITE = 50;
        final int MAX_INTENTOS = 7;

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();

        Jugador jugador = new Jugador(nombre, MAX_INTENTOS);
        JuegoAdivinanza juego = new JuegoAdivinanza(LIMITE, MAX_INTENTOS);

        System.out.println("¡Hola, " + jugador.getNombre() + "! Pensé un número del 1 al " + LIMITE + ".");
        System.out.println("Tienes " + juego.getMaxIntentos() + " intentos. ¡Suerte!");

        boolean gano = false;
        while (!gano && jugador.getTotalIntentos() < juego.getMaxIntentos()) {
            System.out.print("Intento " + (jugador.getTotalIntentos() + 1) + ": ");
            int intento = teclado.nextInt();
            jugador.registrarIntento(intento);

            String resultado = juego.evaluar(intento);
            if (resultado.equals("correcto")) {
                gano = true;
            } else {
                System.out.println(resultado);
            }
        }

        if (gano) {
            System.out.println("¡Ganaste en " + jugador.getTotalIntentos() + " intentos!");
        } else {
            System.out.println("Se acabaron los intentos. El número era " + juego.getNumeroSecreto() + ".");
        }
        jugador.mostrarHistorial();
        teclado.close();
    }
}
