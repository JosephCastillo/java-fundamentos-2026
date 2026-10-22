package POO;

public class ProcesadorNomina {

    public static void main(String[] args){

        
        Empleado[] nomina = new Empleado[3];
        
        nomina[0] = new Empleado("EMP-001", "Camila");
        nomina[1] = new EmpleadoGerente("EMP-002", "Carlos", 3000000, 500000);
        nomina[2] = new EmpleadoGerente("EMP-003", "Joseph", 3000000, 200000);

        double totalGastoNomina = 0;

        for(Empleado nEmpleado : nomina){
            nEmpleado.mostrarFicha();
            totalGastoNomina += nEmpleado.getSalarioBase();
        }

        System.out.println("Total gasto nómina: " + totalGastoNomina);

    }
}
