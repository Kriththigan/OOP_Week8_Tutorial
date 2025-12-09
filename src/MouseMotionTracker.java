import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseMotionTracker extends JFrame implements MouseMotionListener {
    private JPanel drawPanel;
    public MouseMotionTracker(){
        super("Mouse Motion Tracker");
        drawPanel = new JPanel();
        drawPanel.setBackground(Color.white);
        drawPanel.addMouseMotionListener(this);

        add(drawPanel, BorderLayout.CENTER);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void mouseMoved(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        setTitle("Mouse at (" + x + "," + y + ")");
    }
    @Override
    public void mouseDragged(MouseEvent e){}

    public static void main(String[] args){
        new MouseMotionTracker();
    }
}
