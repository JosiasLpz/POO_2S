package Persona;
public class Main{
    public static void main(String[] args)
    {
        
        Persona jo = new Persona();
        
        jo.setNombre("josias");
        jo.setApellido("pacheco correa");
         
        System.out.println(jo.getNombre()+" "+ jo.getApellido());
        System.out.print("hola "+  jo.toString());
                      
    }   
}