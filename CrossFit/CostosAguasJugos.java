package CrossFit;
public class CostosAguasJugos
{
    private int aguas;
    private int jugos;

    public CostosAguasJugos(int aguas, int jugos) 
    {
        this.aguas = aguas;
        this.jugos = jugos;
    }
    public void CAJ() 
    {
        System.out.print("costos de aguas y jugos");        
    }
        
    public int getAguas()
    {
        return aguas;
    }
     public void setAguas(int aguas)
    {
        this.aguas = aguas;
    }

    public int getJugos()
    {
        return jugos;
    }
    public void setJugos(int jugos)
    {
        this.jugos = jugos;
    }  
}