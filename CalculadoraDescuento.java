public class CalculadoraDescuento{
    public static void main(String[] args){
        // Variable referencia
        String nombreProducto = "Portátil Laptop";

        // Variable tipo primitivo
        double precioProducto = 2500000.0;
        int descuentoProducto = 15;
        boolean envioGratis = true;

        // Calcular valor descuento  
        double valorDescuentoProducto =  precioProducto * (descuentoProducto / 100.0); //0.15

        // Calcular precio final

        double precioFinal = precioProducto - valorDescuentoProducto;

        
        System.out.println("Nombre producto: " + nombreProducto);
        System.out.println("Precio producto: $" + precioProducto);
        System.out.println("Descuento del " + descuentoProducto + " %");
        System.out.println("Valor descontado: $" + valorDescuentoProducto);
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("Envío gratis: " + envioGratis);


    }
}