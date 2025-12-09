import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ClickDemo extends JFrame{
    private JLabel displayLabel;
    private JButton clickButton;
    public ClickDemo(){
        super("Button Click Example");
        displayLabel = new JLabel("No Clicks yet", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("Button Clicked");
            }
        });
        setLayout(new BorderLayout());
        add(displayLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new ClickDemo();
    }
}