/**
 * Clase principal que contiene el metodo main para probar las figuras geometricas.
 * Crea instancias de Triangulo, Rectangulo y Cuadrado, y muestra sus propiedades.
 */
public class Main {
    public static void main(String[] args) {
        // Forma 1
        Triangulo t1 = new Triangulo(3, 4, 5, 5);
        // Forma 2 (polimorfismo)
        FiguraGeometrica t2 = new Triangulo(10, 8.66, 10, 10);
        
        Rectangulo r = new Rectangulo(10, 16.8);
        Cuadrado c = new Cuadrado(11);

        FiguraGeometrica[] figuras = {t1, t2, r, c};
        // Recorremos el array de figuras e imprimimos sus propiedades
        for (FiguraGeometrica f : figuras) {
            System.out.println(f.toString());
            System.out.println("Area: " + f.calcularArea());
            System.out.println("Perimetro: " + f.calcularPerimetro());
            System.out.println("uwu uwu uwu uwu uwu uwu uwu uwu uwuw uwu");
        }
    }
}
