package ejerciciosPOO;

//pagina 114

class Pelicula{
    private String nombre;
    private String director;
    enum genero {ACCION, COMEDIA, DRAMA, SUSPENSO}
    genero generoPeli;
    private int duracion;
    private int lanzamiento;
    private double calificacion;

    public Pelicula(String nombre, String director, genero generoPeli, int duracion, int lanzamiento, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.generoPeli = generoPeli;
        this.duracion = duracion;
        this.lanzamiento = lanzamiento;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public genero getGeneroPeli() {
        return generoPeli;
    }

    public void setGeneroPeli(genero generoPeli) {
        this.generoPeli = generoPeli;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    private String calcularValoracion(){

        if (getCalificacion() >= 0 && getCalificacion()<= 2){
            System.out.println("Muy mala");
        } else if (getCalificacion() > 2 && getCalificacion() < 5) {
            System.out.println("Mala");
        } else if (getCalificacion() > 5 && getCalificacion() < 7) {
            System.out.println("Regular");
        } else if (getCalificacion() > 7 && getCalificacion() < 8){
            System.out.println("Buena");
        } else {
            System.out.println("Excelente");
        }
        return null;
    }

    private boolean esPeliculaEpica(){

        if (getDuracion() >= 180){
            return true;
        } else {
            return false;
        }
    }

    private boolean esSimilar(Pelicula peliNueva){
        if((getGeneroPeli() == peliNueva.getGeneroPeli()) && (getCalificacion() == peliNueva.getCalificacion())){
            return true;
        } else{
            return false;
        }
    }

    void imprimirData(){
        System.out.println("Pelicula: " + getNombre());
        System.out.println("Director: " + getDirector());
        System.out.println("Genero: " + getGeneroPeli());
        System.out.println("Duracion: " + getDuracion());
        System.out.println("Lanzamiento: " + getLanzamiento());
        System.out.println("Calificacion: " + getCalificacion());
        System.out.println("\n");
    }
}



public class EjercicioPelicula {

    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough",
                Pelicula.genero.DRAMA,191,1982,8.3);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh",
                Pelicula.genero.ACCION, 115,2011,7.0);


    }

}
