import java.util.Scanner; 
public class DescuentoX {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número: ");
        double numero = leer.nextDouble();
        double porcentaje = 0.15 * numero;
        double resultado = numero - porcentaje;

        System.out.println("El resultado después de restar el 15% es: " + resultado);
        leer.close();
    }
}