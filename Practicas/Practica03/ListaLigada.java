/**
 * Clase que representa una lista ligada simple.
 * Permite insertar, eliminar elementos y manipular la lista por índice.
 */

public class ListaLigada {

    // Nodo que representa la cabeza de la lista 
    private Nodo cabeza;

    // Número total de elementos en la lista 
    private int longitud;

    //Constructor que crea una lista vacía.

    public ListaLigada() {
        this.cabeza = null;
        this.longitud = 0;
    }

    /**
     * Inserta un nuevo nodo al final de la lista.
     * @param elemento El valor entero a insertar.
     */

    public void insertar(int elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        longitud++;
    }

    /**
     * Elimina el primer nodo que contenga el valor especificado.
     * @param elemento El valor entero a eliminar de la lista.
     */

    public void eliminar(int elemento) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.elemento == elemento) {
            cabeza = cabeza.siguiente;
            longitud--;
            return;
        }

        Nodo anterior = null;
        Nodo actual = cabeza;

        while (actual != null && actual.elemento != elemento) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Elemento no encontrado.");
            return;
        }

        anterior.siguiente = actual.siguiente;
        longitud--;
    }

    /**
     * Inserta un nuevo elemento en una posición específica de la lista.
     * @param elemento El valor entero a insertar.
     * @param indice La posición en la que se debe insertar el elemento.
     */

    public void insertarIndice(int elemento, int indice) {
        if (indice < 0 || indice > longitud) {
            System.out.println("Indice no valido. No se inserto el elemento pues el indice esta fuera del rango permitdo.");
            return;
        }

        Nodo nuevo = new Nodo(elemento);

        if (indice == 0) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }

        longitud++;
    }

    /**
     * Regresa una representación en cadena de la lista.
     * @return Cadena con los elementos de la lista.
     */

    @Override
    public String toString() {
        if (cabeza == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Nodo actual = cabeza;

        while (actual != null) {
            sb.append(actual.elemento);
            if (actual.siguiente != null) {
                sb.append(" uwu ");
            }
            actual = actual.siguiente;
        }

        sb.append("]");
        return sb.toString();
    }
}
