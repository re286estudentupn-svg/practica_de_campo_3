// Pregunta 4 - Integrando conceptos
// Clase Inventario con métodos sobrecargados para agregar productos.
// Usa un ArrayList para guardar los productos y valida que precio/cantidad no sean negativos.

import java.util.ArrayList;

// Clase que representa un producto en el inventario
class Producto {
    String nombre;
    double precio;
    int cantidad;

    // Constructor completo
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Sobrescribimos toString para mostrar el producto de forma legible
    @Override
    public String toString() {
        return "Producto{nombre='" + nombre + "', precio=" + precio + ", cantidad=" + cantidad + "}";
    }
}

public class InventarioPregunta4 {

    // Lista que almacenará los productos
    private ArrayList<Producto> productos = new ArrayList<>();

    // Método sobrecargado 1: solo nombre
    public void agregarProducto(String nombre) {
        // Cuando no se indica precio ni cantidad, asumimos 0
        agregarProducto(nombre, 0.0, 0);
    }

    // Método sobrecargado 2: nombre y precio
    public void agregarProducto(String nombre, double precio) {
        // Asumimos cantidad 0
        agregarProducto(nombre, precio, 0);
    }

    // Método sobrecargado 3: nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        // Validamos que precio y cantidad no sean negativos
        if (precio < 0) {
            System.out.println("Error: el precio no puede ser negativo. Producto no agregado.");
            return; // Salimos sin agregar el producto
        }

        if (cantidad < 0) {
            System.out.println("Error: la cantidad no puede ser negativa. Producto no agregado.");
            return;
        }

        // Si los datos son válidos, creamos el producto y lo agregamos a la lista
        Producto p = new Producto(nombre, precio, cantidad);
        productos.add(p);
        System.out.println("Producto agregado: " + p);
    }

    // Método para mostrar todos los productos del inventario
    public void mostrarInventario() {
        System.out.println("\nInventario actual:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        InventarioPregunta4 inventario = new InventarioPregunta4();

        // Agregamos productos usando los diferentes métodos sobrecargados
        inventario.agregarProducto("Lapicero");                 // solo nombre
        inventario.agregarProducto("Cuaderno", 3.50);           // nombre y precio
        inventario.agregarProducto("Laptop", 2500.00, 5);       // nombre, precio y cantidad

        // Intentamos agregar productos con datos inválidos
        inventario.agregarProducto("Mouse", -10.0, 2);          // precio negativo
        inventario.agregarProducto("Teclado", 80.0, -3);        // cantidad negativa

        // Mostramos el inventario final
        inventario.mostrarInventario();
    }
}
