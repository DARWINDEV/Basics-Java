package arreglos;

class Taco{
    private String sabor;
    private float precio;
    private boolean cebolla;
    private boolean cilantro;

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void setCilantro(boolean cilantro) {
        this.cilantro = cilantro;
    }

    public String getSabor() {
        return sabor;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public boolean isCilantro() {
        return cilantro;
    }

    public Taco(String sabor, float precio, boolean cebolla, boolean cilantro) {
        this.sabor = sabor;
        this.precio = precio;
        this.cebolla = cebolla;
        this.cilantro = cilantro;
    }
}

public class EjemploTacos {
    public static void main(String[] args) {
        Taco orden[] = new Taco[3];
        orden[0] = new Taco("suadero", 15.0f, true, true);
        orden[1] = new Taco("Al pastor", 13.0f, true, true);
        orden[2] = new Taco("carnitas", 17.0f, true, true);
        float cuenta = 0.0f;

        for ( Taco taco : orden) {
            System.out.println("Taco de: " + taco.getSabor());
            System.out.println("Precio: " + taco.getPrecio());
            System.out.println("Con cebolla?: " + taco.isCebolla());
            System.out.println("Con cilantro?: " + taco.isCilantro());
            System.out.println();
            cuenta+=taco.getPrecio();
        }

        System.out.println("Total: " + cuenta);
    }

}
