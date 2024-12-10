package Objetos;
import java.util.Scanner;
public class OperacionesBasicas{
    Scanner lector = new Scanner(System.in);
    
    float num1; 
    float num2;
        
    void getSuma(){
        System.out.println("el resultado de la suma de: " + num1+ " + " + num2+ " = " +(num1 + num2));
    }
    
    void getResta(){
        System.out.println("el resultado de la resta de: " + num1+ " - " + num2+ " = " +(num1 - num2));
    }
    
    
    void getMultiplicacion(){
        System.out.println("el resultado de la multiplicacion de: " + num1+ " * " + num2+ " = " +(num1 * num2));
    }
    
    void getDivision(){
        System.out.println("el resultado de la division de: " + num1+ " / " + num2+ " = " +(num1 / num2));
    }
    
    void getPotenciaCuadrada(){
        System.out.println("el resultado de la potencia al cuadrado de: " + num1+ " es" + " = " +(num1 * num1 ));
    }
    
    void getPotenciaCubica(){
        System.out.println("el resultado de la potencia cubica de: " + num1+ " es" + " = " +(num1 * num1 * num1));
    }
     
}