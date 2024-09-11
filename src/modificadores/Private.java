package modificadores;
class Prueba{
   private String nombre;

   public Prueba(){

   }

   void foo(){

   }
}

public class Private {
    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.foo();
    }
}
