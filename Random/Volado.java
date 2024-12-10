package Random;
import java.util.Random;
public class Volado 
{
    public static void main(String[]args)
    {                         
        Random ran = new Random();
        
        int veces = 0;
        int intento1 = 0;
        int intento2 = 0;
        
        while(veces<10)
        {  
            int volado=ran.nextInt(2);
            
            if(volado==1)
            {   
              System.out.println("Aguila");
              intento1 ++;
            }
            else
            {   
                System.out.println("Sol");
                intento2 ++;           
            }
            veces ++;
        } 
        System.out.println("obtuviste Aguila " + intento1 + " veces");
        System.out.println("obtuviste Sol " + intento2 + " veces" );
    }    
}