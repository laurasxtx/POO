public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.titular = "Sin titular";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }

    // Constructor con parámetros y validaciones
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        // Validar que el titular no esté vacío
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            this.titular = "Sin titular";
        }

        // Validar que el número de cuenta tenga al menos 6 dígitos
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        } else {
            this.numeroCuenta = "000000";
        }

        // Validar que el saldo sea mayor o igual a 0
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso: " + cantidad);
        } else {
            System.out.println("Cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso: " + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // Método toString para mostrar información básica
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println(cuenta1.toString());

        CuentaBancaria cuenta2 = new CuentaBancaria("laura soto", "1234567", 500);
        System.out.println(cuenta2.toString());

        cuenta2.depositar(200);
        System.out.println(cuenta2.toString());

        cuenta2.retirar(100);
        System.out.println(cuenta2.toString());

        cuenta2.retirar(700); // Intento de retirar más del saldo
    }
}