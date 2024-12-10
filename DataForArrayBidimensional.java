import java.util.Scanner;
public class DataForArrayBidimensional{
     public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        Scanner leer2=new Scanner(System.in);
         
         String nombre[]=new String[5];
         int edad[]=new int[5];
         
        for(int i=0; i<nombre.length; i++){
            System.out.print("cual es tu nombre: ");
            nombre[i]=leer.nextLine();
            System.out.print("cual es tu edad: ");
            edad[i]=leer2.nextInt();            
           
        }  
        for(int i=0; i<edad.length; i++){
            System.out.println("tu nombre es "+nombre[i] +" y tu edad "+ edad[i]);
        } 
    }  
}