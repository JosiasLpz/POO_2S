package Coche;
public class Main{
    public static void main(String[] args){
        
        Coche wo = new Coche("Wolkvasgen","jetta","blanco",60);
        Coche me = new Coche("Mercedes", "clase G", "negro", 50);
        Coche che = new Coche("Seat", "ibiza", "gris", 100);
        Coche ho = new Coche("Honda","city","blanco", 40);
        Coche me1 = new Coche("Mercedes","AMG","blanco",30);
                   
        wo.encender();
        wo.acelerar();
       
        wo.camvelocidad();        wo.encender();

        wo.desacelerar();
        wo.apagar();
        
        System.out.println("");
       
        me.encender();
        me.acelerar();
       
        me.camvelocidad();
        me.desacelerar();
        me.apagar();
        
        System.out.println("");
        
         che.encender();
         che.acelerar();
       
         che.camvelocidad();
         che.desacelerar();     
         
         che.apagar();
         
         System.out.println("");
        
         ho.encender();
         ho.acelerar();
       
         ho.camvelocidad();
         ho.desacelerar();     
         
         ho.apagar();
         
         System.out.println("");
         
         me1.encender();
         me1.acelerar();
       
         me1.camvelocidad();
         me1.desacelerar();     
         
         me1.apagar();    
    }
}   