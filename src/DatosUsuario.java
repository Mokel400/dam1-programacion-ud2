import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;
public class DatosUsuario {
    
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Introduce tu correo electrónico: ");
        String correoElectronico = sc.nextLine();
        
        boolean emailValido = ProcesadorTexto.esEmailValido(correoElectronico);
        boolean edadValida = edad >= 1 && edad < 120;
        boolean nombreValido = nombre.length() > 2 && nombre.length() < 20;
        String nombreBien = String.valueOf(nombre.charAt(0)).toUpperCase() + (nombre.substring(1).toLowerCase());

        if(nombreValido){
            nombreBien = nombreBien.replace(" ", "").trim();

            if (edadValida){
         
                if (emailValido){
                Usuario ususario = new Usuario (nombreBien, edad, correoElectronico);
                ususario.mostrarInformacion();
        
                } else {
        
                System.out.println("No se ha podido crear el ususario porque el correo introducido no es válido");
                }

            } else {

                System.out.println("No se ha podido crear el usuario porque la edad introducida no es válida");
            }

        } else {

            System.out.println("No se ha podido crear el ususario porque el nombre introducido no es válida");
        }

        sc.close();
    }
}
