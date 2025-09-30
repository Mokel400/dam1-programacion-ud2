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

        if (emailValido){

            Usuario ususario = new Usuario (nombre, edad, correoElectronico);

            ususario.mostrarInformacion();

        } else {

            System.out.println("No se ha podido crear el ususario porque el correo introducido no es válido");


        }



        sc.close();




    }

}
