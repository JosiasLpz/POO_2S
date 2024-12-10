package CrossFit;
public class Coach extends HeadCoach
{   
     public Coach(String nombre,String categoria,String sexo, int edad)
    {       
        super(nombre,categoria,edad);                       
        this.sexo=sexo;
    }      
     
     private String sexo;

    public String getSexo()
    {
        return sexo;
    }
    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }

    @Override
    public String toString()
    {
        return  super.toString()
                + "\nsexo " + sexo ;
    }                
}