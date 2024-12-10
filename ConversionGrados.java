import java.util.Scanner;
public class ConversionGrados
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        //entrada
        System.out.println("ingrese su temperatura en celcius: ");
        float celsius = leer.nextFloat();
        //proceso
        float kelvin = celsius + 273; 
        float farenheit = (celsius * 9/5) + 32;
        
        System.out.println("su temperatura de celsius a kelvin: " + kelvin);
        System.out.println("su temperatura de celsius a farenheit: " + farenheit);    
    }
}