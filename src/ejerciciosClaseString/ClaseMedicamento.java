package ejerciciosClaseString;

//Ejercicio 164

class Medicamento{
    String nombreMedicamento;
    String fabricanteMedicamento;
    enum viaAdministracion {ORAL, TOPICO, NASAL}
    static viaAdministracion tipo;

    Posologia posologia;

    public Medicamento(String nombreMedicamento, String fabricanteMedicamento, viaAdministracion tipo) {
        this.nombreMedicamento = nombreMedicamento;
        this.fabricanteMedicamento = fabricanteMedicamento;
        this.tipo = tipo;
    }

    public void setPosologia(Posologia posologia) {
        this.posologia = posologia;
    }

    void imprimirData(){
        System.out.println("Nombre del medicamento: " + nombreMedicamento);
        System.out.println("Nombre del fabricante: " + fabricanteMedicamento);
        System.out.println("Tipo de aplicacion: " + tipo);
    }

    static class Posologia{
        String usuariosMedicamento;
        int dosisMg;
        int periodoTiempo;
        String recomendaciones;

        public Posologia(String usuariosMedicamento, int dosisMg, int periodoTiempo, String recomendaciones) {
            this.usuariosMedicamento = usuariosMedicamento;
            this.dosisMg = dosisMg;
            this.periodoTiempo = periodoTiempo;
            this.recomendaciones = recomendaciones;
        }

        void imprirData(){
            System.out.println("Usuarios: " + usuariosMedicamento);
            System.out.println("Dosis: " + dosisMg + " mg");
            System.out.println("Periodo: Cada " + periodoTiempo + " horas");
            System.out.println("Recomendaciones: " + recomendaciones);
        }
    }

}

public class ClaseMedicamento {
    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("Aspirina", "Bayer", Medicamento.viaAdministracion.ORAL);
        Medicamento.Posologia posologia = new Medicamento.Posologia("Adulto y mayores de 16 años", 500, 6, "No debe tomar este medicamento con el estomago vacio");
        medicamento.setPosologia(posologia);
        medicamento.imprimirData();
        medicamento.posologia.imprirData();
    }
}
