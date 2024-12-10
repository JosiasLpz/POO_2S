package Animales.Mamiferos;
public class Gato
{
    private String raza;
    private String nombre;
    private String color;
    private int edad;
    
    public void maullar()
    {
        System.out.println(" \nel gato esta maullando ");
    }
    
    public void comer()
    {
        System.out.println("el gato esta comiendo");
    }
    
    public void dormir()
    {
        System.out.println("el gato esta durmiendo");
    }

    public String getRaza()
    {
        return raza;
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }
            
    public String getNombre()
    {        
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getColor()
    {        
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public int getEdad()
    {        
        return edad;
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    @Override
    public String toString()
    {
        return                
            "\nraza " + raza
            +"\nnombre " + nombre 
            + "\ncolor " + color 
            + "\nedad " + edad;
    }    
}