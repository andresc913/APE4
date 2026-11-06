public class Cuenta {
 private String titular;
 private double saldo;
 public Cuenta(String titular, double saldoInicial) {
 this.titular = titular;
 this.saldo = saldoInicial;
 }
 public String getTitular() { return titular; }
 public double getSaldo() { return saldo; }
 public void transferir(Cuenta destino, double monto) {
 if (destino == null) {
 System.out.println("Transferencia fallida: la cuenta destino no es
válida.");
 return;
 }
 if (monto <= 0) {
 System.out.println("Transferencia fallida: el monto debe ser mayor que
cero.");
 return;
 }
 if (saldo >= monto) {
 saldo -= monto;
 destino.saldo += monto;
 System.out.println("Transferencia exitosa de $" + String.format("%.2f",
monto) + " desde " + titular + " hacia " + destino.titular + ".");
 } else  {
   System.out.println("Transferencia fallida: fondos insuficientes en la
cuenta de " + titular + ".");
 }
 }
 public void mostrarCuenta() {
 System.out.println("Titular: " + titular);
 System.out.println("Saldo: $" + String.format("%.2f", saldo));
 }
}
public class Main {
 public static void main(String[] args) {
 Cuenta cuenta1 = new Cuenta("Ana", 500.00);
 Cuenta cuenta2 = new Cuenta("Carlos", 200.00);
 System.out.println("=== SALDOS INICIALES ===");
 cuenta1.mostrarCuenta();
 System.out.println("-----------------------");
 cuenta2.mostrarCuenta();
 System.out.println("\n=== TRANSFERENCIA VÁLIDA ===");
 cuenta1.transferir(cuenta2, 150.00);
 System.out.println("\n=== TRANSFERENCIA QUE FALLA ===");
 cuenta1.transferir(cuenta2, 1000.00);
 System.out.println("\n=== SALDOS FINALES ===");
 cuenta1.mostrarCuenta();
 System.out.println("-----------------------");
 cuenta2.mostrarCuenta();
 }
}
