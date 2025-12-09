import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorChange extends JFrame implements ActionListener {
    private JLabel colorLabel;
    private JButton redBtn, greenBtn, blueBtn;
    public ColorChange(){
        super("Color Changer");
        colorLabel = new JLabel("Color Label", SwingConstants.CENTER);
        colorLabel.setOpaque(true);
        colorLabel.setBackground(Color.LIGHT_GRAY);
        colorLabel.setFont(new Font("Serif", Font.BOLD, 18));

        redBtn = new JButton("Red");
        blueBtn = new JButton("Blue");
        greenBtn = new JButton("Green");

        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        greenBtn.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(redBtn);
        buttonPanel.add(blueBtn);
        buttonPanel.add(greenBtn);

        setLayout(new BorderLayout());
        add(colorLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();

        if(cmd.equals("Red"))
            colorLabel.setBackground(Color.RED);
        else if(cmd.equals("Blue"))
            colorLabel.setBackground(Color.BLUE);
        else if(cmd.equals("Green"))
            colorLabel.setBackground(Color.GREEN);
    }
    public static void main(String[] args){
        new ColorChange();
    }
}
