
package edades;

import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        double edJuan, edAlber, edAna, edMama;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cual es la edad de Juan? : ");
        edJuan = scanner.nextDouble();
        
        edAlber = Calculos.calc_edAlber(edJuan);
        edAna = Calculos.calc_edAna(edJuan);
        edMama = Calculos.calc_edMama(edJuan, edAlber, edAna);
        
        System.out.println("La edad de Juan es: " + edJuan);
        System.out.println("La edad de Alberto es: " + edAlber);
        System.out.println("La edad de Ana es: " + edAna);
        System.out.println("La edad de la mama es: " + edMama);
    }
    
}
