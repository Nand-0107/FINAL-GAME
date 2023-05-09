import javax.swing.*;
import java.awt.*;

public class Panel {
    private Wheel wh = new Wheel();


    protected void paintComponent(Graphics g){
        wh.paint(g);
    }

    public void add(JLayeredPane whe) {
    }
}
