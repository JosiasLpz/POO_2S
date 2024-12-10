// crear paqueteria //
package FigurasGeometricas2; 
// importar el objeto Scanner de la biblioteca util //
import java.util.Scanner;
// publicar clase //
public class Trapecio{
    // inicializar objeto Scanner //
    Scanner leer = new Scanner(System.in);
    double a, b1, b2, h, c;

    public void area(){
        System.out.println("Has elegido área del trapecio");
        System.out.print("Ingrese la longitud de la base inferior b1: ");
        b1 = leer.nextDouble();
        System.out.print("Ingrese la longitud de la base superior b2: ");
        b2 = leer.nextDouble();
        System.out.print("Ingrese la altura h: ");
        h = leer.nextDouble();
        System.out.print("El area del trapecio es: "+(0.5 * (b1 + b2) * h));
    }

    public void perimetro(){
        System.out.println("Has elegido perímetro del trapecio");
        System.out.print("Ingrese la longitud del lado a: ");
        a = leer.nextDouble();
         System.out.print("Ingrese la longitud del lado b: ");
        c = leer.nextDouble();
        System.out.print("Ingrese la longitud de la base inferior c1: ");
        b1 = leer.nextDouble();
        System.out.print("Ingrese la longitud de la base superior c2: ");
        b2 = leer.nextDouble();
        System.out.print("El perímetro del trapecio es: "+(a + b1 + c + b2));
    }

}
