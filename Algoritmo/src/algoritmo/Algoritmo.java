package algoritmo;

import java.util.Scanner;

public class Algoritmo {

    public static void main(String[] args) {
double num, cuadrado, cubo;
    
    Scanner enter = new Scanner(System.in);
    
    System.out.println("Cual es el numero del que desea conocer su cuadrado y su cubo: ");
    num = enter.nextDouble();
    
    cuadrado = Calculos.calculo_cuadrado(num);
    cubo = Calculos.calculo_cubo(num);
    
    System.out.println("El caudrado de " + num + " es: " + cuadrado);
    System.out.println("El cubo de " + num + " es: " + cubo);
    }
    
}
