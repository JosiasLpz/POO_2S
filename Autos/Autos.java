package Autos;
public class Autos{
    
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private String color;
    private double precio;

    public void arrancar()
    {
        System.out.println("El coche esta arrancando...");
    }

    public void detener()
    {
        System.out.println("El coche se esta deteniendo...");
    }

    public void acelerar()
    {
        System.out.println("El coche esta acelerando...");
    }

    public void frenar()
    {
        System.out.println("El coche esta frenando...");
    }

    public String getMarca()
    {        
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getAñoFabricacion()
    {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion)
    {
        this.añoFabricacion = añoFabricacion;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
}