package Herencia;

public class Estudiante extends Persona{
    int numeroCuenta;
    Estudiante(int numeroCuenta, String nombre, String fechaNacimiento){
        super(nombre, fechaNacimiento);
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    void dormir(){
        System.out.println("Soy " + nombre + " y soy estudiante, no duermo");
    }

    void aprobar(){
        System.out.println("Soy " + nombre + " y aprobe mi examen");
    }

    void reprobar(){
        System.out.println("Soy " + nombre + " y reprobe mi examen");
    }
}
