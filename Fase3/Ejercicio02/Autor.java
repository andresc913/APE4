public class Autor {
 private String nombre;
 private String nacionalidad;
 public Autor(String nombre, String nacionalidad) {
 this.nombre = nombre;
   this.nacionalidad = nacionalidad;
 }
 public String getNombre() { return nombre; }
 public String getNacionalidad() { return nacionalidad; }
}
public class Libro {
 private String titulo;
 private int anio;
 private Autor autor;
 public Libro(String titulo, int anio, Autor autor) {
 this.titulo = titulo;
 this.anio = anio;
 this.autor = autor;
 }
 public void mostrarInformacion() {
 System.out.println("Título: " + titulo);
 System.out.println("Año: " + anio);
 System.out.println("Autor: " + autor.getNombre());
 System.out.println("Nacionalidad del autor: " + autor.getNacionalidad());
 System.out.println("----------------------------------------");
 }
}
public class Main {
 public static void main(String[] args) {
 Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
 Autor autor2 = new Autor("Julio Verne", "Francesa");
 Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
 Libro libro2 = new Libro("Veinte mil leguas de viaje submarino", 1870,
autor2);
 System.out.println("=== INFORMACIÓN DE LOS LIBROS ===");
 libro1.mostrarInformacion();
 libro2.mostrarInformacion();
 }
}
   
