package Vectores;
import java.util.Scanner;
public class Bidimensional
{
    public static void main(String[]args)
    {
        Scanner leer = new Scanner(System.in);
        
        int filas=5;
        int columnas=4; 
        int [][]cuadro=new int[filas][columnas];
        
        for(int i=0; i<filas; i++)
        {
          for(int j=0; j<columnas; j++)
          {
            cuadro[i][j]=i * columnas + j + 1;
          }
        }
        
        for(int i=0; i<filas; i++)
        {
           for(int j=0; j<columnas; j++)
           {
               System.out.print(cuadro[i][j] + " ");
           }
           System.out.println();
        } 
    }    
}