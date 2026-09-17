package suma;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        double suma, x, y;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Valor de suma: ");
        suma = entrada.nextDouble();
        
        System.out.println("Valor de x: ");
        x = entrada.nextDouble();
        
        System.out.println("Valor de y: ");
        y = entrada.nextDouble();
        
        suma = Operaciones.calcular_op1(suma, x);
        x = Operaciones.calcular_op2(x,y);
        suma = Operaciones.calcular_op3(suma, x, y);
        
        System.out.println("El valor de la suma es: " + suma);
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
    }
    
}
