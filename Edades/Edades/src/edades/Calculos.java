
package edades;

public class Calculos {
    public static double calc_edAlber (double edJuan) {
        return 2* edJuan/3;
    }
    public static double calc_edAna (double edJuan) {
        return 4* edJuan/3;
    }
    public static double calc_edMama (double edJuan, double edAlber, double edAna) {
        return edJuan + edAlber + edAna;
    }   
}
