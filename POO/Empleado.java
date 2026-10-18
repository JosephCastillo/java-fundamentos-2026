package POO;

public class Empleado {

    /*
     * Atributos privados: id (String), nombre (String), salarioBase (double) y
     * activo (boolean).
     */

    private String id;
    private String nombre;
    private double salarioBase;
    private boolean activo;

    /*
     * Sobrecarga de constructores:
     * Constructor 1: Recibe id, nombre y salarioBase. Establece activo como true
     * por defecto.
     * Constructor 2: Recibe únicamente id y nombre. Asigna un salarioBase por
     * defecto de $1.300.000 (Salario mínimo) y activo como true.
     */

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        activo = true;
    }

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        salarioBase = 1300000;
        activo = true;

        /*
         * 'this(...)' (con paréntesis) no asigna atributos directamente, sino que
         * LLAMA AL CONSTRUCTOR 1 pasándole id, nombre y el salario base por defecto
         * (1300000.0).
         * 
         * Como el Constructor 1 ya ejecuta las líneas:
         * - this.id = id;
         * - this.nombre = nombre;
         * - this.salarioBase = salarioBase;
         * - activo = true;
         * 
         * Todo el objeto queda totalmente inicializado (incluyendo activo = true)
         * sin necesidad de repetir esas asignaciones aquí.
         * 
         * REGLA DE ORO: 'this(...)' debe ser obligatoriamente la primera línea de este
         * constructor.
         * 
         * this(id, nombre, 1300000.0);
         */

    }

    /*
     * Getters: Agrega getters públicos para todos los atributos.
     */

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean getActivo() {
        return activo;
    }

    /*
     * Setter controlado para salarioBase: El método setSalarioBase(double
     * nuevoSalario) solo debe actualizar el salario si el monto introducido es
     * mayor o igual al salario base actual (en Colombia no se puede reducir el
     * salario unilateralmente). Si es menor, debe imprimir un mensaje de rechazo.
     */

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= this.salarioBase) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("El salario base debe se mayor al salario base establecido anteriormente");
        }
    }

    /*
     * Método public void inactivarEmpleado(): Cambia el atributo activo a false.
     */

    public void inactivarEmpleado() {
        this.activo = false;
    }

    /*
     * Método public void mostrarFicha(): Imprime el ID, nombre, salario y el estado
     * del empleado ("ACTIVO" o "INACTIVO").
     */

    public void mostrarFicha() {
        System.out.println(
                "- ID: " + id +
                        " - Nombre:  " + nombre +
                        " - Salario base: " + salarioBase +
                        " - Estado: " + activo);
    }

}
