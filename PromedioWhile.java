import java.util.Scanner;
public class PromedioWhile{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     
        double promedio = 0;
        int interacciones = 1;
        
        while(interacciones <= 5){
            System.out.println("digite su calificacion de la unidad: ");
            promedio += leer.nextInt();
            interacciones++;       
        }
         System.out.println("el promedio es: " + (promedio/5));
    }   
}