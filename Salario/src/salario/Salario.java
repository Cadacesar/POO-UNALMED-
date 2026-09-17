
package salario;

public class Salario {

    public static void main(String[] args) {
        double horas, pagoHora, porcReten, salarioBruto,salarioNeto, retencion;
        
        horas = 48;
        pagoHora = 5000;
        porcReten = 12.5;
        
        salarioBruto = Calculos.calc_salarioB(horas, pagoHora);
        retencion = Calculos.calc_reten(salarioBruto,porcReten);
        salarioNeto = Calculos.calc_salarioN(salarioBruto, retencion);
        
        System.out.println("Su salario bruto es de: " + salarioBruto + " COP");
        System.out.println("Su retencion en la fuente es de: " + retencion + " COP");
        System.out.println("Su salario neto es de: " + salarioNeto + " COP");
    }
    
}
