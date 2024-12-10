import java.util.Scanner;
public class DescuentoIfAnidado{  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto total: ");
        double montoTotal = scanner.nextDouble();

        double descuento = 600;
        
        if (montoTotal   <=500 )    {
            System.out.print("no hay descuento");
        }
        if (montoTotal >=500 && montoTotal < 1000) {
            System.out.print("descuento = montoTotal");
        }
        if (montoTotal >= 1000 && montoTotal < 7000) {
            System.out.print("descuento = montoTotal"); 
        }
        if (montoTotal >= 7000 && montoTotal < 15000) {
            System.out.print(" descuento = montoTotal");
        }
        if (montoTotal > 15000 ) {
            System.out.print("descuento = montoTotal");
        } 
        double montoConDescuento = montoTotal - descuento;
        
        System.out.println("Monto total: $" + montoTotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Monto con descuento: $" + montoConDescuento);
        scanner.close();
    }
}