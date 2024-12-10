package Empresa;
public class Operario extends Empleado 
{
    private int nivelSeguridad;

    public Operario(String nombre,int edad,int mesIngreso,int salarioAnual,int nivelSeguridad) 
    {
        super(nombre,edad,mesIngreso,salarioAnual);
        this.nivelSeguridad = nivelSeguridad;
    }

    public int getNivelSeguridad(){return nivelSeguridad;}
    public void setNivelSeguridad(int nivelSeguridad){this.nivelSeguridad = nivelSeguridad;}        

    @Override
    public double incentivar()
    {
        if(getMesIngreso()>30&&getNivelSeguridad()>20)
        {
            this.setSalarioAnual(getSalarioAnual()*2*getBono());
        }
        else if(getMesIngreso()>360||getNivelSeguridad()>2)
        {
            this.setSalarioAnual(getSalarioAnual()*getBono());
        }
        else if(getMesIngreso()<360 && getNivelSeguridad()<2)
        {
            this.setSalarioAnual(getSalarioAnual());
        }
        return getSalarioAnual();
    }
         
     public int actualiarNivel()
        {            
                if(getMesIngreso()>24 && this.getNivelSeguridad()<5)
                {
                    this.setNivelSeguridad(this.getNivelSeguridad()+1);
                }                           
            return getNivelSeguridad();                
        }                   

    @Override
    public String toString() 
    {
        return super.toString(); 
    }               
}