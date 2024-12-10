package Cuenta;
public class Main
{
    public static void main(String[] args)
    {
        Cuenta vi = new Cuenta("Viridiana",700);
        Cuenta ce = new Cuenta("Cesar",500);
        
        vi.depositar();
        ce.depositar();
        
        vi.retirar();
        ce.retirar();
        
        System.out.println(vi.toString());
        System.out.print(ce.toString());                
    }
}