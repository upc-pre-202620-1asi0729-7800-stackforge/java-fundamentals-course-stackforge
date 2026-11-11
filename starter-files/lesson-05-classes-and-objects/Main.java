// Lección 5: Clases y objetos — tu propia mascota virtual

class Mascota {
    String nombre;
    String especie;
    int energia;
    int felicidad;

    Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.energia = 50;
        this.felicidad = 50;
    }

    void comer() {
        energia += 20;
        System.out.println(nombre + " comió. ¡Ñam!");
    }

    // RETO 1: Crea un método jugar() que reste 15 de energía
    // y sume 25 de felicidad.

    // RETO 2: Crea un método mostrarEstado() que muestre
    // el nombre, la especie, la energía y la felicidad.

    // RETO EXTRA: Crea un método dormir() que sume 40 de energía.
}

public class Main {
    public static void main(String[] args) {
        Mascota perro = new Mascota("Firulais", "Perro");
        perro.comer();

        // RETO 3: Crea un segundo objeto Mascota (por ejemplo, un gato)
        // y haz que coma y juegue. Luego muestra el estado de ambos.

    }
}
