public class Recipiente implements InterfazRecipiente {
    private double radio;
    private double altura;
    private double cantidadActual;

    public Recipiente(double radio, double altura) {
        if (radio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("El radio y la altura deben ser positivos.");
        }
        this.radio = radio;
        this.altura = altura;
        this.cantidadActual = 0; // Inicialmente vacío
    }

    @Override
    public double dimension() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double capacidadTotal() {
        return dimension();
    }

    @Override
    public double cantidadActual() {
        return cantidadActual;
    }

    @Override
    public double capacidadRestante() {
        return capacidadTotal() - cantidadActual;
    }

    @Override
    public boolean estaVacio() {
        return cantidadActual == 0;
    }

    @Override
    public boolean estaLleno() {
        return cantidadActual == capacidadTotal();
    }

    @Override
    public double agregar(double cantidadAgregar) {
        if (cantidadAgregar < 0) return 0; // No se pueden agregar líquidos negativos

        double cantidadExcedente = 0;
        if (cantidadActual + cantidadAgregar > capacidadTotal()) {
            cantidadExcedente = (cantidadActual + cantidadAgregar) - capacidadTotal();
            cantidadActual = capacidadTotal();
        } else {
            cantidadActual += cantidadAgregar;
        }
        return cantidadExcedente;
    }

    @Override
    public double vacia() {
        double previo = cantidadActual;
        cantidadActual = 0;
        return previo;
    }

    @Override
    public void vierte(Recipiente otroRecipiente) {
        double espacioDisponible = otroRecipiente.capacidadRestante();
        if (cantidadActual <= espacioDisponible) {
            otroRecipiente.cantidadActual += cantidadActual;
            cantidadActual = 0;
        } else {
            otroRecipiente.cantidadActual = otroRecipiente.capacidadTotal();
            cantidadActual -= espacioDisponible;
        }
    }

    @Override
    public boolean mismasDimensiones(Recipiente otroRecipiente) {
        return this.dimension() == otroRecipiente.dimension();
    }

    @Override
    public boolean mismaCapacidad(Recipiente otroRecipiente) {
        return this.capacidadTotal() == otroRecipiente.capacidadTotal();
    }

    @Override
    public boolean contieneMas(Recipiente otroRecipiente) {
        return this.cantidadActual > otroRecipiente.cantidadActual;
    }

    @Override
    public boolean cabeMas(Recipiente otroRecipiente) {
        return this.capacidadTotal() > otroRecipiente.capacidadTotal();
    }

    @Override
    public Recipiente creaContenedorJusto() {
        return new Recipiente(this.radio, this.altura / 2);
    }

    @Override
    public String muestra() {
        return String.format("Dimensión: %.2f, Capacidad: %.2f, Cantidad actual: %.2f",
                dimension(), capacidadTotal(), cantidadActual);
    }
}