import javax.swing.*;
import java.awt.*;

public class Wheel extends Graphics2D {

    ImageIcon ico = new ImageIcon("wheel.png");

    public void paint(Graphics g){
        Graphics2D whee = (Graphics2D) g;
        whee.drawImage(ico,0,0,null);
    }

    public void setBounds(){

    }
}
