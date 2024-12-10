import java.util.Scanner;
  public class MatrizDatosPersonales{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        String[] nombres = new String[5];
        int[] edades = new int[5];
        char[] sexos = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos para el alumno " + (i + 1));

            System.out.print("Nombre: ");
            nombres[i] = leer.nextLine();

            System.out.print("Edad: ");
            edades[i] = leer.nextInt();
            leer.nextLine();  

            System.out.print("Sexo (M/F): ");
            sexos[i] = leer.nextLine().charAt(0);
        }
        System.out.println("\nInformación de los alumnos:");
        for (int i = 0; i < 5; i++) {
            int añoNacimiento = 2023 - edades[i];

            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println("Sexo: " + sexos[i]);
            System.out.println("Año de nacimiento: " + añoNacimiento);
            System.out.println();
        }
        leer.close(); 
    }
  } 