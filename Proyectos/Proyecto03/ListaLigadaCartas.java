public class ListaLigadaCartas {
    private NodoCarta cabeza;
    private NodoCarta cola;
    private int tamano;

    public void agregar(Carta carta) {
        NodoCarta nuevo = new NodoCarta(carta);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        tamano++;
    }

    public int tamano() {
        return tamano;
    }

    public NodoCarta getCabeza() {
        return cabeza;
    }

    @Override
    public String toString() {
        String resultado = "";
        NodoCarta actual = cabeza;
        int i = 0;
        while (actual != null) {
            resultado += "(" + i + ") " + actual.carta.toString() + "\n";
            actual = actual.siguiente;
            i++;
        }
        return resultado;
    }
}
