package VentanasGraficas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
public class VentanaConLayout
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("My Drungs");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un panel
        JPanel panel = new JPanel(new BorderLayout());
        
        // Crear componentes
        JLabel label = new JLabel("datos del pedido");
        JTextField textField = new JTextField();
        JButton button = new JButton("Enviar");
        
        // Añadir componentes al panel
        panel.add(label, BorderLayout.WEST);
        panel.add(textField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.EAST);
        
        // Añadir el panel a la ventana
        frame.add(panel);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}