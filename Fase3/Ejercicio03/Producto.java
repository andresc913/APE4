public class Producto {
 private String nombre;
 private double precio;
 private int stock;
 public Producto(String nombre, double precio, int stock) {
 this.nombre = nombre;
 this.precio = precio;
 this.stock = stock;
 }
 public String getNombre() { return nombre; }
 public double getPrecio() { return precio; }
 public int getStock() { return stock; }
 public void reducirStock(int cantidad) {
 if (cantidad > 0 && stock >= cantidad) {
 stock -= cantidad;
 System.out.println("Stock actualizado correctamente.");
 } else {
 System.out.println("Stock insuficiente.");
 }
 }
 public void mostrarProducto() {
 System.out.println("Producto: " + nombre);
 System.out.println("Precio: $" + String.format("%.2f", precio));
 System.out.println("Stock disponible: " + stock);
 }
}
public class Venta {
  private int cantidad;
 public Venta(int cantidad) {
 this.cantidad = cantidad;
 }
 public void aplicar(Producto producto) {
 System.out.println("\n--- PROCESANDO VENTA ---");
 producto.mostrarProducto();
 if (cantidad <= 0) {
 System.out.println("La cantidad debe ser mayor que cero.");
 return;
 }
 if (producto.getStock() >= cantidad) {
 double total = producto.getPrecio() * cantidad;
 producto.reducirStock(cantidad);
 System.out.println("Cantidad vendida: " + cantidad);
 System.out.println("Total a pagar: $" + String.format("%.2f", total));
 System.out.println("Stock restante: " + producto.getStock());
 } else {
 System.out.println("Stock insuficiente. No se realizó la venta.");
 }
 }
}
public class Main {
 public static void main(String[] args) {
 Producto producto1 = new Producto("Cuaderno", 2.50, 20);
 Producto producto2 = new Producto("Esfero", 0.75, 10);
 System.out.println("=== PRODUCTOS DISPONIBLES ===");
 producto1.mostrarProducto();
 System.out.println("-------------------------");
 producto2.mostrarProducto();
 Venta venta1 = new Venta(3);
 venta1.aplicar(producto1);
 Venta venta2 = new Venta(12);
 venta2.aplicar(producto2);
 System.out.println("\n=== STOCK FINAL ===");
 producto1.mostrarProducto();
 System.out.println("-------------------------");
 producto2.mostrarProducto();
 }
}
