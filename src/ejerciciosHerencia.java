import java.sql.SQLOutput;
import java.util.Scanner;

class Cuenta{
    float saldo;
    int numeroConsignacion = 0;
    int numerodeRetiros = 0;
    float tasaAnual;
    float comisionMensual=0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    void consignarDinero(float monto){
        saldo = saldo + monto;
        System.out.println("Su saldo al corte de hoy es de: " + saldo);
        numeroConsignacion = numeroConsignacion + 1;
    }

    void retirarDinero(float monto){
        float total = saldo - monto;

        if(total >= 0){
            saldo -= monto;
            numerodeRetiros = numerodeRetiros + 1;
        } else{
            System.out.println("Saldo Insuficiente");
        }
    }

    void  calcularInteresMensual(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }

    void calcularExtractoMensual(){
        saldo =- comisionMensual;
        calcularInteresMensual();
    }

    void imprimirData(){
        System.out.println("Saldo: $" + saldo);
        System.out.println("Numero de consignacion: " + numeroConsignacion);
        System.out.println("Numero de retiros: " + numerodeRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("ComisionMensual: $");
    }
}

class CuentaAhorros extends Cuenta{
    private boolean isActive;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000){
            isActive = false;
        } else{
            isActive = true;
        }

    }

    void consignar(float monto){
        if(isActive){
            super.consignarDinero(monto);
        }
    }

    void retirar(float monto){
        if (isActive){
            super.retirarDinero(monto);
        }
    }

    void extractoMensual(){
        if (numerodeRetiros > 4){
            comisionMensual+= (numerodeRetiros - 4) * 1000;
        }

        super.calcularExtractoMensual();
        if (saldo < 1000){
            isActive = false;
        }
    }

    void imprimirData(){
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comision mensual: $" + comisionMensual);
        System.out.println("Numero de transacciones: " + (numeroConsignacion + numerodeRetiros));
        System.out.println();
    }

}

class CuentaCorriente extends Cuenta{
    float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }

    void retirar(float monto){

        float total = saldo - monto;

        if (total < 0){
            sobregiro -= total;
            saldo = 0;
        } else {
            super.retirarDinero(monto);
        }
    }

    void consignar(float monto){

        float residuo = sobregiro - monto;

        if (sobregiro > 0){
            if (residuo>0){
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro -= residuo;
                saldo = 0;
            }
        } else {
            super.consignarDinero(monto);
        }
    }

    void extractoMensual(){
        super.calcularExtractoMensual();
    }

    void imprimirData(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Numero de transacciones: " + (numeroConsignacion + numerodeRetiros));
        System.out.println("Sobregiros: " + sobregiro);

    }
}

public class ejerciciosHerencia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial: ");
        float saldoInicial = input.nextFloat();
        System.out.println("Ingrese saldo de interes: ");
        float tasaAhorros = input.nextFloat();

//        instanciamos

        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicial, tasaAhorros);

        System.out.println("Ingresa la cantidad a consignar: $" );
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.println("Ingresa cantidad a retirar: $");
        float cantidadRetiro = input.nextFloat();
        cuenta1.retirar(cantidadRetiro);
        cuenta1.extractoMensual();
        cuenta1.imprimirData();

    }
}
