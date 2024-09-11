package Herencia;

public class Persona {
    String nombre;
    String fechaNacimiento;

    Persona(String nombre, String fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    void dormir(){
        System.out.println("Hola, soy " + nombre + " y estoy durmiendo");
    }

    void respirar(){
        System.out.println("Hola, soy " + nombre + " y estoy respirando desde " + fechaNacimiento);
    }

    void comer(){
        System.out.println("Hola, soy " + nombre + " y estoy comiendo");
    }
}
