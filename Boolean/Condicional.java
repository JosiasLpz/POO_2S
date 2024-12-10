package Boolean;
import java.util.Scanner;
public class Condicional
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero ");
        int numero=leer.nextInt();
        
        boolean resultado=numero>=10;
        System.out.println(resultado);        
    }
}              