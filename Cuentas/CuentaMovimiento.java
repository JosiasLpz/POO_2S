package Cuentas;
import java.util.HashSet;
public class CuentaMovimiento extends CuentaLimite
{
    private final HashSet<Movimientos>movs;

    public CuentaMovimiento(HashSet<Movimientos> movs,double limite)
    {
        super(limite);
        this.movs = movs;
    }

    @Override
    public void ingresar(double cantidad)
    {
    movs.add(new Movimientos(cantidad,"Ingresar"));
    super.ingresar(cantidad);
    }
    
    @Override
    public void extraer(double cantidad)
    {
    movs.add(new Movimientos(cantidad,"Extracción"));
    super.extraer(cantidad);
    }
    
    public HashSet<Movimientos>getMovimientos()
    {
     return movs;
    }
}