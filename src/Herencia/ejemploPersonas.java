package Herencia;

public class ejemploPersonas {
    public static void main(String[] args) {
        Estudiante e = new Estudiante(101214, "Darwin", "30-11-96");

        e.dormir();
        e.aprobar();
        e.reprobar();

        System.out.println("------");

        Trabajador t = new Trabajador(124151, "Darwin", "1996-30-11");

        t.trabajar();
        t.cobrar();
    }
}
