package DescuentoProductos;
//cámaras wifis para interior
public class Cwifi extends Productos
{
    private int cantidadCompra;
    private double megapixeles;   

    public Cwifi(String nombre,int codigo,double precio,double megapixeles,int cantidadCompra) 
    {
        super(nombre, codigo, precio);
        this.megapixeles = megapixeles;
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
    
    public double getMegapixeles() 
    {
        return megapixeles;
    }
    public void setMegapíxeles(double megapíxeles) 
    {
        this.megapixeles = megapíxeles;
    }
    
    public double descuentoCamarasWifi() 
    {
        double precioTotal = super.getPrecio();      
        if(megapixeles == 2) 
        {
            if(cantidadCompra == 1)
                precioTotal = 599.0;
            else if(cantidadCompra == 2)
                precioTotal = 999.0;
        }
        
        else if(megapixeles == 3) 
        {
            if(cantidadCompra == 1)
                precioTotal = 999.0;
            else if(cantidadCompra == 2)
                precioTotal = 1590.0;
        }
        
        else if(megapixeles == 4) 
        {
            if(cantidadCompra == 1)
                precioTotal = 1390.0;
            else if(cantidadCompra == 2)
                precioTotal = 2290.0;
        }
        
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
                +"\nmegapixeles "+megapixeles 
                +"\ncantidadCompra "+cantidadCompra;
    }        
}