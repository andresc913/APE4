public class Libro {
    String titulo;
    String autor;
    boolean disponible;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    void prestar() {
        if (disponible) {
            disponible = false;
        }
    }

    void mostrar() {
        if (disponible) {
            System.out.println(titulo + ": Disponible");
        } else {
            System.out.println(titulo + ": Prestado");
        }
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    void prestarLibro(Libro libro) {
        if (libro.disponible) {
            libro.prestar();
            librosPrestados++;
        }
    }

    void mostrar() {
        System.out.println(nombre + " : " + librosPrestados);
    }
}

public class libroOb {
    public static void main(String[] args) {
        Libro l1 = new Libro("Don Quijote", "Cervantes");
        Libro l2 = new Libro("El principito", "Saint-Exupery");
        Libro l3 = new Libro("La Odisea", "Homero");
        Libro l4 = new Libro("Hamlet", "Shakespeare");

        Socio s1 = new Socio("Ana");
        Socio s2 = new Socio("Luis");

        // Ana presta dos libros
        s1.prestarLibro(l1);
        s1.prestarLibro(l2);

        // Luis presta un libro
        s2.prestarLibro(l3);

        Libro[] libros = {l1, l2, l3, l4};
        System.out.println("Estado de los libros:");
        int disponibles = 0;
        for (Libro libro : libros) {
            libro.mostrar();
            if (libro.disponible) {
                disponibles++;
            }
        }

        System.out.println("\nSocios:");
        s1.mostrar();
        s2.mostrar();
        System.out.println("Libros disponibles: " + disponibles);
    }
}
