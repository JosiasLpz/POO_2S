package DescuentoProductos;
public class Productos
{
    private String nombre;
    private int codigo;    
    private double precio;    

    public Productos(String nombre,int codigo,double precio)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;        
    }     
    
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getCodigo() 
    {
        return codigo;
    }
    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public double getPrecio() 
    {
        return precio;
    }
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }     

    @Override
    public String toString() 
    {
        return  "\nnombre "+nombre 
                +"\ncodigo "+codigo 
                +"\nprecio "+precio ;                
    }        
}