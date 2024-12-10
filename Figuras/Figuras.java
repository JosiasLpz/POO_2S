package Figuras;
public abstract class Figuras 
{
    private String nombre;

    public Figuras(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    @Override
    public String toString() 
    {
        return "\nnombre "+nombre;
    }                
    
    public abstract double calculaArea();    
}