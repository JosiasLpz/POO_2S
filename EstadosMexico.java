import java.util.Scanner;
public class EstadosMexico
{
   public static void main(String[] args)
   {       
        String[] estados = new String[6];
        String[][] municipios = new String[6][9];
        
        Scanner leer = new Scanner(System.in); 
        
        for(int estado=0;estado<6;estado++)
        {
            System.out.print("Ingrese el nombre del estado "+(estado+1)+": ");
            estados[estado] = leer.nextLine();
        }          
        for(int estado=0;estado<6;estado++)
        {
            System.out.println("Ingrese municipios para el estado "+estados[estado]+":");            
            for(int municipio=0;municipio<9;municipio++)
            {
                System.out.print("Municipio "+(municipio+1)+": ");
                municipios[estado][municipio]=leer.nextLine();
            }
        }System.out.println("\nMunicipios de los estados de México:");
        
        for(int estado=0;estado<6;estado++)
        {
            System.out.println("Estado: "+estados[estado]);
            
            for(int municipio=0;municipio<9;municipio++)
            {
                System.out.println("\t" + municipios[estado][municipio]); 
            }
        }
    } 
}