package POO;

public class PruebaHerencia {
    public static void main(String[] args){
        Departamento administrativo = new Departamento("DEP-001", "Administrativo", 500000000);
        Empleado empleadoNormal = new Empleado("EMP-001", "Carlos", 2500000);
        EmpleadoGerente empleadoGerente = new EmpleadoGerente("EMP-002", "María", 4000000, 1200000);
        empleadoGerente.setDepartamento(administrativo);
        empleadoNormal.mostrarFicha();
        empleadoGerente.mostrarFicha();
    }
}