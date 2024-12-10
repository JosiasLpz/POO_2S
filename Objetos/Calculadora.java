package Objetos;
import java.util.Scanner;
public class Calculadora{
    Scanner lector = new Scanner(System.in);
    int numero1;
    int numero2;
    int resultado;
    
    void numeros(){
        System.out.println("Ingrese el primer número: ");
        numero1 = lector.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numero2 = lector.nextInt();
    }
    
    int suma(){ 
        return resultado = numero1 + numero2;
    }
    int resta(){
        return resultado = numero1 - numero2;
    }
    int multiplicacion(){
        return resultado = numero1 * numero2;
    }
    int division(){
        return resultado = numero1 /  numero2;
    }
 
}