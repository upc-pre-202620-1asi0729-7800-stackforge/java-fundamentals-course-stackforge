// Lección 5: Clases y objetos — nuestra primera clase "Mascota"
// Una CLASE es el molde (plano); un OBJETO es algo creado con ese molde.

class Mascota {
    // Atributos: lo que la mascota TIENE
    String nombre;
    String especie;
    int energia;
    int felicidad;

    // Constructor: se ejecuta al crear un objeto con "new"
    Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.energia = 50;
        this.felicidad = 50;
    }

    // Métodos: lo que la mascota HACE
    void comer() {
        energia += 20;
        System.out.println(nombre + " comió. ¡Ñam!");
    }

    void jugar() {
        energia -= 15;
        felicidad += 25;
        System.out.println(nombre + " jugó contigo. ¡Qué divertido!");
    }

    void mostrarEstado() {
        System.out.println("[" + especie + "] " + nombre
                + " | Energía: " + energia + " | Felicidad: " + felicidad);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creamos dos objetos distintos a partir de la misma clase
        Mascota perro = new Mascota("Firulais", "Perro");
        Mascota gato = new Mascota("Michi", "Gato");

        perro.mostrarEstado();
        gato.mostrarEstado();

        perro.jugar();
        perro.comer();
        gato.jugar();
        gato.jugar();

        System.out.println("--- Estado final ---");
        perro.mostrarEstado();
        gato.mostrarEstado();
    }
}
