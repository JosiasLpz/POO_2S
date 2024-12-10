package CrossFit;
public class CostosDeClases
{
    private int dia;
    private int semana;
    private int quincena;
    private int mensualidad;

    public CostosDeClases(int dia, int semana, int quincena, int mensualidad) 
    {
        this.dia = dia;
        this.semana = semana;
        this.quincena = quincena;
        this.mensualidad = mensualidad;
    }
  
    public int getDia()
    {
        return dia;
    }
    public void setDia(int dia)
    {
        this.dia = dia;
    }
      
    public int getSemana()
    {
        return semana;
    }
    public void setSemana(int semana)
    {
        this.semana = semana;
    }            
    
    public int getQuincena()
    {
        return quincena;
    }        
    public void setQuincena(int quincena)
    {
        this.quincena = quincena;
    }
        
    public int getMensualidad()
    {
        return mensualidad;
    }    
    public void setMensualidad(int mensualidad)
    {
        this.mensualidad = mensualidad;
    }   

    @Override
    public String toString() 
    {
        return  "\ndia "+dia 
                +"\nsemana "+semana 
                +"\nquincena "+quincena 
                +"\nmensualidad"+mensualidad;
    }    
}