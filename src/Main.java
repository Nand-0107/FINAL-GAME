import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {



        JLayeredPane tab = new JLayeredPane();
        tab.setSize(1440,900);



        ImageIcon icon = new ImageIcon("tabless.png");
        icon.setImage(icon.getImage().getScaledInstance(1440,900,Image.SCALE_DEFAULT));
        JLabel table = new JLabel(icon);
        tab.add(table,Integer.valueOf(0));
        table.setBounds(0,0,1440,900);




        JFrame myFrame = new JFrame();

        myFrame.add(tab);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(2500, 1600);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        System.out.println("I am on REplit)");










    }
}