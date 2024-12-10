import java.util.Scanner;
public class PromedioArray{
    public static void main(String [] args){
        
        double promedio[] = new double[5]; 
        Scanner leer = new Scanner(System.in);
        
        double sumatoria = 0, calificacionFinal = 0;
        
        for(int i = 0; i < promedio.length; i++ ){
            System.out.print("digite sus calificaciones: ");
            promedio[i] = leer.nextDouble();
            sumatoria += promedio[i];
        }
           calificacionFinal = sumatoria/5;
           System.out.print("tu calificacion es: " + calificacionFinal);
           System.out.println("");
    }    
}