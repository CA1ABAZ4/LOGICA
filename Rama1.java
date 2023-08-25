import java.util.Scanner;
public class Rama1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer operando
        System.out.print("Ingrese el primer operando: ");
        double operando1 = scanner.nextDouble();

        // Solicitar al usuario el segundo operando
        System.out.print("Ingrese el segundo operando: ");
        double operando2 = scanner.nextDouble();

        // Realizar las operaciones aritméticas
        double suma = operando1 + operando2;
        double resta = operando1 - operando2;
        double multiplicacion = operando1 * operando2;
        double division = operando1 / operando2;

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Cerrar el scanner
        scanner.close();
    }
}
