package Aeropuerto;
public class AeropuertoPublico extends Aeropuerto
{    
    private int Financiamiento;
    private int numeroDeTrabajadoresDiscapacitados;
    public AeropuertoPublico(String Nombre,int Financiamiento,int numeroDeTrabajadoresDiscapacitados,int AñoDeInauguración,int CapacidadTerminales) 
    {
        super(Nombre,AñoDeInauguración,CapacidadTerminales);
        this.Financiamiento = Financiamiento;
        this.numeroDeTrabajadoresDiscapacitados = numeroDeTrabajadoresDiscapacitados;
    }
    public int getFinanciamiento() 
    {
        return Financiamiento;
    }
    public void setFinanciamiento(int Financiamiento) 
    {
        this.Financiamiento = Financiamiento;
    }
    public int getNumeroDeTrabajadoresDiscapacitados() 
    {
        return numeroDeTrabajadoresDiscapacitados;
    }
    public void setNúmeroDeTrabajadoresDiscapacitados(int númeroDeTrabajadoresDiscapacitados) 
    {
        this.numeroDeTrabajadoresDiscapacitados = númeroDeTrabajadoresDiscapacitados;
    }      
     @Override
    public void gananciasTotales(int cantidad) 
    {
        int ganancias=cantidad +getFinanciamiento()+(getNumeroDeTrabajadoresDiscapacitados()*18000);
        System.out.println("Ganancias Totales "+ganancias);
    }    
    @Override
    public String toString() 
    {
        return super.toString()
                +"\nFinanciamiento "+Financiamiento 
                +"\nnumero De Trabajadores Discapacitados "+numeroDeTrabajadoresDiscapacitados;
    }          
}