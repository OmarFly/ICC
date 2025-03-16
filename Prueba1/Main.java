/**
 * Clase principal para demostrar el funcionamiento de los recipientes cilíndricos.
 */
public class Main {
    public static void main(String[] args) {
        // Crear diferentes recipientes para pruebas
        System.out.println("Creando recipientes para pruebas...");
        RecipienteCilindro recipiente1 = new RecipienteCilindro(5, 10);
        RecipienteCilindro recipiente2 = new RecipienteCilindro(3, 8);
        RecipienteCilindro recipiente3 = new RecipienteCilindro(5, 10, 400);

        // Mostrar información inicial
        System.out.println("\n----- INFORMACIÓN INICIAL -----");
        System.out.println("Recipiente 1: " + recipiente1.muestra());
        System.out.println("Recipiente 2: " + recipiente2.muestra());
        System.out.println("Recipiente 3: " + recipiente3.muestra());

        // Probar diferentes operaciones
        System.out.println("\n----- PRUEBA DE OPERACIONES -----");
        
        // Prueba 1: Verificar si los recipientes están vacíos o llenos
        System.out.println("\nPrueba de estado de recipientes:");
        System.out.printf("¿Recipiente 1 está vacío? %b\n", recipiente1.estaVacio());
        System.out.printf("¿Recipiente 1 está lleno? %b\n", recipiente1.estaLleno());
        System.out.printf("¿Recipiente 3 está vacío? %b\n", recipiente3.estaVacio());
        System.out.printf("¿Recipiente 3 está lleno? %b\n", recipiente3.estaLleno());

        // Prueba 2: Agregar líquido
        System.out.println("\nPrueba de agregar líquido:");
        System.out.println("Recipiente 1 antes de agregar: " + recipiente1.muestra());
        double excedente = recipiente1.agrergar(400);
        System.out.println("Recipiente 1 después de agregar 400 unidades: " + recipiente1.muestra());
        System.out.println("Excedente: " + excedente);
        
        // Prueba 3: Verificar capacidad restante
        System.out.println("\nPrueba de capacidad restante:");
        System.out.println("Capacidad restante del Recipiente 1: " + recipiente1.capacidadRestante());
        
        // Prueba 4: Comparar recipientes
        System.out.println("\nPrueba de comparación de recipientes:");
        System.out.printf("¿Recipiente 1 y 3 tienen mismas dimensiones? %b\n", recipiente1.mismasDimensiones(recipiente3));
        System.out.printf("¿Recipiente 1 y 2 tienen mismas dimensiones? %b\n", recipiente1.mismasDimensiones(recipiente2));
        System.out.printf("¿Recipiente 1 cabe más que Recipiente 2? %b\n", recipiente1.cabeMas(recipiente2));
        System.out.printf("¿Recipiente 1 contiene más que Recipiente 3? %b\n", recipiente1.contieneMas(recipiente3));
        
        // Prueba 5: Verter líquido entre recipientes
        System.out.println("\nPrueba de verter líquido:");
        System.out.println("Antes de verter:");
        System.out.println("Recipiente 1: " + recipiente1.muestra());
        System.out.println("Recipiente 2: " + recipiente2.muestra());
        
        recipiente1.vierte(recipiente2);
        
        System.out.println("Después de verter Recipiente 1 en Recipiente 2:");
        System.out.println("Recipiente 1: " + recipiente1.muestra());
        System.out.println("Recipiente 2: " + recipiente2.muestra());
        
        // Prueba 6: Vaciar un recipiente
        System.out.println("\nPrueba de vaciar un recipiente:");
        System.out.println("Recipiente 2 antes de vaciar: " + recipiente2.muestra());
        double cantidadVaciada = recipiente2.vacia();
        System.out.println("Cantidad vaciada: " + cantidadVaciada);
        System.out.println("Recipiente 2 después de vaciar: " + recipiente2.muestra());
        
        // Prueba 7: Crear un contenedor justo
        System.out.println("\nPrueba de crear un contenedor justo:");
        System.out.println("Recipiente 3 original: " + recipiente3.muestra());
        RecipienteCilindro recipienteJusto = (RecipienteCilindro) recipiente3.creaContenedorJusto();
        System.out.println("Recipiente justo creado: " + recipienteJusto.muestra());
        System.out.println("Radio: " + recipienteJusto.getRadio() + ", Altura: " + recipienteJusto.getAltura());
        
        // Prueba final con múltiples operaciones
        System.out.println("\n----- DEMOSTRACIÓN FINAL -----");
        RecipienteCilindro recipienteA = new RecipienteCilindro(2, 5);
        RecipienteCilindro recipienteB = new RecipienteCilindro(3, 4);
        
        System.out.println("Estado inicial:");
        System.out.println("Recipiente A: " + recipienteA.muestra());
        System.out.println("Recipiente B: " + recipienteB.muestra());
        
        System.out.println("\nAgregando 50 unidades a Recipiente A...");
        recipienteA.agrergar(50);
        System.out.println("Agregando 30 unidades a Recipiente B...");
        recipienteB.agrergar(30);
        
        System.out.println("\nEstado después de agregar:");
        System.out.println("Recipiente A: " + recipienteA.muestra());
        System.out.println("Recipiente B: " + recipienteB.muestra());
        
        System.out.println("\nVertiendo Recipiente A en Recipiente B...");
        recipienteA.vierte(recipienteB);
        
        System.out.println("\nEstado final:");
        System.out.println("Recipiente A: " + recipienteA.muestra());
        System.out.println("Recipiente B: " + recipienteB.muestra());
    }
}