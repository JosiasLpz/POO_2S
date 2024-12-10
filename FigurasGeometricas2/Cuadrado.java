// crear paqueteria //
package FigurasGeometricas2;
// importar de la biblioteca el objeto Scanner //
import java.util.Scanner;
 // publicar mi clase //
public class Cuadrado {
    // inicializar el objeto Scanner //
    Scanner leer = new Scanner(System.in);
    // inicializar la variale lado //
    double lado;
    // crear metodo area del objeto cuadrado //
    public void area(){
        // mandar texto a la pantalla //
        System.out.println("Has elegido área del cuadrado");
        System.out.print("Introduce el valor de uno de sus lados: ");
        // ocupar el objeto Scanner para almacenar en la variable lado lo que ingrese el usuario //
        lado = leer.nextDouble();
        // mandar texto a pantalla y concatenar //
        System.out.print("El área del cuadrado es: "+(lado*lado));
    }
     // crear metodo perimetro del objeto cuadrado //
    public void perimetro(){
        // mandar texto a la pantalla //
        System.out.println("Has elegido perímetro del cuadrado");
        System.out.print("Introduce el valor de uno de sus lados: ");
        // ocupar el objeto Scanner para almacenar en la variable lado lo que ingrese el usuario //
        lado = leer.nextDouble();
        // mandar texto a pantalla y concatenar //
        System.out.print("El perímetro del cuadrado es: "+(lado*4));
    }
}