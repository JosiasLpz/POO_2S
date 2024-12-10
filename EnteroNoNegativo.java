import java.util.Scanner;
public class EnteroNoNegativo{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("ingresa un numero entero no negativo: ");
        Byte numero = leer.nextByte(); 
        
        int factorial = calculadoraFactorial(numero);     
        System.out.println("el factorial de ");
        
    }

    private static int calculadoraFactorial(int nu){
    
        if (nu==0||nu==1){
        return 1;}
         else;{
           return nu * calculadoraFactorial(nu - 1);
        }  
    }  
}