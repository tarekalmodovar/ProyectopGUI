package laboratorio.proyectogui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel("Almodovar Tufino Tarek  423127375");
    JLabel label2 = new JLabel("23/04/2004 Col Tlalcoligia, Tlalpan, CDMX CP 14430");
    
   
    
    
    
    NewWindow(){
        label1.setBounds(100, 100, 400, 10);
        frame.add(label1);
        label2.setBounds(100, 100, 400, 60);
        frame.add(label2);
        
     
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        
        frame.setVisible(true);
    
    }
    
    
}
