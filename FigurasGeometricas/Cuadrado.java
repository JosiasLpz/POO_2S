package FigurasGeometricas;
/*
*@Josias.
*/
import java.util.Scanner;
public class Cuadrado
{
    Scanner leer = new Scanner(System.in);
    
    void areaCuadrado()
    {
        System.out.print("Ingrezsa la medida del lado del cuadrado: ");
        double l = leer.nextDouble();
        
        double area = l * l;
        System.out.println("El area del cadrado es: " + area);
    }
    void perimetroCuadrado()
    {
        System.out.print("Ingrezsa la medida del lado del cuadrado: ");
        double l = leer.nextDouble();
        
        double perimetro = l * 4;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}
