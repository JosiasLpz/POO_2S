package Empresa;
public abstract class Empleado 
{
    private String nombre;
    private int edad;
    private int mesIngreso;
    private double salarioAnual;
    private final double bono =600.0;    

    public Empleado(String nombre,int edad,int mesIngreso,double salarioAnual) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.mesIngreso = mesIngreso;
        this.salarioAnual = salarioAnual;
    }   

    public String getNombre(){return nombre;}    
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    public int getMesIngreso(){return mesIngreso;}    
    public void setMesIngreso(int fechaIngreso){this.mesIngreso = fechaIngreso;}

    public double getSalarioAnual(){return salarioAnual;}
    public void setSalarioAnual(double salarioAnual){this.salarioAnual = salarioAnual;}

    public double getBono(){return bono;}       

    @Override
    public String toString() 
    {
        return "\nnombre "+getNombre()
               +"\nedad "+getEdad()
               +"\nmes ingreso "+getMesIngreso()
               +"\nsalario anual "+getSalarioAnual();
    }       
    public abstract double incentivar();        
}