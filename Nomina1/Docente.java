package Nomina1;
public class Docente extends Trabajador
{
    private int numHr,precioHr,diaLaborado;   
    private double iva,isr;
   
    public Docente(String nombre, String puesto, String espacialidad,int numHr, int precioHr,int diaLaborado)
    {
        super(nombre, puesto, espacialidad);
        this.numHr = numHr;
        this.precioHr = precioHr;
        this.iva = 0.16;
        this.isr = 0.0108;
        this.diaLaborado = diaLaborado;
   }
    
    public double calculaTotal() 
    {
        return numHr*precioHr*diaLaborado;
    }
    public double calculaIva() 
    {
        return calculaTotal()*iva;
    }
    public double calculaIsr() 
    {
        return calculaTotal()*isr;
    }
    public double calculaNeto() 
    {
        return calculaTotal()+calculaIva()-calculaIsr();
    }          
    
    public int getNumHr() 
    {
        return numHr;
    }
    public void setNumHr(int numHr) 
    {
        this.numHr = numHr;
    }

    public int getPrecioHr() 
    {
        return precioHr;
    }
    public void setPrecioHr(int precioHr) 
    {
        this.precioHr = precioHr;
    }

    public double getIva() 
    {
        return iva;
    }
    public void setIva(double iva) 
    {
        this.iva = iva;
    }

    public double getIsr() 
    {
        return isr;
    }
    public void setIsr(double isr) 
    {
        this.isr = isr;
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
                +"\nHoras trabajadas "+numHr
                +"\nPrecio por hora "+precioHr 
                +"\nDia laborado "+diaLaborado
                +"\niva "+iva
                +"\nisr "+isr;
    }           
}