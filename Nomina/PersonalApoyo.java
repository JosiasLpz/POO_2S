package Nomina;
public class PersonalApoyo extends Trabajador
{        
    private double numHr,precioHr;
    private int diaLaborado;

    public PersonalApoyo(double numHr, double precioHr,int diaLaborado, String nombre, String puesto, String espacialidad) 
    {
        super(nombre, puesto, espacialidad);
        this.numHr = numHr;
        this.precioHr = precioHr;
        this.diaLaborado=diaLaborado;
    }    
    
    public double calculaTotal() 
    {
        return numHr*precioHr*diaLaborado;
    }

    public double getNumHr() 
    {
        return numHr;
    }
    public void setNumHr(double numHr) 
    {
        this.numHr = numHr;
    }

    public double getPrecioHr() 
    {
        return precioHr;
    }
    public void setPrecioHr(double precioHr) 
    {
        this.precioHr = precioHr;
    }           

    public int getDiaLaborado() 
    {
        return diaLaborado;
    }
    public void setDiaLaborado(int diaLaborado) 
    {
        this.diaLaborado = diaLaborado;
    }    

    @Override
    public String toString() 
    {
        return super.toString()
                +"\nnumero de horas "+numHr
                +"\nprecio hora "+precioHr
                +"\ndias laborados "+diaLaborado;        
    }    
}