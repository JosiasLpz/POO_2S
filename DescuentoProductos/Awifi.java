package DescuentoProductos;
//apagadores wifi
public class Awifi extends Productos
{
    private int cantidadCompra;

    public Awifi(String nombre,int codigo,int precio,int cantidadCompra) 
    {
        super(nombre, codigo, precio);        
        this.cantidadCompra = cantidadCompra;
    }
   
    public int getCantidadCompra() 
    {
        return cantidadCompra;
    }
    public void setCantidadCompra(int cantidadCompra) 
    {
        this.cantidadCompra = cantidadCompra;
    }
          
    public double descuentoApagadoresWifi() 
    {
        double precioTotal = super.getPrecio()*cantidadCompra;

        if(cantidadCompra >= 2 && cantidadCompra <= 3) 
        {
            precioTotal *= 0.90; 
        } 
        
        else if(cantidadCompra >= 4 && cantidadCompra <= 5) 
        {
            precioTotal *= 0.85; 
        }
        
        else if(cantidadCompra >= 6) 
        {
            precioTotal *= 0.80; 
        }        
        return precioTotal;
    }      
        
    @Override
    public String toString() 
    {
        return super.toString()
                +"\ncantidad Compra "+cantidadCompra;
    }   
}