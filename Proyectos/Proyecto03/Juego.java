import java.util.Scanner;

/**
 * Controlador del flujo de juego: turnos, lógica y rondas.
 */

public class Juego {
    private Jugador humano;
    private Jugador maquina;
    private Mazo mazo;
    private MatrizCartas matriz;
    private Scanner sc;

    public Juego() {
        humano = new Jugador("Humano");
        maquina = new Jugador("Maquina");
        mazo = new Mazo();
        matriz = new MatrizCartas();
        sc = new Scanner(System.in);
    }

    public void iniciar() {
        while (mazo.tamano() >= 2 && mazo.tamano() >= 30) {
            nuevaRonda();
        }
        mostrarGanadorFinal();
    }

    private void nuevaRonda() {
        System.out.println("\n NUEVA RONDA");
        humano.setCartaInicial(mazo.sacarCarta());
        maquina.setCartaInicial(mazo.sacarCarta());
        matriz.rellenar(mazo);
        jugarRonda();
        verificarRonda();
    }

    private void jugarRonda() {
        boolean rondaActiva = true;
        boolean humanoTermino = false;
        boolean maquinaTermino = false;

        while (rondaActiva) {
            mostrarEstado();
            humanoTermino = turnoHumano();
            if (!matriz.haySecuenciaCon(maquina.getCartaActual())) {
                maquinaTermino = true;
            } else {
                turnoMaquina();
            }

            rondaActiva = !(humanoTermino && maquinaTermino);
        }
    }

    private boolean turnoHumano() {
    System.out.println("\nTu carta actual: " + humano.getCartaActual());
    matriz.mostrar();

    System.out.println("[A] Escoger carta");
    System.out.println("[B] Terminar mi secuencia");

    String opcion = sc.nextLine().trim().toUpperCase();

    if (opcion.equals("A")) {
        System.out.print("Ingresa el ID de la carta (según se muestra en consola): ");
        try {
            int id = Integer.parseInt(sc.nextLine());
            Carta seleccionada = matriz.getCarta(id);
            if (seleccionada == null) {
                System.out.println("No hay carta en esa posición o ya fue tomada.");
            } else if (!humano.puedeExtenderCon(seleccionada)) {
                System.out.println("¡Esa carta no es valida para continuar la secuencia!");
            } else {
                humano.agregarCarta(seleccionada);
                matriz.removerCarta(id);
            }
        } catch (Exception e) {
            System.out.println("Entrada invalida. Asegurate de ingresar un numero correcto.");
        }
        return false;
    } else {
        return true;
    }
}


    private void turnoMaquina() {
        for (int id = 0; id < 30; id++) {
            Carta c = matriz.getCarta(id);
            if (c != null && maquina.puedeExtenderCon(c)) {
                maquina.agregarCarta(c);
                matriz.removerCarta(id);
                System.out.println("Maquina tomo una carta.");
                return;
            }
        }
        System.out.println("Maquina no pudo continuar.");
    }

    private void verificarRonda() {
        boolean humanoValido = validarSecuencia(humano);
        boolean maquinaValido = true;

        System.out.println("\nSecuencia Humano:");
        System.out.println(humano.mostrarSecuencia());

        System.out.println("Secuencia Maquina:");
        System.out.println(maquina.mostrarSecuencia());

        if (humanoValido)
            humano.sumarPuntos();
        else
            humano.anularPuntos();

        maquina.sumarPuntos();

        System.out.println("Puntos Humano: " + humano.getPuntos());
        System.out.println("Puntos Maquina: " + maquina.getPuntos());
    }

    public boolean validarSecuencia(Jugador jugador) {
        NodoCarta actual = jugador.mostrarSecuencia() == null ? null : jugador.secuencia.getCabeza();
        while (actual != null && actual.siguiente != null) {
            if (actual.carta.comparar(actual.siguiente.carta) > 1)
                return false;
            actual = actual.siguiente;
        }
        return true;
    }

    private void mostrarEstado() {
        System.out.println("\nPuntos actuales:");
        System.out.println("Humano: " + humano.getPuntos());
        System.out.println("Máquina: " + maquina.getPuntos());
    }

    private void mostrarGanadorFinal() {
        System.out.println("\n FIN DEL JUEGO");
        System.out.println("Puntaje final:");
        System.out.println("Humano: " + humano.getPuntos());
        System.out.println("Máquina: " + maquina.getPuntos());
        if (humano.getPuntos() > maquina.getPuntos()) {
            System.out.println("¡Ganaste!");
        } else if (humano.getPuntos() < maquina.getPuntos()) {
            System.out.println("Gano la maquina.");
        } else {
            System.out.println("Empate.");
        }
    }
}
