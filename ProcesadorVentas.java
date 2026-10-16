public class ProcesadorVentas {
    public static void main(String[] args) {

        int totalVentasDia = 0;
        int ventasMayoresA100k = 0;

        for (int i = 1; i <= 8; i++) {
            int valorVenta = i * 25000;
            System.out.println("Número de venta: " + i + " Valor: " + valorVenta);
            totalVentasDia = totalVentasDia + valorVenta;
            if (valorVenta > 100000) {
                ventasMayoresA100k++;
            }
        }
        System.out.println("Total de ventas acumulado en el día: " + totalVentasDia);
        System.out.println("Cantidad de ventas que superaron los $100000: " + ventasMayoresA100k);
        System.out.println("Promedio de valor por venta: " + (totalVentasDia / 8.0));
    }
}