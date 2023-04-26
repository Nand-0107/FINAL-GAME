import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {



        JLayeredPane tab = new JLayeredPane();
        tab.setSize(1440,900);

        JLayeredPane whe = new JLayeredPane();
        whe.setSize(200,200);



        ImageIcon icon = new ImageIcon("tabless.png");
        icon.setImage(icon.getImage().getScaledInstance(1440,900,Image.SCALE_DEFAULT));
        JLabel table = new JLabel(icon);
        tab.add(table,Integer.valueOf(1));
        table.setBounds(0,0,1440,900);

        ImageIcon ico = new ImageIcon("wheel.png");
        ico.setImage(ico.getImage().getScaledInstance(200 ,200,Image.SCALE_DEFAULT));
        JLabel wheel = new JLabel(ico);
        whe.add(wheel,Integer.valueOf(0));
        wheel.setBounds(0,0,200,200);




        JFrame myFrame = new JFrame();


        myFrame.add(tab);
        myFrame.add(whe);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(2500, 1600);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        System.out.println("I am on REplit)");










    }
}