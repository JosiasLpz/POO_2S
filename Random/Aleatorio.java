package Random;
import java.util.Random; 
public class Aleatorio
{   
 public static void main(String[]args)
 {
     Random random = new Random();   
       
    int valor = random.nextInt(100)+1;
    
    System.out.println(valor);
 }    
}