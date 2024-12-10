package Nomina1;
public class Trabajador
{

    String nombre;
    private String puesto, espacialidad;
    private int telefono, semestre;   

    public Trabajador(String nombre, String puesto, String espacialidad)
    {
        this.nombre = nombre;
        this.puesto = puesto;
        this.espacialidad = espacialidad;      
    }

    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getPuesto() 
    {
        return puesto;
    }
    public void setPuesto(String puesto) 
    {
        this.puesto = puesto;
    }

    public String getEspacialidad() 
    {
        return espacialidad;
    }
    public void setEspacialidad(String espacialidad)
    {
        this.espacialidad = espacialidad;
    }

    public int getTelefono()
    {
        return telefono;
    }
    public void setTelefono(int telefono) 
    {
        this.telefono = telefono;
    }

    public int getSemestre() 
    {
        return semestre;
    }
    public void setSemestre(int semestre) 
    {
        this.semestre = semestre;
    }
    @Override
    public String toString()
    {
        return  "\nnombre "+nombre 
                +"\npuesto "+puesto
                +"\nespacialidad "+espacialidad;
    }    
}