package polimorfismo.figuras;

public class PruebaDibujable {
    void probarDibujar(Dibujable dibujable){
        dibujable.dibujar();
    }
    public static void main(String[] args) {
        PruebaDibujable pd = new PruebaDibujable();
        pd.probarDibujar(new Circulo("rojo", 5.2));
        pd.probarDibujar(new Rectangulo("verde", 10.5f, 8.5f));
        pd.probarDibujar(new Imagen());
    }
}
