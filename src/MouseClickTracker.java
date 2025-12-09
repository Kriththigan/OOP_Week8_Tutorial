import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseClickTracker extends JFrame implements MouseListener{
    private JPanel mousePanel;
    private JLabel statusLabel;
    public MouseClickTracker(){
        super("Mouse Click Tracker");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.white);
        mousePanel.addMouseListener(this);

        statusLabel = new JLabel("Click anywhere inside the panel", SwingConstants.CENTER);
        setLayout(new BorderLayout());
        add(mousePanel, BorderLayout.CENTER);
        add(statusLabel,BorderLayout.SOUTH);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        statusLabel.setText("Clicked at: (" + x + ", " + y + ")");
    }
    @Override public void mousePressed(MouseEvent e){}
    @Override public void mouseReleased(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}

    public static void main(String[] args){
        new MouseClickTracker();
    }
}
