package VentanasGraficas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaConBoton 
{
    public static void main(String[] args) 
    {      
        JFrame frame = new JFrame("Hackeo");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un botón
        JButton button = new JButton("Haz clic aquí para hakearte");
        
        // Añadir un listener para el botón
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                // Mostrar un mensaje cuando se hace clic en el botón
                JOptionPane.showMessageDialog(frame, "¡Botón clickeado!");
            }
        });
        
        // Añadir el botón a la ventana
        frame.add(button);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}