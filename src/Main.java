import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedImage image = ImageIO.read(new File("tabless.png"));

       ImagePanel panel = new ImagePanel(image);

        JFrame frame = new JFrame();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);


//        JLayeredPane tab = new JLayeredPane();
//        tab.setSize(1440,900);
//
//        JLayeredPane whe = new JLayeredPane();
//        whe.setSize(1440,900);
//
//        JFrame myFrame = new JFrame();
//
//        ImageIcon icon = new ImageIcon("tabless.png");
//        icon.setImage(icon.getImage().getScaledInstance(1440,900,Image.SCALE_DEFAULT));
//        JLabel table = new JLabel(icon);
//        tab.add(table,Integer.valueOf(1));
//        table.setBounds(0,0,1440,900);
//
//        ImageIcon ico = new ImageIcon("wheel.png");
//        ico.setImage(ico.getImage().getScaledInstance(400 ,400,Image.SCALE_DEFAULT));
//        JLabel wheel = new JLabel(ico);
//        whe.add(wheel,Integer.valueOf(2));
//        wheel.setBounds(97,330,400,400);
//
//
//
//
//
//
//
//
//        myFrame.add(whe);
//        myFrame.add(tab);
//
//
//        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        myFrame.setSize(2500, 1600);
//        myFrame.setLayout(null);
//        myFrame.setVisible(true);

        System.out.println("I am on REplit)");










    }
}