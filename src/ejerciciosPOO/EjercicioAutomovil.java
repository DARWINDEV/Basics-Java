package ejerciciosPOO;

class Automovil{
    String nombreFabricante;
    int modelo;
    double motor;
    enum tipoCombustible{GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    tipoCombustible tipoC;
    enum tipoAutomovil {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoAutomovil tipoA;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMAX;
    enum colorSet {ROJO, PLATEADO, NEGRO, DORADO, BLANCO}
    colorSet tipoColor;
    int velocidadActual = 0;

    boolean isAutomatic = false;

    public Automovil(String nombreFabricante, int modelo, double motor, tipoCombustible tipoC, tipoAutomovil tipoA, int numeroPuertas, int cantidadAsientos, int velocidadMAX, colorSet tipoColor, int velocidadActual, boolean isAutomatic) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoC = tipoC;
        this.tipoA = tipoA;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMAX = velocidadMAX;
        this.tipoColor = tipoColor;
        this.velocidadActual = velocidadActual;
        this.isAutomatic = isAutomatic;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public tipoCombustible getTipoC() {
        return tipoC;
    }

    public void setTipoC(tipoCombustible tipoC) {
        this.tipoC = tipoC;
    }

    public tipoAutomovil getTipoA() {
        return tipoA;
    }

    public void setTipoA(tipoAutomovil tipoA) {
        this.tipoA = tipoA;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadMAX() {
        return velocidadMAX;
    }

    public void setVelocidadMAX(int velocidadMAX) {
        this.velocidadMAX = velocidadMAX;
    }

    public colorSet getTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(colorSet tipoColor) {
        this.tipoColor = tipoColor;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }


    void acelerar(int incrementoVelocidad){


        if (velocidadActual + incrementoVelocidad < velocidadMAX){
            System.out.println(velocidadActual = velocidadActual + incrementoVelocidad);
        } else {
            System.out.println("No se puede acelerar mas");
        }

    }

    void reducir( int reducirVelocidad){
        if ((velocidadActual - reducirVelocidad) < 0){
            System.out.println("No se puede reducir la velocidad");
        } else{
            System.out.println(velocidadActual = velocidadActual - reducirVelocidad);
        }
    }

    int frenar(){
        return velocidadActual = 0;
    }

    double calcularTiempo(int distancia){
        return distancia/velocidadActual;

    }

    void datosAuto(){
        System.out.println("Fabricante: " + nombreFabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de combustible: " + tipoC);
        System.out.println("Tipo de auto: " + tipoA);
        System.out.println("Numero de puertas: " + numeroPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad Maxima: " + velocidadMAX);
        System.out.println("Color: " + tipoColor);
        System.out.println("Velocidad actual: " + velocidadActual);


    }
}


public class EjercicioAutomovil {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford",2018,3,Automovil.tipoCombustible.DIESEL,Automovil.tipoAutomovil.EJECUTIVO,5,6,250,
                Automovil.colorSet.NEGRO,80, false);
        auto1.datosAuto();
        auto1.acelerar(10);
        auto1.reducir(30);
        auto1.calcularTiempo(3);
        auto1.acelerar(500);



    }
}
