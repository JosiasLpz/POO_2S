import java.util.Scanner;
public class Operaciones{
    public static void main(String[] args){ 
       Scanner scanner = new Scanner(System.in); 
       
        System.out.println("*********************");
        System.out.println("*Operaciones Basicas*");  
        System.out.println("*********************");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Seleccione una operacion (1/2/3/4): ");  
        int opcion = scanner.nextInt();
         double num1, num2, resultado;
        
        switch (opcion){
            case 1:
                System.out.print("Digita el primer numero: ");
                num1 = scanner.nextDouble();
                System.out.print("Digita el segundo numero: ");
                num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break; 
                
            case 2:
                System.out.print("Digita el primer numero: ");
                num1 = scanner.nextDouble();
                System.out.print("Digita el segundo número: ");
                num2 = scanner.nextDouble();
                resultado = num1 - num2; 
                System.out.println("El resultado de la resta es: " + resultado);
                break;
                
            case 3:
                System.out.print("Digita el primer numero: ");
                num1 = scanner.nextDouble();
                System.out.print("Digita el segundo numero: ");
                num2 = scanner.nextDouble(); 
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
                
            case 4:
                System.out.print("Digita el primer numero: ");
                num1 = scanner.nextDouble();
                System.out.print("Digita el segundo numero: "); 
                num2 = scanner.nextDouble();
                
                if (num2 != 0){
                    resultado = num1 / num2;
                    System.out.println("El resultado de la division es: " + resultado);
                } 
                else{
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
                
                default:
                System.out.println("Opcion no valida.");
                break;
        }        
    }
}