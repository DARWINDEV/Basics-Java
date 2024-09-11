package ejerciciosPOO;

class Figura{
    double radio;
    double base;
    double altura;
    double lado;

    public Figura(double radio, double base, double altura, double lado) {
        this.radio = radio;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    void areaCirculo(){
        System.out.println(Math.PI * Math.pow(radio, 2));
    }

    void perimetroCirculo(){
        System.out.println(2*Math.PI * radio);
    }

    void areaCuadrado(){
        System.out.println(lado * lado);
    }

    void perimetroCuadrado(){
        System.out.println((4*lado));
    }

    void areaRectangulo(){
        System.out.println(base * altura);
    }

    void perimetroRectangulo(){
        System.out.println((2*base) + (2*altura));
    }

    void areaTriangulo(){
        System.out.println((base * altura) / 2);
    }

    double calcularHipotenusa(){
        double total = Math.pow(altura, 2) + Math.pow(base, 2);
        return Math.sqrt(total);
    }


    void adivinarTriangulo(){
        if((base == altura && base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Triangulo equilatero");
        } else if ((base!= altura) && (base!= calcularHipotenusa()) && (altura == calcularHipotenusa())) {
            System.out.println("Triangulo isosceles");
        } else{
            System.out.println("Triangulo escaleno");
        }
    }
}

public class EjercicioFiguras {
    public static void main(String[] args) {
        Figura f = new Figura(5,3,3,4);
        f.areaCirculo();
        f.perimetroCirculo();
        f.areaCuadrado();
        f.areaTriangulo();
        f.calcularHipotenusa();
        f.adivinarTriangulo();
    }
}
