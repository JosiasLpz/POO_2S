package CrossFit;
public class Main
{
    public static void main(String[] args)
    {         
        Coach a = new  Coach("alexis","intermedio","masculino",28);
        System.out.println(""+a.toString());
        
        CostosHielitos b = new  CostosHielitos (15,15,15,15,15,15);
        System.out.print(""+b.toString());
    }                  
}