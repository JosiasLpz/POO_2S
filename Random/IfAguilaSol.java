package Random;
import java.util.Random;
public class IfAguilaSol
{ 
    public static void main(String[]args)
    {         
        Random random = new Random();
        if (random.nextBoolean())
        System.out.print("cara");
        else 
        System.out.print("cruz");
    }
}