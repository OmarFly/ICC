/**
 * Clase abstracta que representa una Figura Geometrica.
 * Contiene atributos comunes como base y altura, y define metodos abstractos
 * que deben ser implementados por las clases que hereden de esta.
 */
public abstract class FiguraGeometrica {
    protected double base;
    protected double altura;

    /**
     * Constructor de la clase FiguraGeometrica.
     * 
     * @param base   Longitud de la base de la figura.
     * @param altura Altura de la figura.
     */
    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula el area de la figura.
     * 
     * @return El area de la figura.
     */
    public abstract double calcularArea();

    /**
     * Calcula el perimetro de la figura.
     * 
     * @return El perimetro de la figura.
     */
    public abstract double calcularPerimetro();

    /**
     * Devuelve informacion en formato String sobre la figura.
     * 
     * @return Una cadena con la informacion de la figura.
     */
    public String ToString() {
        return "Base: " + base + ", Altura: " + altura;
    }
}
