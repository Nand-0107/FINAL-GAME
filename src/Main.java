import com.sun.jdi.IntegerValue;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {



        JLayeredPane tab = new JLayeredPane();
        tab.setSize(1440,900);

        JLayeredPane whe = new JLayeredPane();
        whe.setSize(1440,900);

        JFrame myFrame = new JFrame();

        ImageIcon icon = new ImageIcon("tabless.png");
        icon.setImage(icon.getImage().getScaledInstance(1440,900,Image.SCALE_DEFAULT));
        JLabel table = new JLabel(icon);
        tab.add(table,Integer.valueOf(1));
        table.setBounds(0,0,1440,900);

//        ImageIcon ico = new ImageIcon("wheel.png");
//        ico.setImage(ico.getImage().getScaledInstance(400 ,400,Image.SCALE_DEFAULT));
//        JLabel wheel = new JLabel(ico);
//        whe.add(wheel,Integer.valueOf(2));
//        wheel.setBounds(97,330,400,400);

        JPanel wheelsss =  new JPanel();






        wheelsss.add(whe);
        wheelsss.add(tab);

        wheelsss.setVisible(true);


        myFrame.add(wheelsss);



        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(2500, 1600);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        System.out.println("I am on REplit)");










    }
}