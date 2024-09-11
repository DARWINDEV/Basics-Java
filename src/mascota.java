class Mascota{
    String nombre;
    int edad;
    String tipo;
    int patas;
    int alas;

    Mascota(){
        System.out.println("Mi mascota esta muy bonita");
    }
    Mascota(String nombre, int edad, String tipo, int patas, int alas){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.patas = patas;
        this.alas = alas;
    }

    void imprimirMascota(){
        System.out.println("Mi mascota se llama " + nombre + " tiene " + edad + " años, es tipo " + tipo + ", cuenta con " + patas + " patas y " + alas + " alas");
    }

    public static void main(String[] args) {
        Mascota m = new Mascota("Atila", 12, "perro", 4, 0);
        m.imprimirMascota();
    }

}