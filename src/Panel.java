import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{


    ImageIcon icon = new ImageIcon("tabless.png");

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(icon.getImage(), 0,0,null);
    }

    }

