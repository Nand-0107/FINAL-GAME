import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(2500, 1600);



        JLayeredPane tab = new JLayeredPane();
        tab.setSize(1440,900);

        myFrame.add(tab);

        ImageIcon icon = new ImageIcon("table.png");
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        JLabel table = new JLabel(icon);
        JLayeredPane.add(table,Integer.valueOf(0));


        ImageIcon stuff = new ImageIcon("2C.png");
        stuff.setImage(stuff.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));

        JLabel card = new JLabel(stuff);

        System.out.println("I am on REplit)");







        // myFrame.add(myPanel);
        myFrame.add(tab);
        myFrame.setVisible(true);


    }
}