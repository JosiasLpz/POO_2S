import java.util.Scanner;
public class MesAñoArray{
    public static void main(String[] args){ 
       Scanner leer = new Scanner(System.in);
       
       byte num;
       
       String meses [] = new String[13];
       meses[1]="Enero";
       meses[2]="Febrero";
       meses[3]="Marzo";
       meses[4]="Abril";
       meses[5]="Mayo";
       meses[6]="Junio";
       meses[7]="Julio";
       meses[8]="Agosto";
       meses[9]="Septiembre";
       meses[10]="Octubre";
       meses[11]="Noviembre";
       meses[12]="Diciembre";
       System.out.println("digite el número del mes que deseas saber: ");
       num = leer.nextByte();
       
       switch(num)
       {
           case 1:System.out.print("El mes es " + meses[1]);break;
           case 2: System.out.print("El mes es " + meses[2]);break;
           case 3: System.out.print("El mes es " + meses[3]);break;
           case 4: System.out.print("El mes es " + meses[4]);break;
           case 5: System.out.print("El mes es " + meses[5]);break;
           case 6: System.out.print("El mes es " + meses[6]);break;
           case 7: System.out.print("El mes es " + meses[7]);break;
           case 8: System.out.print("El mes es " + meses[8]);break;
           case 9: System.out.print("El mes es " + meses[9]);break;
           case 10: System.out.print("El mes es " + meses[10]);break;
           case 11: System.out.print("El mes es " + meses[11]);break;         
           case 12: System.out.print("El mes es " + meses[12]);break;
        }
       System.out.println("");   
    }
}