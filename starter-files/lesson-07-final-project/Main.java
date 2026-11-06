// Lección 7: Proyecto final — Juego de adivinanzas con clases
// Completa los RETOS en orden. Ejecuta el programa después de cada uno.
//Eddo Su Caletti 

import java.util.Random;
import java.util.Scanner;

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

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    // RETO 1: Completa evaluar para que devuelva:
    //  "correcto" si intento es igual al número secreto,
    //  "El número secreto es MAYOR" si intento es menor,
    //  "El número secreto es MENOR" en otro caso.
    public String evaluar(int intento) {
        return "";
    }
}

// RETO 2: Crea una clase Jugador con atributos privados:
//  nombre (String) y totalIntentos (int),
//  un constructor, getters y un método registrarIntento() que sume 1.

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        JuegoAdivinanza juego = new JuegoAdivinanza(50, 7);

        System.out.println("Pensé un número del 1 al 50. Tienes 7 intentos.");

        // RETO 3: Pide el nombre del jugador y crea un objeto Jugador.

        // RETO 4: Usa un bucle while que se repita mientras el jugador
        // no haya ganado y le queden intentos. En cada vuelta:
        //  - lee un número con teclado.nextInt()
        //  - registra el intento
        //  - muestra la pista que devuelve juego.evaluar(...)

        // RETO 5: Al terminar, muestra si ganó o cuál era el número secreto.

        // RETO EXTRA: Guarda cada número probado en un array y muéstralos al final.

        teclado.close();
    }
}
