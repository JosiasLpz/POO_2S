package Aeropuerto;
public class AeropuertoPrivado extends Aeropuerto 
{
    private int numeroSocios;

    public AeropuertoPrivado(String Nombre,int añoInauguracion,int capacidad,int numeroSocios) 
    {
        super(Nombre, añoInauguracion, capacidad);
        this.numeroSocios = numeroSocios;
    }

    public int getNumeroSocios() 
    {
        return numeroSocios;
    }
    public void setNumeroSocios(int numeroSocios) 
    {
        this.numeroSocios = numeroSocios;
    }

    @Override
    public void gananciasTotales(int cantidad) 
    {
        int ganancias=cantidad/numeroSocios;
        System.out.println("Ganancias Totales "+ganancias);
    }

    @Override
    public String toString()
    {
        return super.toString() 
                +"\nnumero Socios "+numeroSocios;
    }
}