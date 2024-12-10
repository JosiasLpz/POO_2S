package Herencias;
public class Animal
{
    //variable
    private String nombre;

    //constructor
    public Animal(String nombre) 
    {
        this.nombre = nombre;
    }
    
    //metodo
    public void comer()
    {
        System.out.println("El animal esta comiendo ");        
    }    

    //get
    public String getNombre() 
    {
        return nombre;
    }
    //set
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }        
}