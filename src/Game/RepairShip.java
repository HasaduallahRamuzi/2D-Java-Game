package Game;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class RepairShip extends State {

    public static boolean Operation1 = false;
    public static boolean Operation2 = false;
    public static boolean Operation3 = false;
    public static boolean Operation4 = false;
    public static boolean AllComplete = false;
    public static boolean KeysComplete = false;


    public RepairShip(Content content) {
        super(content);
    }

    @Override
    public void tick() {
        GamePlay.score1 -= 0.4;

    }

    @Override
    public void render(Graphics2D g) {
        Image console = new ImageIcon("src/Images/Console.jpg").getImage();
        g.drawImage(console, 0, 0, Game.width, Game.height, null);
        g.fillRect(340, 40, 500, 330);
        Font consolescreen = new Font("Ariel", Font.BOLD, 12);
        g.setFont(consolescreen);
        g.setColor(new Color(0, 184, 49));
        g.drawString("You have broken down. Press the following buttons to repair ship:", 370, 60);
        g.drawString("Fuel Reserve - Balonium", 370, 90);
        g.drawString("Anti Reality - FX", 370, 120);
        g.drawString("Waveform Collider - Less Rock", 370, 150);
        g.drawString("PhotoSynth - Enhance", 370, 180);


        if (AllComplete) {
            g.drawString("To reach hyperspace press the following buttons on keyboard", 370, 210);
            g.drawString("Q W E R T Y R I P L Y X", 370, 240);
        }
        if (KeysComplete) {
            g.drawString("Press Enter to go into Hyper Space", 370, 260);
        }


        //background

        g.setColor(Color.cyan);
        g.setStroke(new BasicStroke(4f));
        g.drawRoundRect(300, -160, 601, 200, 100, 100);
        g.setColor(new Color(50, 78, 168));
        g.fillRoundRect(300, -160, 600, 200, 100, 100);


        //score card, lives, fps
        Font score = new Font("Ariel", Font.BOLD, 30);
        g.setFont(score);
        g.setColor(Color.yellow);
        String scoreString = Integer.toString((int) GamePlay.score1);
        g.drawString(scoreString, 580, 30);
        g.drawString(String.valueOf("Lives " + GamePlay.lives), 20, 30);


    }
}


