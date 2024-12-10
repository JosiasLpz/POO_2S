package Vectores;
import java.util.Scanner;
public class Bidimensional2
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);

        double[][] calificaciones = new double[3][4];

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Ingrese las calificaciones para el alumno " + (i + 1));

            for (int j = 0; j < 4; j++) 
            {
                System.out.print("Calificacion en " + obtenerMateria(j) + ": ");
                calificaciones[i][j] = leer.nextDouble();
            }
        }
        
        double[] promediosMaterias = new double[4];
        double promedioGeneral = 0;

        for (int j = 0; j < 4; j++)
        {
            double suma = 0;

            for (int i = 0; i < 3; i++)
            {
                suma += calificaciones[i][j];
            }

            promediosMaterias[j] = suma / 3;
            promedioGeneral += promediosMaterias[j];
        }

        promedioGeneral /= 4;
        
        System.out.println("\nCalificaciones de los alumnos y promedios:");

        for (int i = 0; i < 3; i++) 
        {
            System.out.println("\nAlumno " + (i + 1) + ":");
            
            for (int j = 0; j < 4; j++)
            {
                System.out.println(obtenerMateria(j) + ": " + calificaciones[i][j]);
            }
            
            System.out.println("Promedio: " + calcularPromedioAlumno(calificaciones[i]));
        }

        System.out.println("\nPromedios por materia:");

        for (int j = 0; j < 4; j++)
        {
            System.out.println(obtenerMateria(j) + ": " + promediosMaterias[j]);
        }

        System.out.println("\nPromedio General: " + promedioGeneral);

        leer.close();
    }

    private static String obtenerMateria(int indice)
    {
        switch (indice)
        {
            case 0:
                return "Español";
            case 1:
                return "Matematicas";
            case 2:
                return "Ciencias Naturales";
            case 3:
                return "Etica";
            default:
                return "Materia Desconocida";
        }
    }

    private static double calcularPromedioAlumno(double[] calificaciones)
    {
        double suma = 0;

        for (double calificacion : calificaciones)
        {
            suma += calificacion;
        }

        return suma / calificaciones.length;
    }
}