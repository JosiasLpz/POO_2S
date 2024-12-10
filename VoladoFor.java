import java.util.Random;
public class VoladoFor{
    public static void main(String[]args){   
        
         int intento1 = 0;
         int intento2 = 0;
        
        for(int veces = 0; veces < 10; veces++){
          Random resultado = new Random();
            if(resultado.nextBoolean()){   
                System.out.println("Aguila");
                intento1 ++;
            }
            else{
                System.out.println("Sol");
                intento2 ++;
            }
        }
         System.out.println("obtuviste Aguila " + intento1 + " veces");
         System.out.println("obtuviste Sol " + intento2 + " veces" );
    }
}