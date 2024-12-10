import java.util.Scanner;
import java.lang.Math;

public class CalculadoraCientificaInterf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora Científica");
            System.out.println("1. Suma");
            System.out.println("2. Resta"); 
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            int opcion = input.nextInt();

            if (opcion == 0) {
                break;
            }

            double num1, num2;
            double resultado = 0;

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el primer número: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = input.nextDouble();
                    resultado = num1 + num2;
                }
                case 2 -> {
                    System.out.print("Ingrese el primer número: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = input.nextDouble();
                    resultado = num1 - num2;
                }
                case 3 -> {
                    System.out.print("Ingrese el primer número: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = input.nextDouble();
                    resultado = num1 * num2;
                }
                case 4 -> {
                    System.out.print("Ingrese el numerador: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el denominador: ");
                    num2 = input.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: división por cero.");
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese la base: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = input.nextDouble();
                    resultado = Math.pow(num1, num2);
                }
                case 6 -> {
                    System.out.print("Ingrese el número para calcular la raíz cuadrada: ");
                    num1 = input.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                    } else {
                        System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
                    }
                }
                default -> System.out.println("Opción no válida.");
            }

            System.out.println("Resultado: " + resultado);
        }

        input.close();
    }
}   
