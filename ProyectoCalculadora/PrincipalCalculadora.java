package ProyectoCalculadora;
import java.util.Scanner;
public class PrincipalCalculadora{
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     Calculadora objCalculadora = new Calculadora();
     // crear variables de tipo numerico //
     int opc, valor1, valor2;
     // mandar mensaje a pantalla //
     System.out.println("---------Programa Calculadora-----------");
     System.out.println("1.- Suma");
     System.out.println("2.- Resta");
     System.out.println("3.- Multiplicacion");
     System.out.println("4.- Division");
     System.out.print("Selecciona una opcion: ");
     // almacenar el vslor que ingrese el usuario en pantalla  en la variable //
     opc=leer.nextInt();
     // estructura de control de flujo para tomar una desicion en los casos tomando en cuenta la condicion //
        switch (opc) {
            case 1:
                // mandar mensaje a pantalla //
                System.out.print("Dame el primer valor: ");
                // utlizar el objeto Scanner para 
                valor1 = leer.nextInt();
                  // mandar mensaje a pantalla //
                System.out.print("Dame el segundo valor: ");
                valor2 = leer.nextInt();
                objCalculadora.getSuma(valor1, valor2);
            break;
            case 2:
                objCalculadora.getResta();
            break;
            case 3:
                  // mandar mensaje a pantalla //
                System.out.print("Dame el primer valor: ");
                valor1 = leer.nextInt();
                  // mandar mensaje a pantalla //
                System.out.print("Dame el segundo valor: ");
                valor2 = leer.nextInt();
                  // mandar mensaje a pantalla y concatenar para mostar el valor de la variable //
                System.out.println("El resultado de la Multiplicacion de: " + valor1 +"*"+ valor2 +"="+ objCalculadora.getMulti(valor1, valor2)); 
            break;
            case 4: 
                  // mandar mensaje a pantalla //
                System.out.print("Dame el primer valor: ");
                valor1 = leer.nextInt();
                  // mandar mensaje a pantalla //
                System.out.print("Dame el segundo valor: ");
                valor2 = leer.nextInt();
                  // mandar mensaje a pantalla y concatenar para mostar el valor de la variable //
                System.out.println("El resultado de la division de: " + valor1 +"+"+ valor2 +"="+objCalculadora.getDivi(valor1, valor2)); 
            break;            
            default:
                break;
        }
    }
    
}