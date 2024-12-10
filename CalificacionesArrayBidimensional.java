import java.util.Scanner;
public class CalificacionesArrayBidimensional{
    public static void main(String[]args){
      Scanner leer = new Scanner(System.in);
      Scanner entrada = new Scanner(System.in);
      
      int filas=5;
      int columnas=5;  
      int [][]cuadro=new int[filas][columnas];
      
      String[] materias = new String [5];
      int [][] calificaciones = new int[filas][columnas];
      
        for(int i=0; i<filas; i++){
          System.out.print("cuál es el nombre de la materia: ");
          materias[i] = leer.nextLine();
            for(int j=0; j<columnas; j++){
              System.out.print("cuál es tu calificación " + (j+1)+ " de la materia " + materias[i]+ ": ");
              calificaciones[i][j] = entrada.nextInt();
            }
        }
      
        for(int i=0; i<filas; i++){
          System.out.println(materias[i]);
            for(int j=0; j<columnas; j++){ 
              System.out.print(calificaciones[i][j] + " ");
            }
          System.out.println();
        }
      
    }
}