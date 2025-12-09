import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class RandomControlPanel extends JFrame {
    private JPanel colorPanel;
    private Random rand;
    public RandomControlPanel(){
        super("Random Color Panel");
        rand = new Random();

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.white);
        colorPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int r = rand.nextInt(256);
                int g = rand.nextInt(256);
                int b = rand.nextInt(256);

                Color randomColor = new Color(r, g, b);
                colorPanel.setBackground(randomColor);
            }
        });
        add(colorPanel);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new RandomControlPanel();
    }
}
