/**
 * Clase que representa un Triangulo, una figura geometrica con tres lados.
 * Hereda de la clase abstracta FiguraGeometrica.
 */
public class Triangulo extends FiguraGeometrica {
    private double lado1, lado2, lado3;

    /**
     * Constructor de la clase Triangulo.
     * 
     * @param base   Longitud de la base del triangulo.
     * @param altura Altura del triangulo.
     * @param lado2  Longitud del segundo lado del triangulo.
     * @param lado3  Longitud del tercer lado del triangulo.
     */
    public Triangulo(double base, double altura, double lado2, double lado3) {
        super(base, altura);
        this.lado1 = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Calcula el area del triangulo.
     * 
     * @return El area del triangulo.
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    /**
     * Calcula el perimetro del triangulo.
     * 
     * @return El perimetro del triangulo.
     */
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Devuelve informacion sobre el triangulo.
     * 
     * @return Una cadena con la informacion del triangulo.
     */
    @Override
    public String toString() {
        return "Triangulo con lados: " + lado1 + ", " + lado2 + ", " + lado3;
    }
}
