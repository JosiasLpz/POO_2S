import java.util.Scanner;
public class Promedio {
    public static void main(String [] args){ 
        Scanner leer = new Scanner(System.in);   
    
        System.out.print("Ingrese su nombre completo:");
         String nombre= leer.nextLine();
         
         double sumaCalificaciones = 0;
         
         for (int i= 1; i<=5;i++){
             System.out.print("Por favor, ingrese la calificación" + i + ":");
             double calificacion = leer.nextDouble();
             sumaCalificaciones = calificacion * 5; 
            } 
         double promedio = sumaCalificaciones/5;
         System.out.println("Nombre:" + nombre);
         System.out.println("Promedio de calificaciones:" + promedio);  
         leer.close();
        }
    }  