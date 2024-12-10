package Random;
import java.util.Random; 
import java.util.Scanner; 
  public class DivisiblesDos
  {   
    public static void main(String[]args)
    {
      Random ran = new Random();
      Scanner leer = new Scanner(System.in);
      
      int numeroGenerado;
      byte contadorPar=0;
      byte contadorImpar=0;
     
      for(byte i=1; i<=50; i++)
      {
        numeroGenerado = ran.nextInt(60)+1;
        System.out.println(numeroGenerado);
        if(0==numeroGenerado%2)
        {
        contadorPar++;
        }
        else
        {
        contadorImpar++;
        } 
      } 
      System.out.println("numeros divisibles entre 2 : " + contadorPar );
      System.out.println("numeros no divisibles entre 2: " + contadorImpar );
    }  
  }  