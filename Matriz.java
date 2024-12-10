import java.util.Scanner;
public class Matriz
{
   public static void main(String[] args)
   {
       
        String[] generos = new String[2];
        String[][] nombres = new String[2][10];
        
        Scanner leer = new Scanner(System.in); 
        
        for(int genero=0;genero<2;genero++)
        {
            System.out.print("Ingrese el genero "+(genero+1)+": ");
            generos[genero]=leer.nextLine();
        }  
        
        for(int genero=0;genero<2;genero++)
        {
            System.out.println("Ingrese el nombre para el genero "+generos[genero]+":");
            
            for(int nombre=0;nombre<10;nombre++)
            {
                System.out.print("nombres "+(nombre+1)+": ");
                nombres[genero][nombre]=leer.nextLine();
            }
        }
        System.out.println("\nnombres del genero:");
        
        for(int genero=0;genero<2;genero++)
        {
            System.out.println("genero: "+generos[genero]);
            
            for(int nombre=0;nombre<9;nombre++)
            {
                System.out.println("\t"+nombres[genero][nombre]); 
            }
        }
    } 
}