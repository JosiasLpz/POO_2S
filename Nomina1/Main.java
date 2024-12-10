package Nomina1;
public class Main 
{
    public static void main(String[] args) 
    {
        Docente [] trabajadoresd = new Docente[2];
        PersonalApoyo [] trabajadoresp = new PersonalApoyo[2];
        
        trabajadoresd[0] = new Docente("Cesar","Docente","ISC",7,150,3);
        trabajadoresd[1] = new Docente("Marcos","Docente","Mecanica",8,150,3);
        trabajadoresp[0] = new PersonalApoyo(5,100,1,"Julian","intendencia","Mantenimiento");
        trabajadoresp[1] = new PersonalApoyo(5,100,1,"Abraham","intendencia","Limpieza");
        

        for(int i=0; i<2; i++) 
        {          
            System.out.println(trabajadoresd[i].toString());
            System.out.println("Monto total: " + trabajadoresd[i].calculaTotal());
        }
        
        for (int j=0; j<2; j++) 
        {
            System.out.println(trabajadoresp[j].toString());
            System.out.println("Monto total: " + trabajadoresp[j].calculaPagar());
        }        
    }    
}