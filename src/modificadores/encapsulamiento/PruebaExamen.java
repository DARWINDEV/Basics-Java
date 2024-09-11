package modificadores.encapsulamiento;

class Examen{
    private float calificacion;
    int numeroDePreguntas;
    boolean activo;

    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }
    public float getCalificacion(){
        return calificacion;
    }

    public void setnumeroDePreguntas(int numeroDePreguntas){
        this.numeroDePreguntas = numeroDePreguntas;
    }
    public int getnumeroDePreguntas(){
        return numeroDePreguntas;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public boolean isActivo(){
        return activo;
    }

}

public class PruebaExamen {
    public static void main(String[] args) {
        Examen e = new Examen();
        e.setCalificacion(10.0f);

    }
}
