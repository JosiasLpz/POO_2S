package Aeropuerto;
public abstract class Aeropuerto 
{     
    private static int idCounter=0;
    private int id; 
    private String Nombre;
    private int AñoDeInauguración;
    private int CapacidadTerminales;
   
    public Aeropuerto(String Nombre,int AñoDeInauguración,int CapacidadTerminales) 
    {
        this.id = ++idCounter;
        this.Nombre = Nombre;
        this.AñoDeInauguración = AñoDeInauguración;
        this.CapacidadTerminales = CapacidadTerminales;
    }

    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return Nombre;
    }
    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public int getAñoDeInauguración() 
    {
        return AñoDeInauguración;
    }
    public void setAñoDeInauguración(int AñoDeInauguración) 
    {
        this.AñoDeInauguración = AñoDeInauguración;
    }

    public int getCapacidadTerminales() 
    {
        return CapacidadTerminales;
    }
    public void setCapacidadTerminales(int CapacidadTerminales) 
    {
        this.CapacidadTerminales = CapacidadTerminales;
    }

    public static int getIdCounter() 
    {
        return idCounter;
    }
    public static void setIdCounter(int idCounter) 
    {
        Aeropuerto.idCounter = idCounter;
    }        

    @Override
    public String toString() 
    {
        return  "\nid "+getId()
                +"\nNombre "+getNombre()
                +"\nAño De Inauguracion "+getAñoDeInauguración() 
                +"\nCapacidad Terminales "+getCapacidadTerminales();
    }
    public abstract void gananciasTotales(int cantidad);                  
}