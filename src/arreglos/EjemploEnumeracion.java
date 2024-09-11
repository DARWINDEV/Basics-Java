package arreglos;

enum SaborPalomitas{
    CHILE("Chile", 20.0f), MANTEQUILLA("Mantequilla", 25.0f), QUESO("Cheddar", 30.0f);

    private String nombreDeVenta;
    private float precio;

    public String getNombreDeVenta() {
        return nombreDeVenta;
    }

    public float getPrecio() {
        return precio;
    }



    private SaborPalomitas(String nombreDeVenta, float precio){
        this.nombreDeVenta = nombreDeVenta;
        this.precio = precio;
    }
}

public class EjemploEnumeracion {
    public static void main(String[] args) {
        SaborPalomitas caramelo = SaborPalomitas.QUESO;
        System.out.println(caramelo.getNombreDeVenta());
        System.out.println(caramelo.getPrecio());
    }
}
