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

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 8, 9, 7);
        Estudiante e2 = new Estudiante("Luis", 6, 5, 6);
        Estudiante e3 = new Estudiante("Pedro", 4, 3, 5);
        Estudiante e4 = new Estudiante("Maria", 9, 8, 10);
        Estudiante e5 = new Estudiante("Carlos", 7, 7, 6);

        Estudiante[] estudiantes = {e1, e2, e3, e4, e5};
        int aprobados = 0;

        for (Estudiante e : estudiantes) {
            e.mostrar();
            if (e.promedio >= 7.0) {
                aprobados++;
            }
        }
        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}

