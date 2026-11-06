public class Libro {
 private String titulo;
 private boolean disponible;
 public Libro(String titulo) {
 this.titulo = titulo ;
   this.disponible = true;
 }
 public String getTitulo() { return titulo; }

 public boolean prestar() {
 if (disponible) {
 disponible = false;
 return true;
 }
 return false;
 }
 public boolean isDisponible() { return disponible; }
}
public class Usuario {
 private String nombre;
 private String cedula;
 public Usuario(String nombre, String cedula) {
 this.nombre = nombre;
 this.cedula = cedula;
 }
 public String getNombre() { return nombre; }
}
public class Prestamo {
 private Usuario usuario;
 private Libro libro;
 public Prestamo(Usuario usuario, Libro libro) {
 this.usuario = usuario;
 this.libro = libro;
 }
 public void registrar() {
 System.out.println("\nUsuario: " + usuario.getNombre());
 System.out.println("Libro solicitado: " + libro.getTitulo());
 if (libro.prestar()) {
 System.out.println("Préstamo registrado correctamente.");
 } else {
 System.out.println("No se pudo realizar el préstamo: el libro no está
disponible.");
   }
 }
}
public class Main {
 public static void main(String[] args) {
 Usuario usuario1 = new Usuario("Ana López", "1234567890");
 Usuario usuario2 = new Usuario("Carlos Pérez", "0987654321");
 Libro libro = new Libro("Cien años de soledad");
 System.out.println("=== SISTEMA DE BIBLIOTECA ===");
 Prestamo prestamo1 = new Prestamo(usuario1, libro);
 prestamo1.registrar();
 Prestamo prestamo2 = new Prestamo(usuario2, libro);
 prestamo2.registrar();
 System.out.println("\n¿Está disponible el libro al final?: " +
(libro.isDisponible() ? "Sí" : "No"));
 }
}

 
   
