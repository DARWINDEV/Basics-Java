package ejerciciosPOO;
//ejercicio 121
class ConversionUnidades{
    final int MTS_CENTIMETER = 100;
    final int MTS_MILIMETER = 1000;
    final double MTS_PG = 39.37;
    final double MTS_PIES = 3.28;
    final double MTS_YARDAS =  1.09361;

    double metros;

    public ConversionUnidades(double metros) {
        this.metros = metros;
    }

    public int getMTS_CENTIMETER() {
        return MTS_CENTIMETER;
    }

    public int getMTS_MILIMETER() {
        return MTS_MILIMETER;
    }

    public double getMTS_PG() {
        return MTS_PG;
    }

    public double getMTS_PIES() {
        return MTS_PIES;
    }

    public double getMTS_YARDAS() {
        return MTS_YARDAS;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    double convertirMetrosACM(){
        double totalCM;
        totalCM = MTS_CENTIMETER * metros;
        return totalCM;
    }

    double convertirMetrosAMM(){
        double totalMM;
        totalMM = MTS_MILIMETER * metros;
        return totalMM;
    }

    double convertirMetrosAPG(){
        double totalPG;
        totalPG = MTS_PG * metros;
        return totalPG;
    }

    double convertirMetrosAPies(){
        double totalPies;
        totalPies = MTS_PIES * metros;
        return totalPies;
    }

    double convertirMetrosYDS(){
        double totalYDS;
        totalYDS = MTS_YARDAS * metros;
        return totalYDS;
    }

}



public class EjercicioConversionUnidades {
    public static void main(String[] args) {
        ConversionUnidades conversion1 = new ConversionUnidades(3.5);
        System.out.println(conversion1.convertirMetrosACM());
        System.out.println(conversion1.convertirMetrosAMM());
        System.out.println(conversion1.convertirMetrosAPG());
        System.out.println(conversion1.convertirMetrosAPies());
        System.out.println(conversion1.convertirMetrosYDS());
    }
}
