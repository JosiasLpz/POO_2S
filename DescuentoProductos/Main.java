package DescuentoProductos;
public class Main 
{
    public static void main(String[] args) 
    {                
        Awifi [] a = new Awifi [3];
        a [0] = new Awifi("smart",2101,1000,2);
        a [1] = new Awifi("smart",1010,1000,4);     
        a [2] = new Awifi("smart",1010,1000,6);     
        
    for(int i=0; i<3; i++) 
        {          
            System.out.println("\napagador wifi "+a[i].toString());  
            System.out.println("total "+a[i].descuentoApagadoresWifi());           
        }    
    
                
        Cwifi [] b = new Cwifi [6];        
        b [0] = new Cwifi("TP-Link",2002,1000,2,1);
        b [1] = new Cwifi("Xiaomi",1001,1000,2,2);      
        b [2] = new Cwifi("Netatmo",0220,1000,3,1);
        b [3] = new Cwifi("Netgear",0110,1000,3,2);  
        b [4] = new Cwifi("Xiaomi",2002,1000,4,1);
        b [5] = new Cwifi("TP-Link",1001,1000,4,2);              
        for(int i=0; i<6; i++) 
        {                     
            System.out.println("\ncamara wifi "+b[i].toString());               
            System.out.println("total "+b[i].descuentoCamarasWifi());
        }                
        
        Pantalla [] c = new Pantalla [3];
        c [0] = new Pantalla("sony",2010,1000,14);
        c [1] = new Pantalla("lg",1110,1000,15.6);
        c [2] = new Pantalla("samsumg",1110,1000,18.5);
        
        for(int i=0; i<3; i++) 
        {          
            System.out.println("\npantalla "+c[i].toString()); 
            System.out.println("total "+c[i].descuentoPantalla());
        }        
    }    
}