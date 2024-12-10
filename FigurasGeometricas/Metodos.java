package FigurasGeometricas;
import java.util.Scanner;
public class Metodos
{
    public static void main(String [] args)
    {        
        Scanner in = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Circulo cir = new Circulo();
        Triangulo tri = new Triangulo();
        Trapecio tra = new Trapecio();
        Cuadrado cua = new Cuadrado();        
        String operacion = "";
        byte op;
        
        System.out.println("Este programa calcula areas y pemimetros.");
        System.out.println("Figuras: \n * Cuadrado. \n * Circulo. \n * Triangulo. \n * Trapecio.");
        System.out.println("Selecciona una figura: ");
        op = in.nextByte();
        
        switch(op)
        {
            case 1: 
                System.out.print("Selecciona una operacion (area o perimetro): ");
                operacion = leer.nextLine();
                if(operacion.equalsIgnoreCase("Area"))
                {
                    cua.areaCuadrado();
                }
                if(operacion.equalsIgnoreCase("Perimetro"))
                {
                    cua.perimetroCuadrado();
                }
               break;
            case 2:
                System.out.print("Selecciona una operacion (area o perimetro): ");
                operacion = leer.nextLine();
                if(operacion.equalsIgnoreCase("Area"))
                {
                   cir.areaCirculo();
                }
                if(operacion.equalsIgnoreCase("Perimetro"))
                {
                   cir.perimetroCirculo();
                }
               break;
            case 3:
                System.out.print("Selecciona una operacion (area o perimetro): ");
                operacion = leer.nextLine();
                if(operacion.equalsIgnoreCase("Area"))
                {
                   tri.areaTriangulo();
                }
                if(operacion.equalsIgnoreCase("Perimetro"))
                {
                   tri.perimetroTriangulo();
                }
                break;
            case 4:
                System.out.print("Selecciona una operacion (area o perimetro): ");
                operacion = leer.nextLine();
                if(operacion.equalsIgnoreCase("Area"))
                {
                    tra.areaTrapecio();
                }
                if(operacion.equalsIgnoreCase("Perimetro"))
                {
                    tra.perimetroTrapecio();
                }
                break;
            default:
                System.out.println("Error!, la opcion seleccionada no existe.");
        }
    }
}