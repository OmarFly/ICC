/**
 * Clase que representa un nodo de una lista ligada.
 * Cada nodo contiene un valor entero y una referencia al siguiente nodo.
 */

public class Nodo {
    
    // Valor entero almacenado en el nodo 
    public int elemento;

    // Referencia al siguiente nodo en la lista 
    public Nodo siguiente;

    /**
     * Constructor que inicializa un nodo con un elemento.
     * @param elemento El valor entero que contendrá el nodo.
     */

    public Nodo(int elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
}
