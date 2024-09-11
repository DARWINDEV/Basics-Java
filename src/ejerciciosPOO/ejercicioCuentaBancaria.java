package ejerciciosPOO;

class CuentaBancaria{
    String nombreTitular;
    String apellidoTitular;
    long numeroCuenta;
    enum tipoCuenta {AHORROS, CORRIENTE}
    tipoCuenta tipo;
    double saldoCuenta = 0;

    public CuentaBancaria(String nombreTitular, String apellidoTitular, long numeroCuenta, tipoCuenta tipo, double saldoCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
        this.saldoCuenta = saldoCuenta;
    }

    void imprimirPantalla(){
        System.out.println("Nombre titular: " + nombreTitular);
        System.out.println("Apellido: " + apellidoTitular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipo);
        System.out.println("Saldo actual: " + saldoCuenta);
        System.out.println("\n");
    }

    void consultarSaldo(){
        System.out.println("Su saldo actual: " + saldoCuenta);
    }

    void ingresarMonto(double deposito){

        System.out.println("Saldo a la fecha: " + (saldoCuenta += deposito));
    }

    void compararCuenta(CuentaBancaria cuenta2){
        if(saldoCuenta > cuenta2.saldoCuenta){
            System.out.println("Tu cuenta es mayor que la cuenta de " + cuenta2.nombreTitular);
        } else if (saldoCuenta < cuenta2.saldoCuenta) {
            System.out.println("Tu cuenta es menor que la de " + cuenta2.nombreTitular);
        } else{
            System.out.println("Ambas cuentas tienen los mismos montos");
        }
    }

    void retirarSaldo(double retiro){
        if (retiro > saldoCuenta){
            System.out.println("Fondos insuficientes");
        } else if (retiro == 0) {
            System.out.println("Favor de ingresar una cantidad valida");
        } else{
            System.out.println("Usted tenia: " + saldoCuenta);
            System.out.println("Saldo actual: " + (saldoCuenta -= retiro));
        }
    }

    void transferirSaldo(CuentaBancaria cuenta2, double transferencia){
        if (saldoCuenta > 0){
            System.out.println("El saldo actual de tu cuenta es: " + saldoCuenta);
            System.out.println("El saldo actual de la cuenta de " + cuenta2.nombreTitular + " es de: " + cuenta2.saldoCuenta);

            double operacion = (saldoCuenta -=transferencia);
            double deposito = (cuenta2.saldoCuenta += transferencia);
            System.out.println("TRANSFERENCIA REALIZADA");

            System.out.println("Ahora tu saldo actual es de: " + operacion);
            System.out.println("Ahora el saldo actual de la cuenta de " + cuenta2.nombreTitular + " es de: " + deposito);
        } else{
            System.out.println("No puede realizar transferencias, fondos insuficientes");
        }

    }


}



public class ejercicioCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Darwin", "Jimenez", 999999, CuentaBancaria.tipoCuenta.AHORROS, 30000);
        cuenta1.imprimirPantalla();

        CuentaBancaria cuenta2 = new CuentaBancaria("Edgar", "Jimenez", 999989, CuentaBancaria.tipoCuenta.AHORROS, 30000);
        cuenta2.imprimirPantalla();

        cuenta2.transferirSaldo(cuenta1, 1000);
        cuenta2.transferirSaldo(cuenta1, 5000);
    }
}
