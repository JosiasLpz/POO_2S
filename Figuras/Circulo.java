package Figuras;
public class Circulo extends Figuras
{
    private double radio;

    public Circulo(String nombre,double radio) 
    {
        super(nombre);
        this.radio = radio;
    }        

    public double getRadio() 
    {
        return radio;
    }
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
    
    @Override
    public  double calculaArea()
    {
        return(Math.PI*radio*radio);     
    }        
}