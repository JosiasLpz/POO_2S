import java.util.Scanner;
public class Crossfit 
{
    public static void main(String[]args)
    { 
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("programación de la semana");  
        System.out.println("¿cuántos wod haces en la semana?");  
        System.out.println("1 wod ");
        System.out.println("2 wod ");
        System.out.println("3 wod ");
        System.out.println("4 wod ");
        System.out.println("5 wod ");
        System.out.print("Selecciona los wod que haces en la semana (1/2/3/4/5): ");  
         
        int opcion = Scanner.nextInt();
        
        switch (opcion) 
        {
            case 1:System.out.print("No eres diciplinado."); Scanner.nextDouble(); break;                 
            case 2: System.out.print("Haces un mínimo intento ");Scanner.nextDouble();break;                
            case 3: System.out.print("Le estás metiendo empeño ");  Scanner.nextDouble();break;                
            case 4: System.out.print("Haces un máximo intento"); Scanner.nextDouble();break;               
            case 5: System.out.print("Eres diciplinado");Scanner.nextDouble();break;                
            default: System.out.println("Date de baja del crossfit");
        }
    }
}       