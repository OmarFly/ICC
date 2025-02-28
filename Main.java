import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULADORA");
        
        System.out.println("1. Suma");
        System.out.println("2. Multiplicacion");
        System.out.println("3. Division");
        System.out.println("4. Es un entero?");
        
        System.out.println("Ingrese una opcion (1-4):");

        int opcion = scanner.nextInt();
        
        double resultado = 0;
        double num1 = 0;
        double num2 = 0;
        boolean esOpcionValida = opcion >= 1 && opcion <= 4;
        boolean necesitaDosNumeros = opcion >= 1 && opcion <= 3;
        
        if (necesitaDosNumeros) {

            System.out.println("Ingrese el primer numero:");
            num1 = scanner.nextDouble();
            
            System.out.println("Ingrese el segundo numero:");
            num2 = scanner.nextDouble();
        }
        
        if (opcion == 4) {

            System.out.println("Ingrese un numero para verificar si es entero:");
            scanner.nextLine();

            boolean esEntero = scanner.hasNextInt();

            System.out.println("El numero ingresado " + (esEntero ? "es" : "no es") + " un entero.");
            
        }
        
        boolean esSuma = opcion == 1;
        boolean esMultiplicacion = opcion == 2;
        boolean esDivision = opcion == 3;
        boolean esDivisionPorCero = esDivision && num2 == 0;
        
        resultado = esSuma ? num1 + num2 : resultado;
        resultado = esMultiplicacion ? num1 * num2 : resultado;
        resultado = (esDivision && !esDivisionPorCero) ? num1 / num2 : resultado;
        
        if (necesitaDosNumeros && esOpcionValida) {
            String operacion = esSuma ? "suma" : (esMultiplicacion ? "multiplicacion" : "division");
            
            if (esDivisionPorCero) {
                System.out.println("Error: No se puede dividir por cero.");
            } else {
                System.out.println("El resultado de la " + operacion + " es: " + resultado);
            }
        }
        
        if (!esOpcionValida) {
            System.out.println("Opcion invalida. Por favor ingrese un numero entre 1 y 4.");
        }
        
        scanner.close();
    }
}