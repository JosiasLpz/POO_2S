package Perfecto;
import java.util.Scanner;
public class NumeroPerfecto
{
    private int num;
    private int suma;
    
    public NumeroPerfecto(int num, int suma)
    {
        
        this.num=num;
        this.suma=suma;
    }
    
    public void evaluar()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu numero para ver si es perfecto: "); num=leer.nextInt();
        for(int i = 1; i < num; i++)
        {
            if(num%i == 0)
            {
                suma += i;
            }
        }
        if(num == suma)
        {
                System.out.println("El numero es perfecto");
        }
        else
        {
                System.out.println("El numero no es perfecto");
        }
    }
}