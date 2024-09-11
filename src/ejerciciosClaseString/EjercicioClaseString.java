package ejerciciosClaseString;



public class EjercicioClaseString {
    public static void main(String[] args) {
        String poo = " Programacion Orientada a Objetos ";
        System.out.println(poo.length());
        String sinEspacios = poo.trim();
        System.out.println(sinEspacios);
        String mayusculas = sinEspacios.toUpperCase();
        System.out.println(mayusculas);
        String concatenar = mayusculas.concat("12345");
        System.out.println(concatenar);
        String extraer = concatenar.substring(24,31);
        System.out.println(extraer);
        String replace = extraer.replace("O", "");
        System.out.println(replace);
        Boolean comparar = replace.equals(poo);
        System.out.println(comparar);
    }
}
