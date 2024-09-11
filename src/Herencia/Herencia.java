package Herencia;

class Animal{
    String nombre;
    public void respirar(){
        System.out.println("Ando respirando");
    }
}

class Perro extends Animal{
    public void ladrar(){
        System.out.println("Estoy ladrando");
    }
}

public class Herencia {
    public static void main(String[] args) {

        Animal a = new Animal();

        Perro p = new Perro();
        p.nombre = "Atila";
        p.ladrar();
        p.respirar();
    }
}