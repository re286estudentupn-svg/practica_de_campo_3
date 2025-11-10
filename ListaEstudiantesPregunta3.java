// Pregunta 3 - Colecciones (ArrayList)
// Programa que almacena nombres de estudiantes en un ArrayList,
// elimina el tercer nombre y muestra los resultados antes y después.

import java.util.ArrayList;

public class ListaEstudiantesPregunta3 {

    public static void main(String[] args) {
        // Creamos un ArrayList de String para almacenar los nombres
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregamos al menos 5 nombres
        estudiantes.add("Ana");
        estudiantes.add("Bruno");
        estudiantes.add("Carla");
        estudiantes.add("Diego");
        estudiantes.add("Elena");

        // Mostramos la lista completa
        System.out.println("Lista completa de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }

        // Eliminamos el tercer nombre ingresado (índice 2, porque empezamos en 0)
        // Verificamos primero que la lista tenga al menos 3 elementos
        if (estudiantes.size() >= 3) {
            String eliminado = estudiantes.remove(2);
            System.out.println("\nSe eliminó el tercer nombre: " + eliminado);
        }

        // Recorremos la lista nuevamente e imprimimos los nombres restantes
        System.out.println("\nLista de estudiantes después de eliminar el tercer nombre:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }
    }
}
