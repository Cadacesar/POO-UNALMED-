package circulo;

public class Calculos {
    public static double calc_area (double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static double calc_circunf (double radio) {
        return 2* Math.PI * radio;
    }
}
