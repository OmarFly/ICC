/**
 * Clase que representa un Rectangulo, una figura geometrica con lados opuestos iguales.
 * Hereda de la clase abstracta FiguraGeometrica.
 */
public class Rectangulo extends FiguraGeometrica {

    /**
     * Constructor de la clase Rectangulo.
     * 
     * @param base   Longitud de la base del rectangulo.
     * @param altura Altura del rectangulo.
     */
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     * Calcula el area del rectangulo.
     * 
     * @return El area del rectangulo.
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }

    /**
     * Calcula el perimetro del rectangulo.
     * 
     * @return El perimetro del rectangulo.
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    /**
     * Devuelve informacion sobre el rectangulo.
     * 
     * @return Una cadena con la informacion del rectangulo.
     */
    @Override
    public String toString() {
        return "Rectangulo de base " + base + " y altura " + altura;
    }
}
