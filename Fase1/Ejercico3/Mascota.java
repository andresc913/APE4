public class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    void mostrar() {
        System.out.print(nombre + " : " + especie + " : " + peso);
        if (peso > 20) {
            System.out.print(" Revisar peso");
        }
        System.out.println();
    }
}

public class mascotaOb {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 4, 25);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 5);
        Mascota m3 = new Mascota("Luna", "Perro", 3, 18);

        m1.mostrar();
        m2.mostrar();
        m3.mostrar();

        // m4 y m1 apuntan al mismo objeto en memoria
        Mascota m4 = m1;
        m4.edad++;

        System.out.println("Edad de m1: " + m1.edad);
    }
}
