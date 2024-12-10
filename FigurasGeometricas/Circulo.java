package FigurasGeometricas;
/*
*@Josias.
*/
import java.util.Scanner;
public class Circulo
{
    Scanner leer = new Scanner(System.in);
     private final double PI = 3.1416;
   
    void areaCirculo()
    {
        System.out.print("Ingrese la medida del radio del circulo por favor: ");
        double radio = leer.nextDouble();
        double radio_cuadrado = radio * radio;
        double area = radio_cuadrado * PI;
        System.out.println("El area del circulo es: " + area);
    }
    void perimetroCirculo()
    {
        System.out.print("Ingrese el diametro del circulo por favor: ");
        double diametro = leer.nextDouble();
        double perimetro = diametro * PI;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}