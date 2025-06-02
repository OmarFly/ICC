public class Jugador {
    private String nombre;
    private int puntos;
    private Carta cartaActual;
    public ListaLigadaCartas secuencia;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.secuencia = new ListaLigadaCartas();
    }

    public void setCartaInicial(Carta carta) {
        this.cartaActual = carta;
        this.secuencia = new ListaLigadaCartas();
        this.secuencia.agregar(carta);
    }

    public boolean puedeExtenderCon(Carta nueva) {
        return cartaActual.esSecuencial(nueva);
    }

    public void agregarCarta(Carta carta) {
        cartaActual = carta;
        secuencia.agregar(carta);
    }

    public void sumarPuntos() {
        puntos += secuencia.tamano();
    }

    public void anularPuntos() {
        puntos += 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public Carta getCartaActual() {
        return cartaActual;
    }

    public String mostrarSecuencia() {
        return secuencia.toString();
    }

    public String getNombre() {
        return nombre;
    }
}
