package POO;

public class EmpleadoGerente extends Empleado{
    private double bonificacion;

    public EmpleadoGerente(String id, String nombre, double salarioBase, double bonificacion){
        super(id, nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override 
    public double getSalarioBase(){
        return super.getSalarioBase() + bonificacion;
    }

    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Salario base: " + getSalarioBase());

    }
}
