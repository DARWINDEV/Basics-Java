package ejerciciosClaseString;

class Paquete{
    Persona remitente;
    Persona destinatario;
    enum tipoEnvio {NACIONAL, INTERNACIONAL}
    tipoEnvio envio;
    enum tipoContenido {DOCUMENTO, MERCANCIA}

    tipoContenido contenido;

    double pesoPaquete;

    public Paquete(tipoEnvio envio, tipoContenido contenido, double pesoPaquete) {
        this.envio = envio;
        this.contenido = contenido;
        this.pesoPaquete = pesoPaquete;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    void imprimirData(){
        System.out.println("Tipo de envio: " + envio);
        System.out.println("Tipo de envio: " + contenido);
        System.out.println("Peso: " + pesoPaquete + " Kg");
    }

    void calcularEnvio(){
        int precioEnvio = 0;
        if (envio == tipoEnvio.NACIONAL){
            if (contenido == tipoContenido.DOCUMENTO){
                if (pesoPaquete <= 2){
                    precioEnvio = 2000;
                    System.out.println("Precio de envio: " + precioEnvio);
                } else{
                    precioEnvio = 3000;
                    System.out.println("Precio de envio: " + precioEnvio);
                }
            } else {
                if (pesoPaquete <= 5){
                    precioEnvio = 5000;
                    System.out.println("Precio de envio: " + precioEnvio);
                } else{
                    precioEnvio = 7000;
                    System.out.println("Precio de envio: " + precioEnvio);
                }
            }
        } else{
            if (contenido == tipoContenido.DOCUMENTO){
                if (pesoPaquete <= 2){
                    precioEnvio = 10000;
                    System.out.println("Precio de envio: " + precioEnvio);
                } else{
                    precioEnvio = 15000;
                    System.out.println("Precio de envio: " + precioEnvio);
                }
            } else {
                if (pesoPaquete <= 5){
                    precioEnvio = 12000;
                    System.out.println("Precio de envio: " + precioEnvio);
                } else{
                    precioEnvio = 20000;
                    System.out.println("Precio de envio: " + precioEnvio);
                }
            }
        }
    }

    static class Persona{
        String nombre;
        String apellido;
        int dni;
        String direccion;
        long telefono;

        public Persona(String nombre, String apellido, int dni, String direccion, long telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        void imprimirData(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("DNI: " + dni);
            System.out.println("Direccion: " + direccion);
            System.out.println("Telefono: " + telefono);
        }


    }
}
public class EjercicioPaquete {
    public static void main(String[] args) {
        Paquete paquete = new Paquete(Paquete.tipoEnvio.NACIONAL, Paquete.tipoContenido.MERCANCIA, 2);
        Paquete.Persona persona = new Paquete.Persona("Darwin", "Jimenez", 123456789, "En tu corazon", 6114291);
        paquete.setRemitente(persona);
        paquete.setDestinatario(persona);
        paquete.calcularEnvio();
        paquete.imprimirData();
        persona.imprimirData();
    }
}
