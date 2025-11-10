// Autor: Alex (re286estudentupn-svg)
// Pregunta 5 - Manejo de múltiples excepciones
// Programa que pide al usuario un número entero y maneja:
// - NumberFormatException si el valor ingresado no es numérico.
// - NumeroNegativoException (personalizada) si el número es negativo.

import java.util.Scanner;

// Definición de la excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class NumeroNegativoPregunta5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero no negativo: ");
        String entrada = scanner.nextLine();

        try {
            // Intentamos convertir la cadena a entero
            int numero = Integer.parseInt(entrada);

            // Si el número es negativo, lanzamos nuestra excepción personalizada
            if (numero < 0) {
                throw new NumeroNegativoException("Error: el número no puede ser negativo.");
            }

            // Si todo está bien, mostramos el número
            System.out.println("Número ingresado correctamente: " + numero);

        } catch (NumberFormatException e) {
            // Captura cuando el usuario ingresa algo que no es un entero válido
            System.out.println("Error: debe ingresar un valor numérico entero.");
        } catch (NumeroNegativoException e) {
            // Captura nuestra excepción personalizada
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

