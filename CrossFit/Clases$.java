package CrossFit;
public class Clases$ extends CostosDeClases
{   
    public Clases$(int dia,int semana,int quincena,int mensualidad)
    {
        super(dia, semana, quincena, mensualidad);              
    }
   
    public void costosClases()
    {
        System.out.println("\ndia $"+getDia()+"\nsemana $"+getSemana()+"\nquincena $"+getQuincena()+"\nmensualidad $"+getMensualidad()+"\n");        
    }
}