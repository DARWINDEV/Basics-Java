package ejerciciosPOO;

class Articulo{
    String nombreArticulo;
    String autor;
    String[] palabrasClave = new String [3];
    String nombrePublicacion;
    int year;
    String resumen;

    public Articulo(String nombreArticulo, String autor) {
        this.nombreArticulo = nombreArticulo;
        this.autor = autor;
    }

    public Articulo(String nombreArticulo, String autor, String[] palabrasClave, String nombrePublicacion, int year) {
        this(nombreArticulo, autor);
        this.palabrasClave = palabrasClave;
        this.nombrePublicacion = nombrePublicacion;
        this.year = year;
    }

    public Articulo(String nombreArticulo, String autor, String[] palabrasClave, String nombrePublicacion, int year, String resumen) {
        this(nombreArticulo, autor, palabrasClave, nombrePublicacion, year);
        this.resumen = resumen;
    }

    void listaPalabrasClave(){

        for (int i = 0; i < palabrasClave.length; i++){
            System.out.println(palabrasClave[i]);
        }
    }

    void imprimirData(){
        System.out.println("Nombre del articulo: " + nombreArticulo);
        System.out.println("Nombre del autor: " + autor);
        System.out.println("Palabras clave: ");
        listaPalabrasClave();
        System.out.println("Nombre de publicacion: " + nombrePublicacion);
        System.out.println("Año: " + year);
        System.out.println("Resumen: " + resumen);
    }
}

public class EjercicioArticulo {
    public static void main(String[] args) {
        String[] listado= {"Palmera", "hola", "Holaaaaa"};
        Articulo atc = new Articulo("Palmera", "Darwin", listado, "express", 2024, "Este es un libro que escribi en mi casa bajo una palmera");
        atc.imprimirData();
    }
}
