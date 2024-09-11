package ejerciciosPOO;

class Pedidos{
    public void calcularPedido(String primerPlato, double precioPrimerPlato, String bebida, double precioBebida){

        double total = precioPrimerPlato + precioBebida;

        System.out.println("Primer plato: " + primerPlato);
        System.out.println("Precio: " + precioPrimerPlato);
        System.out.println("Bebida: " + bebida);
        System.out.println("Precio: " + precioBebida);

        System.out.println("Total a pagar: $"+ total);

    }

    public void calcularPedido(String primerPlato, double precioPrimerPlato,String segundoPlato, double precioSegundoPlato, String bebida, double precioBebida){

        double total = precioPrimerPlato + precioBebida + precioSegundoPlato;

        System.out.println("Primer plato: " + primerPlato);
        System.out.println("Precio: " + precioPrimerPlato);
        System.out.println("Segundo plato: " + segundoPlato);
        System.out.println("Precio: " + precioSegundoPlato);
        System.out.println("Bebida: " + bebida);
        System.out.println("Precio: " + precioBebida);

        System.out.println("Total a pagar: $"+ total);
        System.out.println("\n");

    }

    public void calcularPedido(String primerPlato, double precioPrimerPlato,String segundoPlato, double precioSegundoPlato, String bebida, double precioBebida, String nombrePostre, double precioPostre){

        double total = precioPrimerPlato + precioBebida + precioSegundoPlato+ precioPostre;

        System.out.println("Primer plato: " + primerPlato);
        System.out.println("Precio: " + precioPrimerPlato);
        System.out.println("Segundo plato: " + segundoPlato);
        System.out.println("Precio: " + precioSegundoPlato);
        System.out.println("Bebida: " + bebida);
        System.out.println("Precio: " + precioBebida);
        System.out.println("Postre: "+ precioPostre);

        System.out.println("Total a pagar: $"+ total);
        System.out.println("\n");

    }

}
public class SobrecargaPedido {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos();
        pedido.calcularPedido("Ramen", 220, "Coca zero", 19);
        pedido.calcularPedido("Ramen", 225, "Guiozas", 125, "Coca zero", 19);
        pedido.calcularPedido("Ramen", 225, "Guiozas", 125, "Coca zero", 19, "Flan napolitano", 50);
    }
}
