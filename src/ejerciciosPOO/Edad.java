package ejerciciosPOO;

class EdadPersona{
    private String nombre;
    private int edad;


    public EdadPersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     void calcularEdad(){
        if (getEdad() < 18){
            System.out.println("Tu nombre es " + getNombre()+ " y tienes " +getEdad()+ " de edad, eres menor de edad");
        } else{
            System.out.println("Tu nombre es " + getNombre()+ " y tienes " +getEdad()+ " de edad, eres mayor de edad");
        }
    }
}
public class Edad {
    public static void main(String[] args) {
        EdadPersona p = new EdadPersona("Darwin", 29);
        p.calcularEdad();
    }
}
