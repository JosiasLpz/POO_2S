package Computadora;
public class Computadora
{
    private String marca;
    private String procesador ;
    private String pantalla;
    
            public Computadora(String marca,String procesador, String pantalla)
            {
            this.marca = marca;
            this.procesador = procesador;
            this.pantalla = pantalla;                      
            }   
            
            public void entrada()
            {       
                System.out.println("la computadora esta encendida " );                                                                      
            }
            
            public void marca()
            {
                System.out.println("marca: " + marca);               
            }
            
            public void procesador()
            {
                System.out.println("procesador:  " + procesador);
            }
            
            public void pantalla ()
            {
                System.out.println("pantalla: " + pantalla);
            }
}