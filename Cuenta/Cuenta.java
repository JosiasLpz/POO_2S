package Cuenta;
import java.util.Scanner;
public class Cuenta
{
    Scanner lector = new Scanner(System.in);
    
    private String titular;
    private int cantidad;
    
    public Cuenta(String titular, int cantidad)
    {
        this.titular=titular;
        this.cantidad=cantidad;
    }
    
    public String getTitular()
    {        
        return titular;
    } 
    public void setTitular(String titular)
    {
        this.titular = titular;
    }
    
    public int getCantidad()
    {        
        return cantidad;
    } 
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public void depositar()
    {
        int deposito =0;
        System.out.println("Ingrese su deposito");deposito=lector.nextInt();
        if(deposito>0) cantidad+=deposito;   
    }
    
    public void retirar()
    {
        int retiro;
        System.out.println("Ingrese la cantidad que desea retirar ");retiro=lector.nextInt();
        
        if(retiro>cantidad)
        {
            cantidad=0;
        }
        else
        {    
            cantidad -=retiro;
        }       
    }
   
    @Override
    public String toString()
    {
        return  "Titular "+titular
                +"\n Cantidad "+cantidad;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}