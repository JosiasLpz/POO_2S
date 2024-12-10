// crear paqueteria //
package ProyectoCalculadora;
// importar el objeto Scanner //
import java.util.Scanner;
// publicar el nombre de mi clase //
public class Calculadora{
    // iniciaizar e objeto //
    Scanner leer = new Scanner(System.in);
    // crear metodo suma //
    void getSuma(int dato1, int dato2){
        System.out.println("El resultado de la suma de: " +dato1+"+"+dato2+"="+(dato1+dato2));
    }
    // crear metodo resta //
    void getResta(){
        // crear variables de tipo numerico //
        int valor1, valor2;
        // mandar mensaje en pantalla //
        System.out.println("Dame el primer valor:");
        // usar el objeto Scanner para ingresar texto en la pantalla y guardalo en la variable valor1 //
        valor1 = leer.nextInt();
        System.out.println("Dame el segundo valor:");
          // usar el objeto Scanner para ingresar texto en la pantalla y guardalo en la variable valor1 //
        valor2 = leer.nextInt();
        // mandar mensaje en pantalla //
        System.out.println("El resultado de la resta de: " +valor1+"-"+valor2+"="+(valor1-valor2));
        leer.close();
    }
     // crear metodo multiplicacion //
    int getMulti(int dato1, int dato2){
        return dato1*dato2;
    }
     // crear metodo division // 
    double getDivi(int dato1, int dato2){
        return dato1/dato2;
    }
}