package CrossFit;
import java.util.Scanner;
public class Hielitos extends CostosHielitos
{
     Scanner leer = new Scanner(System.in);   
     private double monto, cambio;
    
     public Hielitos(int hielitoOreo,int hielitoPayLimon,int hielitoGrosella,int hielitoCacahuate,int hielitoMangoChamoy,int hielitoMango)
    {
        super(hielitoOreo,hielitoPayLimon,hielitoGrosella,hielitoCacahuate,hielitoMangoChamoy,hielitoMango);              
    }
       
    public void costosHielitos$()
    {
        System.out.println("\nhielito oreo $"+getHielitoOreo()+"\nhielito pay limon $"+getHielitoPayLimon()+"\nhielito grosella $"+getHielitoGrosella()+"\nhielito cacahuate $"+getHielitoCacahuate()+"\nhielito mango chamoy $"+getHielitoMangoChamoy()+"\nhielito mango $"+getHielitoMango());        
    }  
        
    public void vender$()
    {
        
    }
}