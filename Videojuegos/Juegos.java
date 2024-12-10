package Videojuegos;
import java.util.Scanner;
public class Juegos
{
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args)
    {
        Usuario[] usuarios = registrarUsuarios();        
        Usuario usuarioActual = iniciarSesion(usuarios); 

        if (usuarioActual != null)
        {
            mostrarMenuJuegos();
            
            int opcion = leer.nextInt();
            switch(opcion)
            {
                case 1:jugarLanzaMoneda(usuarioActual);break;
                case 2:jugarAdivinaNumero(usuarioActual);break;
                default:System.out.println("Opcion no válida");
            }
        }
    }
    static Usuario[] registrarUsuarios()
    {
        System.out.println("Registro de usuarios");
        Usuario[] usuarios = new Usuario[1]; 

        for (int i = 0; i < usuarios.length; i++)
        {
            System.out.println("Ingrese los datos del usuario " + (i + 1));
            System.out.println("nombre "); String nombre = leer.next();
            System.out.println("usuario "); String usuario = leer.next();
            System.out.println("contraseña ");String contrasena = leer.next();
            System.out.println("edad ");int edad = leer.nextInt();            

            usuarios[i] = new Usuario(nombre, usuario, contrasena, edad);
        }

        return usuarios;
    }

    static Usuario iniciarSesion(Usuario[] usuarios)
    {
        System.out.println("Inicio de sesion");
        System.out.println("Ingrese su usuario:");
        String usuario = leer.next();
        System.out.println("Ingrese su contraseña:");
        String contrasena = leer.next();

        for (Usuario u : usuarios)
        {
            if (u.validarCredenciales(usuario, contrasena))
            {
                System.out.println("Inicio de sesion exitoso.  Hola, " + u.getNombre() + "!");
                return u;
            }
        }

        System.out.println("Credenciales incorrectas. Saliendo del programa.");
        return null;
    }
    
    static void mostrarMenuJuegos()
    {
        System.out.println("Menu de Juegos");
        System.out.println("1. Lanza la moneda");
        System.out.println("2. Adivina el numero");
        System.out.println("Ingrese el numero del juego que desea jugar:");
    }

    static void jugarLanzaMoneda(Usuario usuario)
    {
        System.out.println("Juego: Lanza la moneda");
        int aciertos = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Intento " + (i + 1) + ": ¿Aguila (1) o Cruz (2)?");
            int eleccionUsuario = leer.nextInt();
            int resultado = (int)(Math.random() * 2) + 1;             

            if(eleccionUsuario == resultado)
            {
                System.out.println("¡Correcto! Has acertado.");
                aciertos++;
            }
            else
            {
                System.out.println("Incorrecto. El resultado fue " + (resultado == 1 ? "Águila" : "Cruz"));
            }
        }

        System.out.println("Juego completado. Aciertos: " + aciertos);

        if(aciertos >= 3)
        {
            System.out.println("¡Felicidades! Has ganado $50.");
        }
        else if(aciertos == 0 || aciertos == 1 || aciertos == 2)
        {
            System.out.println("Lo siento, no has ganado nada.");
        }
        else
        {
            System.out.println("¡Felicidades! Has ganado $100.");
        }
    }

    static void jugarAdivinaNumero(Usuario usuario)
    {
        System.out.println("Juego: Adivina el numero");
        int numeroAleatorio = (int)(Math.random() * 10) + 1; 

        System.out.println("Intenta adivinar el numero (del 1 al 10):");
        int intentoUsuario = leer.nextInt();

        if (intentoUsuario == numeroAleatorio)
        {
            System.out.println("¡Felicidades! Has adivinado el número y ganado $100.");
        }
        else
        {
            System.out.println("Lo siento, el numero era " + numeroAleatorio + ". No has ganado nada.");
        }
    }
}

class Usuario
{
    private final String nombre;
    private final String usuario;
    private final String contrasena;
    private final int edad;

    public Usuario(String nombre, String usuario, String contrasena, int edad)
    {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public boolean validarCredenciales(String usuario, String contrasena)
    {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }
}