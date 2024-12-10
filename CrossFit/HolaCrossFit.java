package CrossFit;
import javax.swing.JOptionPane;
public class HolaCrossFit 
{             
    private int peso;

    public HolaCrossFit(int peso)
    {
        this.peso = peso;
    }
    
    public int getPeso() 
    {
        return peso;
    }
    public void setPeso(int peso) 
    {
        this.peso = peso;
    }             

    @Override
    public String toString() 
    {
        return "\npeso "+peso;
    }   
         
    public static void main(String[] args) 
    {                        
        int peso;        
        HolaCrossFit a = new HolaCrossFit(74);
        JOptionPane.showMessageDialog(null,"hola crossfit"); // sin scanner      
        peso = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos kilos levantas en halterofilia?")); //con scanner // integer (conversion de String a int)       
        JOptionPane.showMessageDialog(null,"Levantas: " +peso+ " kg en halterofilia"); // sin scanner // concatenado                  
        JOptionPane.showMessageDialog(null,"guillo recachi");
      //  System.out.print(""+a.toString());
        
    }    
}