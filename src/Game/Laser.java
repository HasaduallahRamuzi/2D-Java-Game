package Game;



import javax.swing.*;
import java.awt.*;


public class Laser  {

    public static double x;
    public static double y;
    public Laser(double x, double y) {

        this.x = x;
        this.y = y;


    }

    public void tick() {
        y -=10;




    }




    public void render(Graphics2D g) {
        Image laserBlue = new ImageIcon("src/Images/laserbeam.png").getImage();
        g.drawImage(laserBlue, (int) x, (int) y, 40, 60, null, null);



    }
}

