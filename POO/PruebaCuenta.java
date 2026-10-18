package POO;

public class PruebaCuenta {
    public static void main(String[] args){
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("CB-001", "Joseph Castillo");
        cuentaBancaria1.depositar(500000);
        cuentaBancaria1.retirar(6000000);
        cuentaBancaria1.retirar(400000);
        cuentaBancaria1.mostrarInformacion();
    }
}
