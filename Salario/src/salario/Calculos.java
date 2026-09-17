
package salario;

public class Calculos {
        public static double calc_salarioB (double horas, double pagoHora) {
        return horas*pagoHora;
    }
    public static double calc_reten (double salarioBruto, double porcReten) {
        return salarioBruto*porcReten/100;
    }
    public static double calc_salarioN (double salarioBruto, double retencion) {
        return salarioBruto - retencion;
    }
}
