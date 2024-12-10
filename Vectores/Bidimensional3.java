package Vectores;
public class Bidimensional3 
{
    public static void main(String[] args) {
        
    
   
        int filas=10;
        int columnas=10;
        int cuadro[][]=new int[filas][columnas];
        
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                cuadro[i][j]=i*columnas+j+1;
            }
        }
        
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                System.out.print(cuadro[i][j]+" ");
            }      
            System.out.println("");
        }           
    }  
}