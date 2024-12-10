package Coche;
public class Coche
{    
    private String marca;
    private String modelo ;
    private String color;
    private int km;
    private boolean encendido;
           
            public Coche(String marca,String modelo, String color,int km)
            {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.km = km;           
            }          
            public void encender()
            {       
                encendido = true;
                    System.out.println("el coche " + marca + " modelo " + modelo + " esta encendido");
            }  
            public void acelerar()
            {
                if(encendido)
                {
                    System.out.println("el coche " + marca + " modelo " + modelo + " esta acelerando");
                }
                else
                {
                    System.out.println("el coche " + marca + " modelo" + modelo + " esta apagado");
                }
            }           
            public void camvelocidad()
            {
                if (encendido)
                {
                    System.out.println("el coche " + marca + " modelo " + modelo + " esta cambiando de velocidad");
                }
                else
                {
                    System.out.println("el coche " + marca + " modelo " + modelo + " esta apagado");
                } 
            }            
            public void desacelerar()
            {               
                System.out.println("el coche " + marca + " modelo " + modelo + " esta desacelerando");
            }
            public void apagar()
            {
                encendido = false;
                System.out.println("el coche " + marca + " modelo " + modelo + " esta apagado");
            }         
}