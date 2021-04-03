package Game;


import javax.swing.*;
import java.awt.*;

public class Enemy{


    public static double x;
    public static double y;






    public Enemy(double x, double y) {

            this.x = x;
            this.y = y;
        }

        public void tick() {
            y += 0.1;
            if (y>900){
                y=-10;
            }


        }



    public void render(Graphics2D g) {
            Image ship = new ImageIcon("src/Images/enemyship.png").getImage();
            g.drawImage(ship, (int) x, (int) y, 180, 180, null, null);

        }
    }
