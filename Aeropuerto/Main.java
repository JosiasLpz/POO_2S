package Aeropuerto;
public class Main 
{
    public static void main(String[] args) 
    {
        AeropuertoPublico aeropuertoPublico = new AeropuertoPublico("aeropuerto tulum", 1990, 2, 1950, 6);
        AeropuertoPrivado aeropuertoPrivado = new AeropuertoPrivado("aeropuerto cancun",2000,4,4);

        mostrarDatosAeropuerto(aeropuertoPublico, 500);
        mostrarDatosAeropuerto(aeropuertoPrivado, 355);
    }

    public static void mostrarDatosAeropuerto(Aeropuerto aeropuerto,int cantidad) 
    {
        System.out.println(aeropuerto.toString());
        aeropuerto.gananciasTotales(cantidad);
    }
}