package AreaPerimetro;
import java.util.Scanner;
public class AreaPerimetro
{
    Scanner leer = new Scanner(System.in);    
    double a, b, c;
    public void area()
    {
        System.out.println("Has elegido área del triángulo");
        System.out.print("Ingrese la longitud del lado a: ");
        a = leer.nextDouble();
        System.out.print("Ingrese la longitud del lado b: ");
        b = leer.nextDouble();
        System.out.print("Ingrese la longitud del lado c: ");
        c = leer.nextDouble();

        double s = (a + b + c) / 2;
       
        System.out.print("El área del triángulo es: "+(Math.sqrt(s * (s - a) * (s - b) * (s - c))));
    }
    
    public void perimetro()
    {
       System.out.println("Has elegido perímetro del triángulo");
        System.out.print("Ingrese la longitud del lado a: ");
        a = leer.nextDouble();
        System.out.print("Ingrese la longitud del lado b: ");
        b = leer.nextDouble();
        System.out.print("Ingrese la longitud del lado c: ");
        c = leer.nextDouble();
        System.out.print("El área del triángulo es : "+(a + b + c));        
    }
    
}