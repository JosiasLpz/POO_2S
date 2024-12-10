package Empresa;
public class Main 
{
    public static void main(String[] args) 
    {                
        empleadoD(new Director("Juan",25,34,360000,"a1",21));
        empleadoD(new Director("Jorge",30,20,300000,"a2",10));
        
        empleadoO(new Operario("Pedro",26,20,200000,2));
        empleadoO(new Operario("Jesus",24,25,250000,5));            
    }   
        public static void empleadoD(Empleado a)
        {
            System.out.print("\n"+a.toString()+"\n"+a.incentivar());
        }
        
        public static void empleadoO(Operario b)
        {
            System.out.print("\n"+b.toString()+"\n"+b.incentivar()+"\nsu nivel era "+b.actualiarNivel()+"\nsu nivel es "+b.actualiarNivel());
        }    
}








//2331688868 numero de rastreo