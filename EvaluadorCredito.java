public class EvaluadorCredito {
    public static void main(String[] args) {
        // Variables datos primitivos
        double salario = 3200000.0;
        int edad = 25;
        boolean tieneReporteCentrales = false;

        // Regla de negocio: Salario mayor a 2.500.000, edad >= 18 Y NO tener reporte
        if (salario > 2500000 && edad >= 18 && !tieneReporteCentrales) {
            System.out.println("Crédito aprobado");
        } else if (salario > 1800000 && !tieneReporteCentrales) {
            System.out.println("Crédito aprobado con Co-deudor");
        } else {
            System.out.println("Crédito rechazado");
        }

    }
}