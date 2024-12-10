package Computadora;
public class Laptop
{       
    String marca;
    String procesador;
    String pantalla;
    boolean encendido;
    
    public void estado()
    {
        if(encendido==true)
        {
        System.out.println("\nLa computadora esta encendida ");
        System.out.println("\nmarca " + marca);
        System.out.println("\nprocesador "+ procesador);
        System.out.println("\npantalla " + pantalla);    
        }
    }       
}