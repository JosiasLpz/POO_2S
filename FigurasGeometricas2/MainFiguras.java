// crear paqueteria //
package FigurasGeometricas2;
// importar el objeto Scanner de la biblioteca java.util //
import java.util.Scanner;
// publicar la clase //
public class MainFiguras {
    // publicar el metodo main para que arranque el programa //
    public static void main(String[] args) {
        // inicializar el obbjeto Scanner //
        Scanner leer = new Scanner(System.in);
        // inicializar la variable 77
        int opc;
        // mandar texto a la pantalla //
        System.err.println("----------------Programa de figuras geométricas--------------");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Círculo");
        System.out.println("3.- Triángulo");
        System.out.println("4.- Trapecio");
        System.out.print("Selecciona una opción: ");
        // ocupar el objeto Scanner para almacenar dato el la variable opc //
        opc = leer.nextInt();
        System.err.println("------------------------------------------------------------");
        // llamar a la estructura de control //
        switch (opc) {
            // inicializar el primer caso //
            case 1:
                // inicializar el objeto Cuadrado //
                Cuadrado cuadrado = new Cuadrado();
                // llamar a la estructura de condiciones //
                if(eleccion()==1)
                    // inicializar la primera opcion //
                    cuadrado.area(); 
                // mas //
                else 
                    // inicializar la segunda opcion //
                    cuadrado.perimetro();
                    // salir de del primer metodo del Cuadrado //
                break;
            case 2:
                // inicializar el objeto Circulo //
                Circulo circulo = new Circulo();
                 if(eleccion()==1)
                     // inicializar la primera opcion //
                    circulo.area(); 
                 // mas //
                else 
                     // inicializar la segunda opcion //
                    circulo.perimetro();
                  // salir de del primer metodo del Circulo //
                break;
            case 3:
                // inicializar el objeto Triangulo //
                 Triangulo triangulo = new Triangulo();
                 if(eleccion()==1)
                     // inicializar la primera opcion //
                    triangulo.area(); 
                 // mas //
                else 
                     // inicializar la segunda opcion //
                    triangulo.perimetro();
                  // salir de del primer metodo del Triangulo //
                break;
            case 4:
                // inicializar el objeto Trapecio //
                Trapecio trapecio = new Trapecio();
                 if(eleccion()==1)
                     // inicializar la primera opcion //
                    trapecio.area(); 
                 // mas //
                else 
                     // inicializar la segunda opcion //
                    trapecio.perimetro();
                  // salir de del primer metodo del Trapecio //
                break;    
            default:
                    System.out.println("Opción inválida. Saliendo...");
                break;
        }
    }
    // Función o metodo para que el usuario elija entre área o perímetro.
    // El uso de "static" en este contexto es una elección de diseño 
    // para facilitar la llamada al método desde el método main sin 
    // tener que crear una instancia de la clase MainFiguras.
    static int eleccion(){
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        System.out.println("1.-Área");
        System.out.println("2.-Perímetro");
        System.out.print("Selecciona una opción: ");
        opc = leer.nextInt();
        if (opc != 1 && opc != 2){
            System.out.println("Opción inválida. Saliendo...");
            // finaliza el programa si el ususario no eligue una opcion entre 1 0 2
            System.exit(0);
        }
        System.err.println("------------------------------------------------------------");  
        // retornar el valor de la variable opc para que el usuario al programa de nuevo //
        return opc;
    }
}