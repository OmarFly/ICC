/**
 * Clase que representa un Cuadrado, una figura geometrica con cuatro lados iguales.
 * Hereda de la clase abstracta FiguraGeometrica.
 */
public class Cuadrado extends FiguraGeometrica {

    /**
     * Constructor de la clase Cuadrado.
     * 
     * @param lado Longitud de los lados del cuadrado.
     */
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    /**
     * Calcula el area del cuadrado.
     * 
     * @return El area del cuadrado.
     */
    @Override
    public double calcularArea() {
        return base * base;
    }

    /**
     * Calcula el perimetro del cuadrado.
     * 
     * @return El perimetro del cuadrado.
     */
    @Override
    public double calcularPerimetro() {
        return 4 * base;
    }

    /**
     * Devuelve información sobre el cuadrado.
     * 
     * @return Una cadena con la información del cuadrado.
     */
    @Override
    public String toString() {
        return "Cuadrado con lados de " + base;
    }
}
