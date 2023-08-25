import java.util.Scanner;
public class Rama3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Almacenar el nombre de usuario y la contraseña en memoria
        String usernameAlmacenado = "miUsuario";
        String passwordAlmacenado = "miContraseña";

        boolean autenticado = false;

        do {
            // Solicitar al usuario que ingrese el nombre de usuario y la contraseña
            System.out.print("Ingrese el nombre de usuario: ");
            String usernameIngresado = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            String passwordIngresado = scanner.nextLine();

            // Comparar las credenciales ingresadas con las almacenadas
            if (usernameIngresado.equals(usernameAlmacenado) && passwordIngresado.equals(passwordAlmacenado)) {
                System.out.println("Inicio de sesión exitoso.");
                autenticado = true;
            } else {
                System.out.println("Credenciales incorrectas. Intente nuevamente.");
            }
        } while (!autenticado);

        // Cerrar el scanner
        scanner.close();
    }
}
