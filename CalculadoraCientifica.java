import java.util.Scanner;
public class CalculadoraCientifica
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
 
        while(true)
        {
            System.out.println("\nCalculadora Cientifica"+"\n1. Suma"+"\n2. Resta"+"\n3. Multiplicacion"+"\n4. Division"+"\n5. Potencia"+"\n6. Raiz cuadrada"+"\n0. Salir"+"\nElija una opcion: ");           
            int opcion = input.nextInt();

            if(opcion == 0)
            {
                break;
            }

            double num1,num2;
            double resultado = 0;

            switch (opcion)
            {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = input.nextDouble();
                    resultado = num1 + num2;
                    break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = input.nextDouble();
                    resultado = num1 - num2;
                    break;
                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = input.nextDouble();
                    resultado = num1 * num2;
                    break;
                case 4:
                    System.out.print("Ingrese el numerador: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el denominador: ");
                    num2 = input.nextDouble();
                    if (num2 != 0)
                    {
                        resultado = num1 / num2;
                    } else
                    {
                        System.out.println("Error: division por cero.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese la base: ");
                    num1 = input.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = input.nextDouble();
                    resultado = Math.pow(num1, num2);
                    break;
                case 6:
                    System.out.print("Ingrese el numero para calcular la raiz cuadrada: ");
                    num1 = input.nextDouble();
                    if (num1 >=0)
                    {
                        resultado = Math.sqrt(num1);                      
                    } else
                    {
                        System.out.println("Error: no se puede calcular la raiz cuadrada de un numero negativo.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }    
            System.out.println("Resultado: " + resultado);
        }                  
    }          
}   