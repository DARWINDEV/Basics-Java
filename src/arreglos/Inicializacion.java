package arreglos;

public class Inicializacion {

    static void imprimirArreglo(String arreglo []){
        for ( String valor : arreglo) {
            System.out.println(valor);
        }
    }


    public static void main(String[] args) {

//        Explicita
        String nombres[] = new String[2];

        nombres[0] = "Darwin";
        nombres[1] = "Jimeno";

        imprimirArreglo(nombres);

//        Implicita
        String nombrez[] = {"Darwin", "Edgar"};

//        Anonima

        String nombres_3[] = new String[] {"Darwin", "Jimenez"};
    }
}
