package Herencias;
public class Perro extends Animal
{    
    //constructor
    public Perro(String nombre) 
    {
        super(nombre);
    }
    //metodo
    public void ladrar() 
    {
        System.out.print("El perro "+getNombre()+" esta ladrando");        
    }       
}