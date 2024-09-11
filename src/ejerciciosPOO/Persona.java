package ejerciciosPOO;

class Personaa{
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;

    private double peso;
    private double altura;

    public Personaa(String nombre, int edad, int DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    void calcularIMC(){
        double formula = (getPeso()/(Math.pow(getAltura(),2)));
        if(formula < 20){
            System.out.println(-1);
        } else if (formula >= 10 && formula <= 25){
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    void esMayorDeEdad(){

        if(getEdad() >= 18){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    void generaDNI(){

    }

}
public class Persona {
    public static void main(String[] args) {
        Personaa p = new Personaa("Darwin", 57, 25468547, 'H',85, 1.71);
        p.calcularIMC();
        p.esMayorDeEdad();

    }
}
