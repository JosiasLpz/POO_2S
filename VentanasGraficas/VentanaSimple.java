package VentanasGraficas;
import javax.swing.JFrame;
public class VentanaSimple 
{
    public static void main(String[] args) 
    {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("My CrossFit");
        
        // Configurar el tamaño de la ventana
        frame.setSize(400, 300);
        
        frame.setLocationRelativeTo(null);
        
        // Configurar la operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}