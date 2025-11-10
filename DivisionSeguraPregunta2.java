// Pregunta 2 - Manejo de Errores
// Programa que realiza una división entre dos enteros ingresados por el usuario
// e implementa manejo de excepciones para evitar ArithmeticException (división entre cero)

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSeguraPregunta2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Se piden dos números enteros al usuario
            System.out.print("Ingrese el primer número entero: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int denominador = scanner.nextInt();

            // Intentamos realizar la división dentro del try
            int resultado = numerador / denominador;

            System.out.println("Resultado de la división = " + resultado);

        } catch (ArithmeticException e) {
            // Se captura la división entre cero
            System.out.println("Error: división entre cero no permitida");
        } catch (InputMismatchException e) {
            // Se captura cuando el usuario no ingresa un entero válido
            System.out.println("Error: debe ingresar solo números enteros");
        } finally {
            // Cerramos el scanner en el bloque finally
            scanner.close();
        }
    }
}
