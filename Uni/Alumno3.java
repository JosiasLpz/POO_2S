package Uni;
/*
 * @Josías.
 */
import java.util.Scanner;
public class Alumno3{
    Scanner in = new Scanner(System.in);
    
    
    void nombre(){
        System.out.print("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.println("Nombre: " + nombre);
    }
    
    void apellidoPateerno(){
        System.out.print("Ingrese su apellido paterno: ");
        String apellidoPaterno = in.nextLine();
        System.out.println("El apellido paterno: " + apellidoPaterno);
    }

    void apellidoMaterno(){
        System.out.print("Ingrese su apellido materno: ");
        String apellidoMaterno = in.nextLine();
        System.out.println("Su apellido materno: " + apellidoMaterno);
    }
      
    void edad(){
        System.out.print("Ingrese su edad: ");
        byte edad = in.nextByte();
        System.out.println("Su edad: " + edad);
    }
       
    void carrera(){
        System.out.print("Ingrese su carrera a cursar: ");
        String carrera = in.nextLine();
        System.out.println("Su carrera: " + carrera);
    }
    
    void correo(){
        System.out.print("Ingrese su correo: ");
        String correo = in.nextLine();
        System.out.println("Su correo: " + correo);
    }
}
