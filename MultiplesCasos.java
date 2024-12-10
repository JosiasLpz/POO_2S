import java.util.Scanner;
public class MultiplesCasos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                   
         byte in;
         String volteada[] = new String[13];
         volteada[1]="Enero";
         volteada[2]="Febrero";
         volteada[3]="Marzo";
         volteada[4]="Abril";
         volteada[5]="Mayo";
         volteada[6]="Junio";
         volteada[7]="Julio";
         volteada[8]="Agosto";
         volteada[9]="Septiembre";
         volteada[10]="Octubre";
         volteada[11]="Noviembre";
         volteada[12]="Diciembre";
         System.out.println("digite el nombre: ");
         in = leer.nextByte();
         switch(in){
           case 1: System.out.print("El mes es " + volteada [1]);break; 
           case 2: System.out.print("El mes es " + volteada [2]);break; 
           case 3: System.out.print("El mes es " + volteada [3]);break; 
           case 4: System.out.print("El mes es " + volteada [4]);break; 
           case 5: System.out.print("El mes es " + volteada [5]);break; 
           case 6: System.out.print("El mes es " + volteada [6]);break; 
           case 7: System.out.print("El mes es " + volteada [7]);break; 
           case 8: System.out.print("El mes es " + volteada [8]);break; 
        
         
                    
           
           

         
         
         
         
         
         }
    }
}