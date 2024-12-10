package DescuentoProductos;
public class Pantalla extends Productos
{
    private double pulgadas;

    public Pantalla(String nombre,int codigo,int precio,double pulgadas) 
    {
        super(nombre, codigo, precio);
        this.pulgadas = pulgadas;
    }
     
    public double getPulgadas()
    {
        return pulgadas;
    }
    public void setPulgadas(double pulgadas) 
    {
        this.pulgadas = pulgadas;
    }

    public double descuentoPantalla() 
    {
        double precioTotal = super.getPrecio();
       
        if(pulgadas == 14.0) 
        {
                precioTotal = 2199.0; 
        }
        else if(pulgadas == 15.6) 
        {
            precioTotal = 2499.0; 
        }
        else if(pulgadas == 18.5) 
        {
            precioTotal = 2899.0; 
        }
        return precioTotal;
    }
    
    @Override
    public String toString() 
    {
        return super.toString()
                +"\npulgadas "+pulgadas;
    }  
}