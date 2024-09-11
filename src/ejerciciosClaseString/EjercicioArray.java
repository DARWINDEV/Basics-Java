package ejerciciosClaseString;

class Alumno{
    private String nombre;
    private char aula;

    private double calificacion;

    public Alumno(String nombre, char aula, double calificacion) {
        this.nombre = nombre;
        this.aula = aula;
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }
}

public class EjercicioArray {
    Alumno listado [] = new Alumno[6];

}
