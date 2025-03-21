import java.util.Scanner;
/*
    *
    * Clase principal que modela un reloj digital
    * de 24 hrs. y hacemos una demostracion 
    * de su funcionamiento.
    * 
    */

public class Main{
    private static Horas horas;         // Creo que el 'static' es para mandar a llamar
    private static Minutos minutos;     // a los metodos de las clases sin necesidad de
    private static Segundos segundos;   // instanciar un objeto de la clase.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Para leer la entrada del usuario

        horas = new Horas();            // Pero ponemos el 'new' para inicializar
        minutos = new Minutos(); 
        segundos = new Segundos();

        // Establecer hora, es decir, simulamos que establecemos 
        // la hora, para fines demostrativos consideramos que 
        // la hora actual es: 23:59:57 para obervar el reseteo al cumplir la media noche 
        // (24 hrs) pero sientase en libertad de reescribir a voluntad.

        horas.setHoras(23);
        minutos.setMinutos(59);
        segundos.setSegundos(57);

        // Ahora el menu usando 'switch' con las opciones de ciclos que permitiran imprimir la simulacion de 
        // incrementar la hora, minuto y segundo una unidad a la vez.
        // Funcion auxiliar 'getHoraCompleta'.
       
        System.out.println("Hola:) Soy un programa que simula ser un reloj digital");
        System.out.println("Por favor selecciona el tipo de ciclo a usar:");
        System.out.println("1. Ciclo for");
        System.out.println("2. Ciclo while");
        System.out.println("3. Ciclo do-while");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch(opcion){
            case 1: // IMPLEMENTACION CON CICLO 'for'
            for(int i = 0; i < 7; i++){
                System.out.println(getHoraCompleta());
                    if(segundos.incrementar()){
                        if(minutos.incrementar()){
                            horas.incrementar();
                        }
                     }
            }
            break;

            case 2: // IMPLEMENTACION CON CICLO 'while'
            int j = 0;
            while(j < 7){
               System.out.println(getHoraCompleta());
               if(segundos.incrementar()){
                   if(minutos.incrementar()){
                       horas.incrementar();
                   }
               }
               j++;
            }
            break;

            case 3: // IMPLEMENTACION CON CICLO 'do-while'
            int k = 0;
            do{
               System.out.println(getHoraCompleta());
               if(segundos.incrementar()){
                   if(minutos.incrementar()){
                       horas.incrementar();
                   }
               }
               k++;
            }while(k < 7); 
            break;
            
            default:
            System.out.println("Opción no valida");
            break;
        }
        scanner.close();
    }

    /**
    * 
    * Metodo que regresa la hora completa y exacta en
    * formato HH:MM:SS
    * @return hora actualizada en formato 'string'
    * 
    */

    public static String getHoraCompleta(){
        return String.format("%02d:%02d:%02d",
                             horas.getHoras(), 
                             minutos.getMinutos(), 
                             segundos.getSegundos());
        }
    }

    // Obs: El metodo 'String.format()' es un metodo de la clase 'String' que
    // permite formatear una cadena de texto, es una solucion que permite tener menos 
    // 'system.out.println()' en el 'for' implementado anteriormente.
    // En este ejemplo en particular se formatea la hora en formato HH:MM:SS
    // Donde:
    // '%' es un especificador de formato.
    // 'd' especifica que el parametro al momento de declarar este metodo es un 'int'. 
    // '02' indica que se debe formateear un entero con al menos 2 digitos '2', si el entero
    // tiene menos de 2 digitos se rellena con ceros a la izquierda '0'.
    // Ejemplos:
    // String.format("%02d", 5);   // Resultado: "05"
    // String.format("%02d", 15);  // Resultado: "15"
    // Tambien utilice este metodo en el Proyecto1 pero me falto comentar el codigo. Una disculpa