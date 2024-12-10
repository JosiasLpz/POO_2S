package Nomina;
public class Main 
{
    public static void main(String[] args) 
    {
        Docente [] trabajadoresd = new Docente[3];
        PersonalApoyo [] trabajadoresp = new PersonalApoyo[3];
        
        trabajadoresd[0] = new Docente("Cesar","Docente","sistemas computacionales",7,150,3);
        trabajadoresd[1] = new Docente("Marcos","Docente","Mecanica",8,150,4);        
        trabajadoresd[2] = new Docente("manuel", "profesor", "industrial",  7, 150, 5);       
        
        trabajadoresp[0] = new PersonalApoyo(5,100,1,"saul","intendencia","Mantenimiento");
        trabajadoresp[1] = new PersonalApoyo(5,100,1,"Abraham","intendencia","Limpieza");
        trabajadoresp[2] = new PersonalApoyo(5, 100, 1,"Julian", "intendencia", "limpieza");   

        for(int i=0; i<3; i++) 
        {                        
            System.out.println("\nDocente "+trabajadoresd[i].toString()
            +"\nTotal: $"+trabajadoresd[i].calculaTotal()           
            +"\nIVA: $"+trabajadoresd[i].calculaIva()
            +"\nISR: $"+trabajadoresd[i].calculaIsr()
            +"\nNeto a cobrar: $"+trabajadoresd[i].calculaNeto());                  
        }
        
        for (int j=0; j<3; j++) 
        {            
            System.out.println("\nPersonal de apoyo"+trabajadoresp[j].toString()
            +"\nTotal a cobrar: $"+trabajadoresp[j].calculaTotal());                         
        }                                                                       
    }
}