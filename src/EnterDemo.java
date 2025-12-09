import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EnterDemo extends JFrame {
    private JLabel greetingLabel;
    private JTextField nameField;
    public EnterDemo(){
        super("Name Greeting App");
        JLabel namePrompt = new JLabel("Enter Name");
        greetingLabel = new JLabel(" ", SwingConstants.CENTER);
        nameField = new JTextField(15);

        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                greetingLabel.setText("Hello" + name);
            }
        });
        setLayout(new FlowLayout());
        add(greetingLabel);
        add(nameField);
        add(namePrompt);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new EnterDemo();
    }
}
