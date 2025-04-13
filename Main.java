package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300); // Se pasa una cantidad como parámetro
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
            System.out.println("Retiro realizado con éxito: " + cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695); // Este valor podría ser dinámico, si se requiere.
            System.out.println("Ingreso realizado con éxito");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
