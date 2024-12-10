package CrossFit;
public class CostoGalletasBarritas 
{
    private int galletaChocolate;
    private int galletaAvena;
    private int galletaChocolateBlanco;
    private int barritaNuez;
    private int barritaPasas;

    public CostoGalletasBarritas(int galletaChocolate,int galletaAvena,int galletaChocolateBlanco,int barritaNuez,int barritaPasas) 
    {
        this.galletaChocolate = galletaChocolate;
        this.galletaAvena = galletaAvena;
        this.galletaChocolateBlanco = galletaChocolateBlanco;
        this.barritaNuez = barritaNuez;
        this.barritaPasas = barritaPasas;
    }

    public void costoGalletaBarrita() 
    {
        System.out.print("\ncostos de barritas y galletas ");        
    }
    
    public int getGalletaChocolate()
    {
        return galletaChocolate;
    }
    public void setGalletaChocolate(int galletaChocolate) 
    {
        this.galletaChocolate = galletaChocolate;
    }

    public int getGalletaAvena() 
    {
        return galletaAvena;
    }
    public void setGalletaAvena(int galletaAvena) 
    {
        this.galletaAvena = galletaAvena;
    }

    public int getGalletaChocolateBlanco() 
    {
        return galletaChocolateBlanco;
    }
    public void setGalletaChocolateBlanco(int galletaChocolateBlanco) 
    {
        this.galletaChocolateBlanco = galletaChocolateBlanco;
    }

    public int getBarritaNuez() 
    {
        return barritaNuez;
    }
    public void setBarritaNuez(int barritaNuez) 
    {
        this.barritaNuez = barritaNuez;
    }

    public int getBarritaPasas() 
    {
        return barritaPasas;
    }
    public void setBarritaPasas(int barritaPasas) 
    {
        this.barritaPasas = barritaPasas;
    }        
}