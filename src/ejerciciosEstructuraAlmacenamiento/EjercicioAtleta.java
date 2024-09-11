package ejerciciosEstructuraAlmacenamiento;

class Atleta{
    int identificador;
    String nombreAtleta;
    double tiempoPrueba;

    static int contadorAtletas =0;
    static String seleccion = "Colombia";
    static double tiempoEquipo;

    public Atleta(String nombreAtleta, double tiempoPrueba) {
        contadorAtletas++;
        identificador = contadorAtletas;
        this.nombreAtleta = nombreAtleta;
        this.tiempoPrueba = tiempoPrueba;
    }

    void correrCarrera(){

        System.out.println(tiempoEquipo +=tiempoPrueba);

    }

    public static void equipoPais(){
        System.out.println("Equipo de: " + seleccion);
    }

    public void imprimir() {
        System.out.println("Identificador del atleta = " + identificador);
        System.out.println("Nombre del atleta = " + nombreAtleta);
        System.out.println("Tiempo del atleta = " + tiempoPrueba + "segundos");
        System.out.println();
    }

    static void tiempoTotal(){

        System.out.println("Tiempo total de equipo: " + tiempoEquipo);
    }

    public static void main(String[] args) {
        Atleta at = new Atleta("Alejandro Perlaza", 9.55);
        Atleta at2 = new Atleta("Anthony Zambrano", 9.28);
        Atleta at3 = new Atleta("Diego Palomeque", 9.53);
        Atleta at4 = new Atleta("Gilmar Herrera", 9.29);

        at.correrCarrera();
        at2.correrCarrera();
        at3.correrCarrera();
        at4.correrCarrera();

        at.imprimir();
        at2.imprimir();
        at3.imprimir();
        at4.imprimir();
        Atleta.tiempoTotal();


    }
}



public class EjercicioAtleta {

}
