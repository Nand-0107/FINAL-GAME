import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(700, 500);




        ImageIcon stuff = new ImageIcon("2C.png");
        stuff.setImage(stuff.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));

        JLabel card = new JLabel(stuff);

        System.out.println("I am on REplit)");





        RoPanel yourPanel = new RoPanel();
        yourPanel.setSize(700, 500);

        yourPanel.add(card);

        // myFrame.add(myPanel);
        myFrame.add(yourPanel);
        myFrame.setVisible(true);

        // myFrame.add(myPanel);
        myFrame.add(yourPanel);
        myFrame.setVisible(true);

    }
}