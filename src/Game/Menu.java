package Game;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Random;

public class Menu extends State {
    public Menu(Content content) {
        super(content);
    }

    public static int spaceshipx = 535;
    public static int spaceshipy = 680;
    public static int spaceshipx1 = 750;
    public static int spaceshipy1= 1000;
    public static int spaceshipx2 = 310;
    public static int spaceshipy2 = 1000;
    public static boolean PressedPlayButton = false;
    public static boolean PressedControl = false;




    public Rectangle playButton = new Rectangle(430, 240, 300, 100);
    public Rectangle controls = new Rectangle(430, 400, 300, 100);
    public Rectangle story = new Rectangle(430, 560, 300, 100);

    public void tick() {
        spaceshipy -= 2;
        spaceshipy1 -= 2;
        spaceshipy2 -= 2;
        if (PressedPlayButton) {
            setState(Content.gamePlay);
        }
        if (PressedControl){
            setState(Content.instructions);
        }



    }


    public void render(Graphics2D g) {
        g.setColor(Color.black);
        g.fillRect(0,0, content.width, content.height);

   

        //spaceship1
        Image spaceship = new ImageIcon("src/Images/StrongShip.png").getImage();
        g.drawImage(spaceship, spaceshipx, spaceshipy, 100, 200, null);
        Image spaceship1 = new ImageIcon("src/Images/enemyship.png").getImage();
        g.drawImage(spaceship1, spaceshipx1, spaceshipy1, 100, 200, null);
        Image spaceship2 = new ImageIcon("src/Images/enemyship.png").getImage();
        g.drawImage(spaceship2, spaceshipx2, spaceshipy2, 100, 200, null);
        //stars
        Random rs = new Random();
        for (int i = 0; i < 100; i++) {
            g.setColor(Color.white);
            g.drawOval(rs.nextInt(1200), rs.nextInt(900), rs.nextInt(3), rs.nextInt(3));
        }

        //logo
        Image logo = new ImageIcon("src/Images/logo2.png").getImage();
        g.drawImage(logo, 355, 30, 500, 100, null);
        //play Button
        Font play = new Font("Dialog", Font.PLAIN, 45);
        g.setColor(Color.black);
        g.fillRect(430,240,300,100);
        g.setFont(play);
        g.setColor(Color.white);
        g.drawString("PLAY", 518, 305);
        g.setColor(Color.BLUE);

        g.setStroke(new BasicStroke(3));
        g.draw(playButton);


        //top10 Button
        Font controlF = new Font("Dialog", Font.PLAIN, 40);
        g.setColor(Color.black);
        g.fillRect(430,400,300,100);
        g.setFont(controlF);
        g.setColor(Color.white);
        g.drawString("CONTROLS", 470, 465);

        g.setColor(Color.BLUE);
        g.draw(controls);


        //Story Button
        Font storyF = new Font("Dialog", Font.PLAIN, 45);
        g.setColor(Color.black);
        g.fillRect(430,560,300,100);
        g.setFont(storyF);
        g.setColor(Color.white);
        g.drawString("STORY", 500, 625);

        g.setColor(Color.BLUE);
        g.draw(story);
        //spaceship



    }
}
