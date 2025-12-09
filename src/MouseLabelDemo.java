import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseLabelDemo extends JFrame implements MouseListener {
    private JLabel hoverLabel;
    public MouseLabelDemo(){
        super("Hover Label Demo");
        hoverLabel = new JLabel("Hover over mel", SwingConstants.CENTER);
        hoverLabel.setOpaque(true);
        hoverLabel.setBackground(Color.WHITE);
        hoverLabel.setFont(new Font("Serif", Font.BOLD, 18));
        hoverLabel.addMouseListener(this);

        add(hoverLabel, BorderLayout.CENTER);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void mouseEntered(MouseEvent e){
        hoverLabel.setBackground(Color.YELLOW);
    }
    public void mouseExited(MouseEvent e){
        hoverLabel.setBackground(Color.WHITE);
    }
    @Override public void mouseClicked(MouseEvent e){}
    @Override public void mousePressed(MouseEvent e){}
    @Override public void mouseReleased(MouseEvent e){}

    public static void main(String[] args){
        new MouseLabelDemo();
    }
}
