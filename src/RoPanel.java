import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import javax.swing.*;
public class RoPanel extends JPanel{
Poly[] triangle = new Poly[34];
public RoPanel(){
    for( int i = 0; i < 34; i++){
        triangle[i] = new Poly(false, i+1,getWidth()/2,getHeight()/2);


    }
}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);



        for (int i = 0; i < 34;i++){
            triangle[i].drawTrig(g);
        }
    }


}