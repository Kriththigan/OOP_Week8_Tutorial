import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    JButton button;
    JLabel label;
    public SimpleGUI(){
        button = new JButton("Click here");
        label = new JLabel("Default text");
        add(button, BorderLayout.CENTER);
        add(label, BorderLayout.NORTH);

        SimpleEventListner myListner = new SimpleEventListner();
        button.addActionListener(myListner);
    }
    public class SimpleEventListner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setText("Welcome to Java Class");
        }
    }
    public static void main(String[] args){
        SimpleGUI myFrame = new SimpleGUI();
        myFrame.setVisible(true);
        myFrame.setSize(200, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}