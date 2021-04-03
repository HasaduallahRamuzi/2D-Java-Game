package Game;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;


public class GamePlay extends State {
    public static double spaceshipx = 555;
    public static double spaceshipy = 700;
    public static double score1 = 0;
    public static int lives = 3;
    public static boolean dead = false;
    public static int ammox = 300;
    public static int ammoy = -700;
    public static int lifex = 800;
    public static int lifey = -1000;
    public static int doublepointsx = 100;
    public static int doublepointsy = -1000;
    public static int rockx = 100;
    public static int rocky = -1000;
    public static int rockx1 = 600;
    public static int rocky1 = -1000;



    private Random r;

    public GamePlay(Content content) {

        super(content);
        this.content = content;


    }

    public void tick() {
        spaceshipy -= 0.1;
        score1 += 0.04;

        ammoy += 3;
        lifey += 3;
        doublepointsy += 3;

        if (ammoy >= 900) {
            ammoy = -2000;
        }
        if (doublepointsy >= 900) {
            doublepointsy = -2000;
        }
        if (lifey >= 900) {
            lifey = -2000;
        }

        if (Hitbox.ammoHitbox(20, 20).intersects(Hitbox.player(100, 80))) {
            Content.ammoAmount += 30;
            ammoy -= 3000;
            ammox += 300;
            Content.AmmoFull = true;
            Content.ammoAmount = +50;
        }

        if (Hitbox.livesHitBox(100, 100).intersects(Hitbox.player(100, 80))) {
            lives++;
            lifey -= 3000;
            lifex -= 300;
        }

        if (Hitbox.doublepointsHitBox(50, 50).intersects(Hitbox.player(100, 80))) {
            score1 += score1;
            doublepointsy -= 3000;
            doublepointsx += 300;
        }
        if (Content.ammo.queenHealth <= 0) {
            rocky += 5;
            rockx += 1;
            rockx1 += 1;
            rocky1 += 6;

            if (rocky >= 900) {
                rocky = -100;
                rockx += 100;
            }
            if (rocky1 >= 900) {
                rocky1 = -100;
                rockx1 += 100;
            }
        }
        if (rockx <= 0) {
            rockx = 300;
        }
        if (rockx1 <= 0) {
            rockx1 = 300;
        }

        if (rockx >= 1200) {
            rockx = 300;
        }
        if (rockx1 >= 1200) {
            rockx1 = 300;
        }

    }




    public void render(Graphics2D g) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        g.setColor(Color.black);
        g.fillRect(0, 0, 1200, 900);
        //SpaceShip
        if (Player.player2) {
            Image spaceship = new ImageIcon("src/Images/spaceship.png").getImage();
            g.drawImage(spaceship, (int)spaceshipx, (int)spaceshipy, 100, 80, null);
        } else if (Player.player1) {
            Image spaceship2 = new ImageIcon("src/Images/spaceship21.png").getImage();
            g.drawImage(spaceship2, (int)spaceshipx, (int)spaceshipy, 100, 80, null);
        }
        //score font
        g.setColor(Color.cyan);
        g.setStroke(new BasicStroke(4f));
        g.drawRoundRect(300, -160, 601, 200, 100, 100);
        g.setColor(new Color(50, 78, 168));
        g.fillRoundRect(300, -160, 600, 200, 100, 100);
        //score card, lives, fps
        Font score = new Font("Ariel", Font.BOLD, 30);
        g.setFont(score);
        g.setColor(Color.yellow);
        String scoreString = Integer.toString((int) score1);
        g.drawString(scoreString, 580, 30);
        g.drawString(String.valueOf("Lives " + lives), 20, 30);


        if (Content.AmmoFull) {
            String AmmoString = Integer.toString(Content.ammoAmount);
            g.drawString(AmmoString, 1150, 30);
            if (Content.ammoAmount <= 0) {
                Content.AmmoFull = false;
            }
        }
        if (dead==false) {
            g.setColor(Color.red);
            String queenHealthString = Integer.toString(Ammo.queenHealth);
            g.drawString(queenHealthString, (int) Enemy.x + 65, (int) Enemy.y);
        }
        Image Ammo = new ImageIcon("src/Images/ammo.png").getImage();
        g.drawImage(Ammo, ammox, ammoy, 20, 20, null);


        Image life = new ImageIcon("src/Images/forcefield.png").getImage();
        g.drawImage(life, lifex, lifey, 100, 100, null);


        Image doublepoints = new ImageIcon("src/Images/pillcase.png").getImage();
        g.drawImage(doublepoints, doublepointsx, doublepointsy, 50, 50, null);
        if (Content.ammo.queenHealth<=0){
            Image rocks = new ImageIcon("src/Images/planet.png").getImage();
            Image rocks2 = new ImageIcon("src/Images/planet.png").getImage();
            g.drawImage(rocks,rockx,rocky, 50, 50, null);
            g.drawImage(rocks2,rockx1,rocky1, 50, 50, null);

        }
        if (score1>1000){
            setState(Content.repairShip);

        }

    }

}






