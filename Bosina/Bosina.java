package Bosina;
public class Bosina
{
    
    private String marca;
    private String potencia;
    private String duracionBateria;
    private int modelo;
    private String color;
    boolean encendido;
    
    public void encender()
    {
        if(encendido==true)
        {
        System.out.println("la bosita esta encendida");        
        }
    }
    
    public void apagar()
    {
        System.out.println("la bosina esta apagada");        
    }
    
    public String getMarca()
    {        
        return marca;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String getPotencia()
    {        
        return potencia;
    }
    
    public void setPotencia(String potencia)
    {
        this.potencia = potencia;
    }
    
    public String getDuracionBateria()
    {        
        return duracionBateria;
    }
    
    public void setDuracionBateria(String duracionBateria)
    {
        this.duracionBateria = duracionBateria;
    }
    
    public int getModelo()
    {        
        return modelo;
    }
    
    public void setModelo(int modelo)
    {
        this.modelo = modelo;
    }
    
    public String getColor()
    {        
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
     @Override
    public String toString()
    {
        return"La bosina marca "+marca+" modelo "+modelo+""
                +" color "+color
                +" con duracion de la bateria "+duracionBateria
                +" y potencia de "+potencia;
    }
}