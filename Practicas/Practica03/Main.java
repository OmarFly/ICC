/**
 * Clase principal para probar la implementación de la lista ligada.
 */

public class Main {
    public static void main(String[] args) {

        // Declarar una lista
        ListaLigada lista = new ListaLigada();

        // Imprimir como se ve la lista
        System.out.println("Lista actual: " + lista);

        // Insertar 'n' elementos, en este caso 5 pero sientase libre de cambiar los valores
        lista.insertar(11);
        lista.insertar(22);
        lista.insertar(33);
        lista.insertar(44);
        lista.insertar(55);

        // Imprimir como se ve la lista
        System.out.println("Lista despues de insertar 5 elementos: " + lista);

        // Eliminar la cabeza
        lista.eliminar(11);

        // Imprimir como se ve la lista
        System.out.println("Lista despues de eliminar la cabeza (11): " + lista);

        // Eliminar un elemento que no sea la cabeza ni el final
        lista.eliminar(33);

        // Imprimir como se ve la lista
        System.out.println("Lista despues de eliminar el elemento del medio (33): " + lista);

        // Insertar en índice válido (1)
        lista.insertarIndice(23, 1);

        // Imprimir como se ve la lista
        System.out.println("Lista despues de insertar 23 (como Jordan) en el indice 1: " + lista);

        // Insertar en índice no válido
        lista.insertarIndice(99, 10);

        // Imprimir como se ve la lista
        System.out.println("Lista despues de intentar insertar un elemento en un indice fuera de rango (spoiler alert: es la misma lista): " + lista);
    }
}
