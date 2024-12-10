package Animales;
import Cuenta.Cuenta;
import Libro.Libro;
public class Main
{
    public static void main(String[] args)
    {
        Animales.Mamiferos.Gato gato1 = new Animales.Mamiferos.Gato();   
        System.out.print("el gato de josias");
        gato1.setRaza("siames");
        gato1.setNombre("cash cash");
        gato1.setColor("naranjoso");
        gato1.setEdad(1);                        
        System.out.print(gato1.toString()); 
        System.out.print("\n");
        
        Animales.Mamiferos.Perro perro1 = new Animales.Mamiferos.Perro();
        System.out.print("\nel perro de mi tia");   
        perro1.setRaza("pitbull");
        perro1.setNombre("goku");
        perro1.setColor("blaco con negro y gris");
        perro1.setEdad(2);                        
        System.out.print(perro1.toString());        
        System.out.print("\n");
        
        Animales.Mamiferos.Perro perro2 = new Animales.Mamiferos.Perro();
        System.out.print("\nel perro de yuri");        
        perro2.setRaza("pastor aleman");
        perro2.setNombre("tobi");
        perro2.setColor("blaco con cafe");
        perro2.setEdad(1);                        
        System.out.print(perro2.toString());   
        System.out.print("\n");
        
        Animales.Aves.Gallo gallo1 = new Animales.Aves.Gallo();
        System.out.print("\nel gallo de josias");
        gallo1.setRaza("cresta rosa");
        gallo1.setNombre("juan");
        gallo1.setColor("blaco, negro, ");
        gallo1.setEdad(1);                        
        System.out.print(gallo1.toString());       
        
        System.out.print("\n");
        
        Libro a = new Libro("josias","CroosFit",100,7777);
        System.out.println(a.toString());
    }   
}