import java.util.Scanner;
  public class DiasSemana {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in); 
        
        System.out.println("seleccione en dia de la semana poniendo su numero: ");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        System.out.println("Selecciona una opcion 1/2/3/4/5/6/7: ");
        byte opcion = leer.nextByte();
        
        if(opcion == 1){
            System.out.println("Lunes");
        } else if(opcion == 2){
            System.out.println("Martes");
        } else if(opcion == 3){
            System.out.println("Miercoles");
        } else if(opcion == 4){
            System.out.println("Jueves");
        } else if(opcion == 5){
            System.out.println("Viernes");
        } else if(opcion == 6){
            System.out.println("Sabado");
        } else if(opcion == 7){
            System.out.println("Domingo");
        } else {
             System.out.println("Dia no valido");
        }       
    }
}