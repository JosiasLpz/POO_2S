import java.util.Scanner;
public class DatosPersonalesSaludo{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Por favor, ingrese su edad: ");
        int edad = leer.nextInt();
        
        leer.nextLine(); // Limpia el buffer de entrada
        
        System.out.print("Por favor, ingrese su sexo: ");
        String sexo = leer.nextLine();
    
        System.out.format("Hola %s, tu edad es %d\n y tu sexo %s",nombre,edad,sexo);
        
        leer.close();
    }
}