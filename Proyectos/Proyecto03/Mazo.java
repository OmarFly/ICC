import java.util.*;

/**
 * Clase para generar y manejar las 96 cartas del juego.
 */
public class Mazo {
    private Stack<Carta> cartas;

    public Mazo() {
        cartas = new Stack<>();
        generarCartas();
        Collections.shuffle(cartas);
    }

    private void generarCartas() {
        Set<String> existentes = new HashSet<>();
        Random r = new Random();

        while (existentes.size() < 32) {
            boolean grande = r.nextBoolean();
            boolean claro = r.nextBoolean();
            boolean unBrazo = r.nextBoolean();
            boolean conLentes = r.nextBoolean();
            boolean conPalomitas = r.nextBoolean();

            String key = "" + grande + claro + unBrazo + conLentes + conPalomitas;
            if (!existentes.contains(key)) {
                existentes.add(key);
                for (int i = 0; i < 3; i++) {
                    cartas.push(new Carta(grande, claro, unBrazo, conLentes, conPalomitas));
                }
            }
        }
    }

    public boolean estaVacio() {
        return cartas.isEmpty();
    }

    public Carta sacarCarta() {
        return estaVacio() ? null : cartas.pop();
    }

    public int tamano() {
        return cartas.size();
    }
}
