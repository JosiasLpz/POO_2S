package Figuras;
public class Main
{
    public static void main(String[] args) 
    {
        Circulo a = new Circulo("circulo",4);
        Triangulo b = new Triangulo("triangulo",4,6);
        
        mostrarResultado(new Circulo("circulo",4));
        mostrarResultado(new Triangulo("triangulo",4,6));                
    }    
    
    public static void mostrarResultado(Figuras c)
    {
        System.out.print("\n"+c.toString()+"\n"+c.calculaArea());
        
    }
}
