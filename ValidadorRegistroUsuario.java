public class ValidadorRegistroUsuario {
    public static void main(String[] args) {
        String nombreUsuario = "  joseph.castillo  ";
        String correoElectronico = "joseph.castillo@email.com";
        String clave = "Java2026";

        nombreUsuario = nombreUsuario.trim();
        correoElectronico = correoElectronico.trim().toLowerCase();

        if (nombreUsuario.length() > 5 && correoElectronico.endsWith(".com") && !clave.equalsIgnoreCase(nombreUsuario)) {
            System.out.println("Registro exitoso para el usuario: " +  nombreUsuario);
            System.out.println("Correo registrado: " + correoElectronico);
        }else if(nombreUsuario.length() <= 5){
            System.out.println("Nombre de usuario no cumple con los requerimientos establecidos. Favor validar");
        }else if(!correoElectronico.endsWith(".com")){
            System.out.println("Correo electrónico no cumple con los requerimientso establecidos. Favor validar");
        }else if(clave.equalsIgnoreCase(nombreUsuario)){
            System.out.println("La Clave no cumple con los requerimientos establecidos. Favor validar");
        }else{
            System.out.println("Ocurrió un error en el registro!");
        }
    }
}
