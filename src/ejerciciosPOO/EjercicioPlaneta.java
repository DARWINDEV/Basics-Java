package ejerciciosPOO;

class Planeta{
    String planeta = "null";
    int satelites = 0;
    double masa = 0;

    double volumen_km3 = 0;

    int distanciaMediaSol = 0;
    int diametro_km = 0;

    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};

    tipoPlaneta tipo;

    boolean observable = false;

    public Planeta(String planeta, int satelites, double masa, double volumen_km3, int distanciaMediaSol, int diametro_km, tipoPlaneta tipo, boolean observable) {
        this.planeta = planeta;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen_km3 = volumen_km3;
        this.distanciaMediaSol = distanciaMediaSol;
        this.diametro_km = diametro_km;
        this.tipo = tipo;
        this.observable = observable;
    }


    void imprimir(){
        System.out.println("Planeta: " + planeta);
        System.out.println("Satelites: " + satelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen_km3 + " Km3");
        System.out.println("Diametro: " + diametro_km + "Kms");
        System.out.println("Tipo: " + tipo);
        System.out.println("Observable: " + observable);
        System.out.println("\n");

    }

    double densidad(){
        return (masa / volumen_km3);
    }

    boolean esExterior(){
        float limite = (float)(149597870 * 3.4);

        if (distanciaMediaSol > limite){
            return true;
        } else{
            return false;
        }
    }




}
public class EjercicioPlaneta {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000, Planeta.tipoPlaneta.TERRESTRE,true);
        p1.densidad();
        p1.imprimir();
        System.out.println("Densidad: " + p1.densidad());
        p1.esExterior();
        System.out.println("Exterior: " + p1.esExterior());
        Planeta p2 = new Planeta("Mercurio",1,5.9736E24,1.08321E12,12742,150000000, Planeta.tipoPlaneta.TERRESTRE,true);
        p2.densidad();
        p2.esExterior();
    }
}
