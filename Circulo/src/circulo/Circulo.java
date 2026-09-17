package circulo;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        double radio, area, longCircf;
        Scanner enter = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo: ");
        radio = enter.nextDouble();
        
        area = Calculos.calc_area(radio);
        longCircf = Calculos.calc_circunf(radio);
        
        System.out.println("El area de tu circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longCircf);
    }
    
}
