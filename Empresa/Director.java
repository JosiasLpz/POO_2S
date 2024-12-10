package Empresa;
public class Director extends Empleado
{
    private String departamento;
    private int personal;

    public Director(String nombre,int edad,int mesIngreso,double salarioAnual,String departamento,int personal) 
    {
        super(nombre,edad,  mesIngreso,salarioAnual);
        this.departamento = departamento;
        this.personal = personal;
    }

    public String getDepartamento(){return departamento;}
    public void setDepartamento(String departamento){this.departamento = departamento;}

    public int getPersonal(){return personal;}
    public void setPersonal(int personal){this.personal = personal;}                 
    
    @Override
    public double incentivar() 
    {
        if(getMesIngreso()>30 && getPersonal()>20)
                {
                    this.setSalarioAnual(getSalarioAnual()*2*getBono());
                }
        else if(getMesIngreso()>30||getPersonal()>20)
        {
            this.setSalarioAnual(getSalarioAnual()*getBono());
        }
        else if(getMesIngreso()<30 && getPersonal()<20); 
        {
            this.setSalarioAnual(getSalarioAnual());
        }        
        return getSalarioAnual();                     
    }
 
    @Override
    public String toString() 
    {
        return super.toString();
    }    
}