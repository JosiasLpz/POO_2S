package Cuentas;
public class Cuenta 
{
    double saldo;

    public double getSaldo(){return saldo;}
    public void setSaldo(double saldo){this.saldo = saldo;}
   
    public void ingresar(double cantidad) 
    {
        saldo+=saldo+cantidad;      
    }
    
    public void extraer(double cantidad)
    {
        saldo-=cantidad;
    }
    
    @Override
    public String toString() 
    {
        return "\nsaldo "+saldo;
    }   
}