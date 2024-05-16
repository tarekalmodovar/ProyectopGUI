
package laboratorio.proyectogui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
    
    JFrame frame = new JFrame();
    JButton MyButton = new JButton("423127375");
    
    LaunchPage() {
        MyButton.addActionListener(this); 
              
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        MyButton.setBounds(150, 150, 150, 30);
        frame.add(MyButton);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        NewWindow myWindow = new NewWindow();
    }
}

    

