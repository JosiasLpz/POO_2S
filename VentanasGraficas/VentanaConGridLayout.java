package VentanasGraficas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
public class VentanaConGridLayout 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Ventana con GridLayout");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un panel con GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 2));
        
        // Añadir botones al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));
        panel.add(new JButton("Botón 4"));
        
        // Añadir el panel a la ventana
        frame.add(panel);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}