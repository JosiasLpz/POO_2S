package Cuentas;
public class CuentaLimite extends Cuenta
{
    private double limite;

    public CuentaLimite(double limite) 
    {       
        this.limite = limite;
    }
        
    public double getLimite(){return limite;}
    public void setLimite(double limite){this.limite = limite;}           

    public void ajustarLimite() 
    {
        limite=getSaldo()/2;
    }   
        
    @Override
    public void extraer(double cantidad) 
    {
        if(cantidad<=limite) 
        {
            super.extraer(cantidad);
        }
        else 
        {
            super.extraer(limite);
        }        
    }   
}