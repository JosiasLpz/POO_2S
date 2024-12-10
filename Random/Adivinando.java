package Random;
import java.util.Random; 
import java.util.Scanner; 
    public class Adivinando
    {
        public static void main(String[]args)
        {   
          Random aleatorio = new Random();
          Scanner leer = new Scanner(System.in);
        
          int num;
          int numAleatorio=aleatorio.nextInt(50);
          boolean adivinando=true;
                          
            while(adivinando)
            {
              System.out.println("Adivina el numero random del 1 al 50 ");
              num = leer.nextInt();
            
                if(num>numAleatorio)
                {
                  System.out.println("El número es mayor al número random");
                }
                else if(num<numAleatorio)
                { 
                  System.out.println("El número es menor al número random");
                }
                else if (num == numAleatorio)
                {
                  System.out.print("Adivinaste el numero");
                  adivinando=false;
                }    
            }          
        }     
    }  