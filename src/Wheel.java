import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class Wheel{


    ImageIcon ico = new ImageIcon("wheel.png");


    public void paint(Graphics g){
        ico.setImage(ico.getImage().getScaledInstance(45,45,Image.SCALE_DEFAULT));
        // The required drawing location
        int drawLocationX = 300;
        int drawLocationY = 300;

// Rotation information

        double rotationRequired = Math.toRadians (45);
        double locationX = 45/ 2;
        double locationY = 45 / 2;
        AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);

// Drawing the rotated image at the required drawing locations
        g.drawImage(op.filter((BufferedImage) ico.getImage(), null), drawLocationX, drawLocationY, null);
    }


}
