import java.util.Scanner;
public class DatosPersonales 
{
    public static void main(String[] args) 
    {
        Scanner leer= new Scanner(System.in);
        
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Por favor, ingrese su edad: ");
        int edad = leer.nextInt();
        
        leer.nextLine(); // Limpia el buffer de entrada
        
        System.out.print("Por favor, ingrese su sexo: ");
        String sexo = leer.nextLine();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        
        leer.close();
    }
}