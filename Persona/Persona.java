package Persona;
public class Persona{
    private String nombre;
    private String apellido;
    
    public String getNombre()
    {
        return nombre;    
    }
    
     public String getApellido()
     {
        return apellido;    
    }
    
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
     
    public void setApellido(String apellido)
    {
        this.apellido= apellido;
    }    

    @Override
    public String toString() 
    {
        return "\nnombre "+nombre 
               +"\napellido "+apellido;
    }        
}