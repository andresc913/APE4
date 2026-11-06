class ProductoBase {
 String nombre;
 int stock;
 double precioUnitario;
 public double calcularValorTotal() {
 return stock * precioUnitario;
 }
}
public class Principal {
 public static void main(String[] args) {
 ProductoBase p = new ProductoBase();
 p.stock = 10;
 p.precioUnitario = 25.5;
 double totalInventario = p.calcularValorTotal();
 System.out.println("Total del inventario: " + totalInventario);
 }
}
