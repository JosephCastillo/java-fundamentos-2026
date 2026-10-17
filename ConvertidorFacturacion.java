public class ConvertidorFacturacion {

    public static void main(String[] args){
        String cadenaCantidad = "4";
        String cadenaPrecioUnitario = "12500.75";
        String cadenaPorcentajeImpuesto = "19";

        int cantidad = Integer.parseInt(cadenaCantidad);
        double precioUnitario = Double.parseDouble(cadenaPrecioUnitario);
        int porcentajeImpuesto = Integer.parseInt(cadenaPorcentajeImpuesto);

        double subtotal = (double) cantidad * precioUnitario;
        double montoIva = subtotal * ((double)porcentajeImpuesto / 100);//0.19
        double totalPagar = subtotal + montoIva;
        int totalPagarEntero = (int) totalPagar;

        System.out.println("Subtotal: " +subtotal);
        System.out.println("Monto  IVA: " + montoIva);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("Total a pagar entero: " + totalPagarEntero);


    }    
}