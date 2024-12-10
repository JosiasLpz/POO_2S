package Autos;
public class Main
{
    public static void main(String[] args)
    {
        Autos zu = new Autos();
        
        zu.arrancar();
        zu.acelerar();
        zu.detener();
        zu.frenar();  
        System.out.println("");        
        zu.setAñoFabricacion(2016);
        zu.setColor("gris");
        zu.setMarca("Seat");
        zu.setModelo("ibiza");
        zu.setPrecio(160000);
        System.out.println("");        
        System.out.println("año de fabricacion "+zu.getAñoFabricacion());
        System.out.println("color "+zu.getColor());
        System.out.println("marca "+zu.getMarca());
        System.out.println("modelo "+ zu.getModelo());
        System.out.println("precio "+zu.getPrecio());        
        System.out.println("");  
        
         Autos me = new Autos(); 
         
         me.arrancar();
         me.acelerar();
         me.detener();
         me.frenar();
         me.setAñoFabricacion(2020);
         me.setColor("blanco");
         me.setMarca("Mercedez Benz");
         me.setModelo("AMG Clase G");
         me.setPrecio(4000000);
         System.out.println("");
         System.out.println("año de fabricacion "+me.getAñoFabricacion());
         System.out.println("color "+me.getColor());
         System.out.println("marca "+me.getMarca());
         System.out.println("modelo "+ me.getModelo());
         System.out.println("precio "+me.getPrecio());
    }     
}