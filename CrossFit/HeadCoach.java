package CrossFit;
public class HeadCoach
{  
    private String nombre;      
    private String categoria;      
    private int edad;  
    
    public HeadCoach(String nombre, String categoria,int edad) 
    {
        this.nombre = nombre;
        this.categoria=categoria;               
        this.edad=edad;
    }        
 
    public String getNombre()
    {
        return nombre;        
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;    
    }
    
    public String getCategoria()
    {
        return categoria;
    }
    public void setCategoria(String categoria)
    {
        this.categoria=categoria;
    }  
    
    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }            

    @Override
    public String toString() 
    {
        return  "\nnombre "+nombre 
                +"\ncategoria "+categoria 
                +"\nedad "+edad;
    }    
}