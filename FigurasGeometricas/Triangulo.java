package FigurasGeometricas;
/*
*@Josias.
*/
import java.util.Scanner;
public class Triangulo
{
    Scanner leer = new Scanner(System.in); 
    
    void areaTriangulo()
    {
        System.out.print("Ingrese la base del triangulo: ");
        double base = leer.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double altura = leer.nextDouble();
        
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
    
    void perimetroTriangulo()
    {
        System.out.print("Ingrese la medida del primer lado del triangulo: ");
        double lado1 = leer.nextDouble();
        System.out.print("Ingrese la medida del segundo lado del triangulo: ");
        double lado2 = leer.nextDouble();
        System.out.print("Ingrese la medida del tercer lado del triangulo: ");
        double lado3 = leer.nextDouble();
        
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}