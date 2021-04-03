package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Player extends State {
public static boolean pickedPlayer=false;
public static boolean player1=false;
public static boolean player2=false;

    public Player(Content content) {
        super(content);
    }


    @Override
    public void tick() {
            if (pickedPlayer) {
                    setState(Content.menu);
            }
    }


    @Override
    public void render(Graphics2D g) {




            g.setColor(Color.black);
            g.fillRect(0, 0, content.width, content.height);
            g.setColor(Color.cyan);

            g.setStroke(new BasicStroke(7f));
            g.setColor(Color.black);
            g.drawRect(0, 0, content.width, content.height);
            g.fillRect(100,300,400,300);
            g.fillRect(700,300,400,300);


            Image pickPlayer = new ImageIcon("src/Images/pickship.png").getImage();

            g.drawImage(pickPlayer, 350, 30, 500, 80, null);

            Image ship1 = new ImageIcon("src/Images/spaceship21.png").getImage();
            g.drawImage(ship1,150,305,300,280,null);

            Image ship2 = new ImageIcon("src/Images/spaceship.png").getImage();
            g.drawImage(ship2,750,305,300,280,null);

            Font playerCard = new Font("Ariel", Font.BOLD,23);
            g.setColor(Color.WHITE);
            g.setFont(playerCard);
            g.setStroke(new BasicStroke(4f));

            g.drawString("Defence:",100,650);
            g.drawRect(240,640,250,10);
            g.setColor(Color.GREEN);
            g.fillRect(240,640,250,10);

            g.setColor(Color.WHITE);
            g.drawString("Speed: ",100,700);
            g.setColor(Color.blue);
            g.fillRect(240,690,200,10);
            g.setColor(Color.white);
            g.drawRect(240,690,250,10);


            g.setColor(Color.WHITE);
            g.drawString("Weapons: ",100,750);
            g.setColor(Color.magenta);
            g.fillRect(240,740,180,10);
            g.setColor(Color.WHITE);
            g.drawRect(240,740,250,10);

            g.setColor(Color.WHITE);


            g.drawString("Weapons: ",700,750);
            g.drawRect(840,740,250,10);

            g.drawString("Defence:",700,650);
            g.drawRect(840,640,250,10);
            g.setColor(Color.GREEN);
            g.fillRect(840,640,190,10);

            g.setColor(Color.WHITE);
            g.drawString("Speed: ",700,700);
            g.setColor(Color.blue);
            g.fillRect(840,690,190,10);
            g.setColor(Color.white);
            g.drawRect(840,690,250,10);


            g.setColor(Color.WHITE);
            g.drawString("Weapons: ",700,750);
            g.setColor(Color.magenta);
            g.fillRect(840,740,250,10);
            g.setColor(Color.WHITE);
            g.drawRect(840,740,250,10);



    }
}






















