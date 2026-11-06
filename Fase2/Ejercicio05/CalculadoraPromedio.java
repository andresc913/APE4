public class CalculadoraPromedio {
 public double calcularPromedio(double n1, double n2, double n3) {
 double promedio = (n1 + n2 + n3) / 3.0;
 return promedio;
 }
 public static void main(String[] args) {
 CalculadoraPromedio calculadora = new CalculadoraPromedio();
 double resultado = calculadora.calcularPromedio(8.0, 9.0, 10.0);
 System.out.println("Promedio: " + resultado);
 }
}
