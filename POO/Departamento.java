package POO;

public class Departamento {
    private String codigo;
    private String nombre;
    private double presupuestoAnual;

    public Departamento(String codigo, String nombre, double presupuestoAnual){
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuestoAnual = presupuestoAnual;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPresupuestoAnual(){
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(double presupuestoAnual){
        this.presupuestoAnual = presupuestoAnual;
    }

    public void mostrarDetalle(){
        System.out.println(
            "Codigo: " + codigo +
            " Nombre: " + nombre +
            " Presupuesto Anual: " + presupuestoAnual
        );
    }
}
