package Herencia;

public class Trabajador extends Persona{
    float sueldo;

    Trabajador(float sueldo, String nombre, String fechaNacimiento){
        super(nombre, fechaNacimiento);
        this.sueldo = sueldo;
    }

    void trabajar(){

        System.out.println("Soy " + nombre + " y estoy trabajando");
    }

    void cobrar(){

        System.out.println("Soy " + nombre + " y estoy cobrando " + sueldo);
    }
}
