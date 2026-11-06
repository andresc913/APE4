public class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double cantidad) {
        saldo += cantidad;
    }
}

public class cuentaOb {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana", 200);
        Cuenta c2 = new Cuenta("Luis", 350);

        int meses1 = 0;
        int meses2 = 0;

        System.out.println("Cuenta de Ana:");
        while (c1.saldo < 500) {
            c1.depositar(50);
            meses1++;
            System.out.println(c1.titular + " : " + c1.saldo);
        }
        System.out.println("Meses necesarios: " + meses1);

        System.out.println("\nCuenta de Luis:");
        while (c2.saldo < 500) {
            c2.depositar(50);
            meses2++;
            System.out.println(c2.titular + " : " + c2.saldo);
        }
        System.out.println("Meses necesarios: " + meses2);
    }
}
