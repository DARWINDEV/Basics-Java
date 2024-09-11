package ejerciciosPOO;

class Cuenta{
    public String titular;
    public double cantidad;

    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    void ingresar(double saldo){

        if (saldo <=0){
            System.out.println("Ingrese una cantidad mayor a cero");
        } else{
            saldo +=getCantidad();
            System.out.println("Hola " + getTitular() + ", su saldo es de: " + saldo);
        }
    }

    void retirar(double saldo){
        if(saldo <= 0){
            System.out.println("Ustede tiene un saldo de cero pesos");
        } else{
            double total = getCantidad() - saldo;
            System.out.println("Hola " +getTitular()+", usted tiene un saldo de: " +total);
        }
    }
}

public class EjercicioCuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Darwin", 10000);
        c.ingresar(5000);
        c.retirar(5820);
    }
}
