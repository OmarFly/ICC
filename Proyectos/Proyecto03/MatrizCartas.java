/**
 * Clase que representa la matriz visible de cartas (5x6).
 * Ahora imprime en consola los atributos visibles de cada carta junto con su ID.
 */
public class MatrizCartas {
    private Carta[][] matriz;

    public MatrizCartas() {
        matriz = new Carta[5][6];
    }

    public void rellenar(Mazo mazo) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (matriz[i][j] == null && !mazo.estaVacio()) {
                    matriz[i][j] = mazo.sacarCarta();
                }
            }
        }
    }

    /**
     * Muestra la matriz en consola, con ID y atributos de cada carta.
     */
    public void mostrar() {
        System.out.println("\n MATRIZ DE CARTAS DISPONIBLES");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                int id = i * 6 + j;
                if (matriz[i][j] != null) {
                    System.out.println("[" + id + "] -> " + matriz[i][j]);
                }
            }
        }
        System.out.println("uwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuw");
    }

    public Carta getCarta(int id) {
        int fila = id / 6;
        int col = id % 6;
        if (fila >= 0 && fila < 5 && col >= 0 && col < 6) {
            return matriz[fila][col];
        }
        return null;
    }

    public void removerCarta(int id) {
        int fila = id / 6;
        int col = id % 6;
        matriz[fila][col] = null;
    }

    public boolean haySecuenciaCon(Carta base) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (matriz[i][j] != null && base.esSecuencial(matriz[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean estaVacia() {
        for (Carta[] fila : matriz)
            for (Carta c : fila)
                if (c != null)
                    return false;
        return true;
    }
}
