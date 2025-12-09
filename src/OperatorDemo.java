import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class OperatorDemo extends JFrame implements ActionListener {
    private JButton addBtn, minBtn, mulBtn, divBtn;
    public OperatorDemo(){
        super("Operator Demo");

        addBtn = new JButton("+");
        minBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");

        addBtn.addActionListener(this);
        minBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        JPanel buttonPanrl = new JPanel(new FlowLayout());
        buttonPanrl.add(addBtn);
        buttonPanrl.add(minBtn);
        buttonPanrl.add(mulBtn);
        buttonPanrl.add(divBtn);

        add(buttonPanrl);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String ope = e.getActionCommand();
        System.out.println("Clicked" + ope);
    }
    public static void main(String[] args){
        new OperatorDemo();
    }
}
