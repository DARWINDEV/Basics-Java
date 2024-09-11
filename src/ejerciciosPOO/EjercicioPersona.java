package ejerciciosPOO;

//pagina 66

class Persona3{
    private String nombre;
    private String apellido;
    private int DNI;
    private int fechaNacimiento;

    private String paisNacimiento;
    private char sexo;

    public Persona3(String nombre, String apellido, int DNI, int fechaNacimiento, String paisNacimiento, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.sexo = sexo;
    }

    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Nacimiento: " + fechaNacimiento);
        System.out.println("Pais: " + paisNacimiento);
        System.out.println("Genero: " + sexo);
        System.out.println("\n");
    }
}
public class EjercicioPersona {
    public static void main(String[] args) {
        Persona3 p3 = new Persona3("Darwin", "Jimenez", 12345678, 1996, "MX", 'H');
        Persona3 p4 = new Persona3("Edgar", "Jimenez", 12345678, 1993, "MX", 'H');
        p3.imprimir();
        p4.imprimir();
    }
}
