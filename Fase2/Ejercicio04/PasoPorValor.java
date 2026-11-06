public class PasoPorValor {
 public void incrementar(int n) {
 n = n + 5;
 }
 public static void main(String[] args) {
 PasoPorValor ejemplo = new PasoPorValor();
 int numero = 10;
 ejemplo.incrementar(numero);
 // Imprime 10 ya que n recibe solo una copia
 System.out.println("Valor del número original: " + numero);
 }
}
