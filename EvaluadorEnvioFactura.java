public class EvaluadorEnvioFactura {
    public static void main(String[] args) {
        // Variables datos primitivos
        double motoCompra = 10000.0;
        boolean esClienteVIP = true;
        boolean cuponValido = true;
        double costoEnvio = 0.0;

        if (motoCompra >= 200000 || !esClienteVIP) {
            costoEnvio = 0.0;
        } else if (cuponValido && motoCompra > 100000) {
            costoEnvio = 5000.0;
        } else {
            costoEnvio = 15000.0;
        }

        double montoTotal = motoCompra + costoEnvio;

        System.out.println("Costo moto: $" + motoCompra);
        System.out.println("Costo envío: $" + costoEnvio);
        System.out.println("Costo total: $" + montoTotal);
    }
}