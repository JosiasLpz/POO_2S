import java.util.Scanner;
public class PrecioDescuento{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        System.out.println("ingrese el precio de su producto: ");
        double precio = leer.nextDouble();
        double precioDescuento = precio - (precio * 0.20);
        System.out.println("su precio real es: " + precio);
        System.out.print("su precio con el 20 porciento de descuento es: " + precioDescuento);     
    }
}