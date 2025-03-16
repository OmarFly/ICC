/**
 * Implementación de un recipiente cilíndrico que puede almacenar líquido.
 */
public class RecipienteCilindro implements RecipienteInterfaz {
    // Atributos
    private double radio;
    private double altura;
    private double cantidadActual;

    /**
     * Constructor para crear un recipiente cilíndrico vacío.
     * 
     * @param radio  Radio del cilindro
     * @param altura Altura del cilindro
     */
    public RecipienteCilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.cantidadActual = 0.0;
    }

    /**
     * Constructor para crear un recipiente cilíndrico con una cantidad inicial de líquido.
     * 
     * @param radio          Radio del cilindro
     * @param altura         Altura del cilindro
     * @param cantidadActual Cantidad inicial de líquido
     */
    public RecipienteCilindro(double radio, double altura, double cantidadActual) {
        this.radio = radio;
        this.altura = altura;
        this.cantidadActual = Math.min(cantidadActual, this.capacidadTotal());
    }

    @Override
    public double dimension() {
        // Fórmula del volumen de un cilindro: V = π * r^2 * h
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double capacidadTotal() {
        // Capacidad total es igual a la dimensión del recipiente
        return dimension();
    }

    @Override
    public double cantidadActual() {
        return cantidadActual;
    }

    @Override
    public double capacidadRestante() {
        return capacidadTotal() - cantidadActual();
    }

    @Override
    public boolean estaVacio() {
        return cantidadActual == 0;
    }

    @Override
    public boolean estaLleno() {
        // Comparamos con una pequeña tolerancia debido a errores de punto flotante
        return Math.abs(cantidadActual - capacidadTotal()) < 0.000001;
    }

    @Override
    public double agrergar(double cantidadAgregar) {
        if (cantidadAgregar <= 0) {
            return 0; // No se puede agregar una cantidad negativa o cero
        }

        double cantidadTotal = this.cantidadActual + cantidadAgregar;
        double capacidadMaxima = this.capacidadTotal();
        double cantidadExcedente = 0;

        if (cantidadTotal > capacidadMaxima) {
            cantidadExcedente = cantidadTotal - capacidadMaxima;
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadTotal;
        }

        return cantidadExcedente;
    }

    @Override
    public double vacia() {
        double cantidadPrevia = this.cantidadActual;
        this.cantidadActual = 0;
        return cantidadPrevia;
    }

    @Override
    public void vierte(Recipiente otro) {
        if (this.estaVacio()) {
            return; // No hay líquido que verter
        }

        // Calculamos cuánto espacio queda en el otro recipiente
        double espacioDisponible = otro.capacidadRestante();

        if (espacioDisponible <= 0) {
            return; // El otro recipiente está lleno
        }

        // Determinamos cuánto podemos verter
        double cantidadAVerter = Math.min(this.cantidadActual, espacioDisponible);

        // Agregamos al otro recipiente y actualizamos el actual
        double excedente = otro.agrergar(cantidadAVerter);
        // Restamos sólo lo que realmente se vertió (lo que no fue excedente)
        this.cantidadActual -= (cantidadAVerter - excedente);
    }

    @Override
    public boolean mismasDimensiones(Recipiente otro) {
        return Math.abs(this.dimension() - otro.dimension()) < 0.000001;
    }

    @Override
    public boolean mismaCapacidad(Recipiente otro) {
        return Math.abs(this.capacidadTotal() - otro.capacidadTotal()) < 0.000001;
    }

    @Override
    public boolean contieneMas(Recipiente otro) {
        return this.cantidadActual > otro.cantidadActual();
    }

    @Override
    public boolean cabeMas(Recipiente otro) {
        return this.capacidadTotal() > otro.capacidadTotal();
    }

    @Override
    public Recipiente creaContenedorJusto() {
        // Creamos un nuevo recipiente con capacidad igual a la cantidad actual de este recipiente
        // Para ello, mantenemos el radio y ajustamos la altura para que la capacidad sea la correcta
        if (this.cantidadActual == 0) {
            return new RecipienteCilindro(this.radio, 0);
        }

        // Calculamos la nueva altura para un cilindro con volumen igual a this.cantidadActual
        // V = π * r^2 * h → h = V / (π * r^2)
        double nuevaAltura = this.cantidadActual / (Math.PI * Math.pow(this.radio, 2));
        return new RecipienteCilindro(this.radio, nuevaAltura);
    }

    @Override
    public String muestra() {
        return String.format("Recipiente cilíndrico - Dimensión: %.2f, Capacidad total: %.2f, Cantidad actual: %.2f",
                dimension(), capacidadTotal(), cantidadActual());
    }

    // Métodos getter para acceder a los atributos
    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }
}