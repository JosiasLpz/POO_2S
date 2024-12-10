package FigurasGeometricas;
/*
*@Josias.
*/
import java.util.Scanner;
public class Trapecio
{
    Scanner leer = new Scanner(System.in); 
    
    void areaTrapecio()
    {

        System.out.print("Ingrese la base mayor: ");
        double B = leer.nextDouble();
        System.out.print("Ingrese la base menor: ");
        double b = leer.nextDouble();    
        System.out.print("Ingrese la altura: ");
        double h = leer.nextDouble();
        
        double area = ((B + b) / 2) * h;
        System.out.println("El area del trapecio es: " + area);
    }
    
    void perimetroTrapecio()
    {
        System.out.print("Ingrese la base mayor: ");
        double B = leer.nextDouble();
        System.out.print("Ingrese la base menor: ");
        double b = leer.nextDouble(); 
        System.out.print("Ingrese la medida del costado: ");
        double l = leer.nextDouble();
        
        double perimetro = B + b + l + l;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}