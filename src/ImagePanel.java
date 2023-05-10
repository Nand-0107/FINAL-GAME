import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class ImagePanel extends JPanel {
    private BufferedImage image;
    private BufferedImage wheel;
    private int width;
    private int height;
    private Graphics2D wheelss;
    private final int x = 44;
    private final int y = 120;

    private int angle = 0;

    public ImagePanel(BufferedImage im,BufferedImage whe) {
       image = im;
       wheel = whe;
        Dimension size = new Dimension(image.getWidth(), image.getHeight());
        width = whe.getWidth();
        height = whe.getHeight();
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);



        JButton butt = new JButton("SPINY SPIN");

        butt.setBounds(10, 10, 100, 30);
        butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rotateWheel();   }
        });
        add(butt);
    }

    public void rotateWheel(){
        angle = (int)((Math.random()*2161)+360);


        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);

        wheelss = (Graphics2D) g.create();
        wheelss.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);





//        int x = (getWidth() - wheel.getWidth()) / 2;
//        int y = (getHeight() - wheel.getHeight()-2) / 2;
        //wheelss.translate(wheel.getWidth()/2, wheel.getHeight()/2);
        wheelss.rotate(Math.toRadians(angle), wheel.getWidth()/2, wheel.getHeight()/2);
        wheelss.drawImage(wheel, x,y ,200,200, this);
        //wheelss.translate(x - wheel.getWidth()/2, y - wheel.getHeight()/2);
        wheelss.dispose();



    }





}
