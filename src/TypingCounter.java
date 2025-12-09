import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TypingCounter extends JFrame {
    private JTextField inputField;
    private JLabel countLabel;
    int count = 0;
    public TypingCounter(){
        super("Typing Counter");
        inputField = new JTextField(15);
        countLabel = new JLabel("Characters typed: 0");

        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                count++;
                countLabel.setText("Characters typed:" + count);
            }
        });
        setLayout(new FlowLayout());
        add(new JLabel("Type Something"));
        add(inputField);
        add(countLabel);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new TypingCounter();
    }
}
