import java.util.Random;
public class AguilaSol
{ 
    public static void main(String[]args)
    { 
        boolean random = true;
        String resultado; 
        Random Ran = new Random();
        
        random = Ran.nextBoolean();
        resultado = random ? "Aguila" : "Sol";
        
        System.out.println(resultado);
    }
}