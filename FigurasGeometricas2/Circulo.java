// crear una paqueteria //
package FigurasGeometricas2;
// importar la biblioteca el objeto Scanner //
import java.util.Scanner;
// nombrar mi clase //
public class Circulo
{
    // inicializar mi objeto Scanner //
    Scanner leer = new Scanner(System.in);
    // inicializar variable de tipo numerico //
    double radio;
    // crear metodo area del objeto circulo //
    public void area()
    {
        // mandar mensaje a pantalla // 
        System.out.println("Has elegido área del círculo");
        System.out.print("Introduce el valor del radio:");
        // ocupar el objeto Scanner para almacenar un dato de tipo numerico  em la variable radio//
        radio = leer.nextDouble();
        // ? //
        System.out.print("El área del círculo es: "+(Math.PI*Math.pow(radio, 2)));
    }
     // crear metodo perimetro del objeto circulo //
    public void perimetro()
    {
        // mandar mensaje a pantalla //
        System.out.println("Has elegido perímetro del círculo");
        System.out.print("Introduce el valor del radio:");
        // ocupar el objeto Scanner para almacenar un dato de tipo numerico  em la variable radio//
        radio = leer.nextDouble();
        // ? //
        System.out.print("El perímetro del círculo es: "+(Math.PI*radio));
    }
}