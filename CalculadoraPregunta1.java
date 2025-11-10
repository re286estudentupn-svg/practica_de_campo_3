// Pregunta 1 - Sobrecarga de Métodos
// Clase que demuestra el uso de métodos sobrecargados "sumar"

public class CalculadoraPregunta1 {

    // Método sumar que recibe dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método sumar que recibe tres enteros
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sumar que recibe dos números decimales (double)
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Demostración de uso de los tres métodos sobrecargados

        int resultadoDosEnteros = sumar(5, 7);              // usa sumar(int, int)
        int resultadoTresEnteros = sumar(1, 2, 3);          // usa sumar(int, int, int)
        double resultadoDosDoubles = sumar(2.5, 3.7);       // usa sumar(double, double)

        System.out.println("Suma de 5 y 7 = " + resultadoDosEnteros);
        System.out.println("Suma de 1, 2 y 3 = " + resultadoTresEnteros);
        System.out.println("Suma de 2.5 y 3.7 = " + resultadoDosDoubles);
    }
}