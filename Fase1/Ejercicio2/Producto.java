public class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        }
    }

    void mostrar() {
        System.out.print(nombre + " : " + precio);
        if (stock < 5) {
            System.out.print(" Reponer");
        }
        System.out.println(" (Stock: " + stock + ")");
    }
}

public class productoOb {
    public static void main(String[] args) {
        Producto p1 = new Producto("Arroz", 1.50, 10);
        Producto p2 = new Producto("Leche", 1.20, 7);
        Producto p3 = new Producto("Pan", 0.50, 4);
        Producto p4 = new Producto("Aceite", 3.00, 8);

        // Venta de 3 unidades de dos productos
        p1.vender(3);
        p2.vender(3);

        Producto[] productos = {p1, p2, p3, p4};
        double total = 0;

        for (Producto p : productos) {
            p.mostrar();
            total += p.precio * p.stock;
        }

        System.out.println("Valor total del inventario: " + String.format("%.2f", total));
    }
}
