package polimorfismo.figuras;

public class TestFiguras {

    void imprimirArea(Figura figura){
        System.out.println("El color de la figura es: " + figura.getColor() + " y tiene un área de " + figura.calcularArea());
    }
    public static void main(String[] args) {

        TestFiguras t = new TestFiguras();
        t.imprimirArea(new Circulo("rojo", 5.0));
        t.imprimirArea(new Cuadro("verde", 4));
        t.imprimirArea(new Rectangulo("azul", 8.0, 4.0));

    }
}
