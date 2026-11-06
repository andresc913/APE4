public class Estudiante {
    String nombre;
    double nota1, nota2, nota3;
    double promedio;

    Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3.0;
    }

    void mostrar() {
        calcularPromedio();
        System.out.print(nombre + " : " + String.format("%.2f", promedio));
        if (promedio >= 7.0) {
            System.out.println(" Aprobado");
        } else if (promedio >= 5.0) {
            System.out.println(" Supletorio");
        } else {
            System.out.println(" Reprobado");
        }
    }
}
