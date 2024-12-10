package Figuras;
public class Triangulo extends Figuras
{
    private double base,altura;

    public Triangulo( String nombre,double base, double altura) 
    {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }
    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }            

    @Override
    public double calculaArea() 
    {
        return (base*altura)/2;        
    }        
}
