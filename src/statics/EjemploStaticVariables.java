package statics;

class Humano{
    static int numeroDeHumanos = 0;
    String nombre;
    public Humano(){

    }

    public Humano(String nombre){
        this.nombre = nombre;
        numeroDeHumanos++;
    }
    {
        numeroDeHumanos++;
    }
}

public class EjemploStaticVariables {


    public static void main(String[] args) {
        System.out.println(Humano.numeroDeHumanos);
        new Humano();
        new Humano();
        new Humano();
        new Humano();
        new Humano();
        System.out.println(Humano.numeroDeHumanos);
    }

}
