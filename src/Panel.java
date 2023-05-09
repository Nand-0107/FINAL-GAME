import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Wheel wh = new Wheel();


    protected void paintComponent(Graphics g) {
        wh.paint(g);

        g.drawImage();
    }

    }

