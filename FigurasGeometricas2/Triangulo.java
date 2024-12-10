// crear paqueteria //
package FigurasGeometricas2;
// importae objeto Scanner //
import java.util.Scanner;
// publicar clase //
public class Triangulo {
    // inicializar objeto Scanner //
    Scanner leer = new Scanner(System.in);
    // inicializar 3 variables de tipo numerico //
    double a, b, c;
    // estructura del metodo //
    public void area(){
        // Obtener las longitudes de los lados del triángulo
        System.out.println("Has elegido área del triángulo");
        System.out.print("Ingrese la longitud del lado a: ");
        a = leer.nextDouble();
        System.out.print("Ingrese la longitud del lado b: ");
        b = leer.nextDouble();
        System.out.print("Ingrese la longitud del lado c: ");
        c = leer.nextDouble();
        // Calcular el semiperímetro
        double s = (a + b + c) / 2;
        // Calcular el área utilizando la fórmula de Herón
        System.out.print("El área del triángulo es: "+(Math.sqrt(s * (s - a) * (s - b) * (s - c))));
    }
    public void perimetro(){
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