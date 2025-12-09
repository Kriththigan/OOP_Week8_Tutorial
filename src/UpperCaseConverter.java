import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UpperCaseConverter extends JFrame {
    private JTextField inputField;
    private JButton convertButton;
    private JLabel outputLabel;
    public UpperCaseConverter(){
        super("Upper Case Converter");
        inputField = new JTextField(15);
        convertButton = new JButton("UpperCase");
        outputLabel = new JLabel(" ", SwingConstants.CENTER);

        convertButton.addActionListener(new ButtonHandler());

        setLayout(new FlowLayout());
        add(new JLabel("Enter Text:"));
        add(inputField);
        add(convertButton);
        add(outputLabel);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String text = inputField.getText();
            outputLabel.setText(text.toUpperCase());
        }
    }
    public static void main(String[] args){
        new UpperCaseConverter();
    }
}
