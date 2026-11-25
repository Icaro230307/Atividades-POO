package Principal;

import Model.Circulo;
import Model.Ponto;

public class TestarCirculo {

    public static void main(String[] args) {

        Ponto ponto = new Ponto(5, 10);


        Circulo circulo = new Circulo(3, ponto);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Circunferência do círculo: " + circulo.calcularCircunferencia());

        Circulo c2 = new Circulo(4, new Ponto(2, 8));



        System.out.println("Área: " + c2.calcularArea());
        System.out.println("Circunferência: " + c2.calcularCircunferencia());
    
    
    }
    
}
