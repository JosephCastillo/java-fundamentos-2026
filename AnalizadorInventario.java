public class AnalizadorInventario {
    public static void main(String[] args) {

        String[] nombresProductos = {
                "Monitor",
                "Teclado",
                "Ratón",
                "Cámara",
                "Microfono"
        };

        int[] stockProductos = {
                6,
                10,
                5,
                2,
                0
        };

        int menor = stockProductos[0];
        String producto = nombresProductos[0];
        int contadorProductosSinStock = 0;

        for (int i = 0; i < nombresProductos.length; i++) {
            System.out.println("Nombre: " + nombresProductos[i] + "  - Cantidad disponible: " + stockProductos[i]);
            if (stockProductos[i] < menor && stockProductos[i] > 0) {
                    menor = stockProductos[i];
                    producto = nombresProductos[i];
                
            }
            if (stockProductos[i] == 0) {
                contadorProductosSinStock++;
            }
        }
        System.out.println("El producto con menor stock es: " + producto + " - " + menor);
        System.out.println("Cantidad de productos sin stock: " + contadorProductosSinStock);
    }
}
