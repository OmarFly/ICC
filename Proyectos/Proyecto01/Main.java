public class Main {
    public static void main(String[] args) {
        Recipiente r1 = new Recipiente(5, 10);
        Recipiente r2 = new Recipiente(3, 8);

        System.out.println("Recipiente 1: " + r1.muestra());
        System.out.println("Recipiente 2: " + r2.muestra());

        System.out.println("\nAgregando 200 de líquido a Recipiente 1...");
        double excedente = r1.agregar(200);
        System.out.println("Excedente: " + excedente);
        System.out.println("Recipiente 1: " + r1.muestra());

        System.out.println("\nVaciando Recipiente 2...");
        double antesDeVaciar = r2.vacia();
        System.out.println("Cantidad antes de vaciar: " + antesDeVaciar);
        System.out.println("Recipiente 2: " + r2.muestra());

        System.out.println("\nVertiendo de Recipiente 1 a Recipiente 2...");
        r1.vierte(r2);
        System.out.println("Recipiente 1: " + r1.muestra());
        System.out.println("Recipiente 2: " + r2.muestra());

        System.out.println("\nComparando recipientes:");
        System.out.println("¿Mismas dimensiones? " + r1.mismasDimensiones(r2));
        System.out.println("¿Misma capacidad? " + r1.mismaCapacidad(r2));
        System.out.println("¿Recipiente 1 contiene más que Recipiente 2? " + r1.contieneMas(r2));
        System.out.println("¿Recipiente 1 cabe más que Recipiente 2? " + r1.cabeMas(r2));

        System.out.println("\nCreando un nuevo recipiente justo...");
        Recipiente r3 = r1.creaContenedorJusto();
        System.out.println("Nuevo Recipiente: " + r3.muestra());
    }
}