package POO;

public class PruebaEmpleado {

    public static void main(String[] args) {

        /*
         * Instancia a un primer empleado usando el Constructor 1 (ej: ID "EMP-01",
         * "Brayam Castillo", $3.500.000).
         */
        Empleado empleado1 = new Empleado("EMP-01", "Joseph Castillo", 3500000);

        /*
         * Instancia a un segundo empleado usando el Constructor 2 (ej: ID "EMP-02",
         * "Carlos Pérez").
         */

        Empleado empleado2 = new Empleado("EMP-02", "Camila Ramirez");

        /*
         * Intenta reducirle el salario al primer empleado (ej: a $2.000.000) para
         * verificar que el setter bloquee la operación.
         */

        empleado1.setSalarioBase(2000000);

        /*
         * Aumenta el salario del segundo empleado a $1.800.000.
         */

        empleado2.setSalarioBase(1800000);

        /*
         * Inactiva al primer empleado.
         */

        empleado1.inactivarEmpleado();

        /*
         * Muestra la ficha técnica de ambos empleados.
         */

        empleado1.mostrarFicha();
        empleado2.mostrarFicha();
    }
}
