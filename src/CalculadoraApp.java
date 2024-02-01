import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicación Calculadora ****");
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    //ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                }
                else if (operacion == 5) { //Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                //Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } //Fin try
            catch (Exception e){
                System.out.println("ocurrio un error: " + e.getMessage());
            }
        } //Fin While

    } //Fin main

    private static void mostrarMenu(){ //Funcion de mostrar menu
        // Mostrar el menú
        System.out.println("1. Suma \n2. Resta \n3. Multiplicación \n4. División \n5. Salir");
        System.out.print("¿Operación a realizar?");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) { //Funcion de ejecutar operacion
        System.out.println("Proporcione valor de operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporcione valor de operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma es: " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta es: " + resultado);
            }
            case 3 -> { // Multiplicación
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multilplicación es: " + resultado);
            }
            case 4 -> { // División
                resultado = operando1 / operando2;
                System.out.println("Resultado de la división es: " + resultado);
            }
            default -> {
                System.out.println("Opreación errronea " + operacion);
            }
        }
    }
}
