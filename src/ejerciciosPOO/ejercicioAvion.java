package ejerciciosPOO;

//ejercicio pag 121

class Avion{
    private String nombreFabricante;
    private int numeroMotores;

    public Avion(String nombreFabricante, int numeroMotores) {
        this.nombreFabricante = nombreFabricante;
        this.numeroMotores = numeroMotores;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    private void cambiarFabricante(Avion nombre){
        nombre.setNombreFabricante("Lookheed");
    }

    void imprimirData(){
        System.out.println("Fabricante: " + getNombreFabricante());
        System.out.println("Numero de motores: " + getNumeroMotores());
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Avion avion1 = new Avion("Airbus", 4);
        Avion avion2;
        Avion avion3 = new Avion("Holita", 4);
        avion2 = avion1;

        avion1.imprimirData();
        avion2.imprimirData();
        avion1.setNombreFabricante("Darwin");
        avion1.imprimirData();
        avion2.imprimirData();
        avion1.cambiarFabricante(avion2);
        avion2.imprimirData();
    }
}



