import java.awt.*;

public class Poly extends Polygon {

    public int x;
    public int y;
    public int size;


    public Poly(boolean square,int m,int x, int y){
        size = 150;

        if(!square){
            addPoint(200, 200);
            double angle = (360/34.0)*m;
            addPoint((int) (200-size*Math.sin(angle)), (int) (200-size*Math.cos(angle)));
            addPoint((int) (200+size*Math.sin(angle)), (int) (200-size*Math.cos(angle)));
            m+=1;

        }
        else{
            addPoint(x,y);
        }
    }

    public void drawTrig(Graphics g){
        g.fillPolygon(this);
    }


}

