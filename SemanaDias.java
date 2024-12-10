import java.util.Scanner;
public class SemanaDias{ 
    public static void main(String[]args){
      Scanner leer = new Scanner(System.in);
      
        int numero;
        
        System.out.println("Digite un número de la semana");
        numero = leer.nextInt();
        
        if(numero == 1){
            System.out.println("Lunes");
        }else if(numero == 2){
            System.out.println("Martes");
        }else if (numero == 3){
            System.out.println("Miercoles");
        }else if(numero == 4){
            System.out.println("Jueves");
        }else if(numero == 5){
            System.out.println("Viernes");
        }else if(numero == 6){
            System.out.println("Sabado");
        }else if(numero == 7){
            System.out.println("Domingo");
        }
    }
}