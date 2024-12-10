package CrossFit;
public class AguasJugos$ extends CostosAguasJugos
{
     public AguasJugos$(int aguas,int jugos)
    {
        super(aguas,jugos);              
    }
   
    public void aguasJugos$()
    {
        System.out.println("\naguas $"+getAguas()+"\njugos $"+getJugos()+"\n");        
    }
}