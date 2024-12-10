package Objetos;
import java.util.Scanner;
public class ObjetosCalculadora {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Calculadora funcion = new Calculadora();
    
        System.out.println("Operaciones basicas");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Elija una opcion: 1/2/3/4: ");
        byte opcion; 
        opcion = leer.nextByte();
        
        byte num1;
        byte num2;
        byte resultado;
        
        System.out.print("Digita el primer numero: ");
        num1 = leer.nextByte();
        System.out.print("Digite el segundo numero: ");
        num2 = leer.nextByte();
       
        switch(opcion){
            case 1:
                resultado = (byte) (num1 + num2);
                System.out.println("El resultado de la suma es: " + resultado);
            break;
            case 2:
                resultado = (byte)(num1-num2);
                System.out.println("El resultado de la resta es: " + resultado);
            break;
            case 3:
                resultado =(byte)(num1*num2);
                System.out.println("El resultado de la multiplicacion: " + resultado);
            break;
            case 4:
                resultado=(byte)(num1/num2);            
                System.out.println("El resultado de la division: " + resultado);
         
         
        }       
    }   
}