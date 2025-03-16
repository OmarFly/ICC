public interface InterfazRecipiente {

    double dimension();
    double capacidadTotal();
    double cantidadActual();
    double capacidadRestante();
    boolean estaVacio();
    boolean estaLleno();
    double agregar(double cantidadAgregar);
    double vacia();
    void vierte(Recipiente otroRecipiente);
    boolean mismasDimensiones(Recipiente otroRecipiente);
    boolean mismaCapacidad(Recipiente otroRecipiente);
    boolean contieneMas(Recipiente otroRecipiente);
    boolean cabeMas(Recipiente otroRecipiente);
    Recipiente creaContenedorJusto();
    String muestra();
}
