package Game;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;

public class Instructions extends State{
    public Instructions(Content content) {
        super(content);
    }
    public static boolean pressedBack = false;

    @Override
    public void tick() {
        if (pressedBack) {
            setState(Content.menu);
        }
    }

    @Override
    public void render(Graphics2D g) {
    g.setColor(Color.black);
    g.fillRect(0,0, content.width, content.height);
    g.setColor(Color.cyan);
    g.setStroke(new BasicStroke(7f));
    g.drawRect(0,0, content.width, content.height);
    Image instructions = new ImageIcon("src/Images/instructions.png").getImage();
    g.drawImage(instructions, 350, 30, 500, 100, null);


    Font wasd = new Font("Ariel", Font.BOLD,50);
    g.setColor(Color.WHITE);
    g.setFont(wasd);
    g.setStroke(new BasicStroke(4f));

    g.drawString("W",320,200);
    g.drawString("S",325,300);
    g.drawString("A",220,301);
    g.drawString("D",425,301);
    g.drawString("SPACE",725,301);


    Font word = new Font("Ariel", Font.BOLD,35);
    g.setColor(Color.WHITE);
    g.setFont(word);
    g.setStroke(new BasicStroke(4f));
    g.drawString("UP",315,500);
    g.drawString("Down",290,570);
    g.drawString("Right",410,570);
    g.drawString("Left",195,570);
    g.drawString("SHOOT",750,570);

    Image Ammo = new ImageIcon("src/Images/ammo.png").getImage();
    g.drawImage(Ammo, 195, 700, 80, 80, null);
    g.drawString("AMMO",185,830);

    Image Ff = new ImageIcon("src/Images/forcefield.png").getImage();
    g.drawImage(Ff, 495, 700, 200, 150, null);
    g.drawString("SHIELD",530,830);

    Image pill = new ImageIcon("src/Images/pillcase.png").getImage();
    g.drawImage(pill, 915, 700, 80, 80, null);
    g.drawString("2xPoints",890,830);

    Image back = new ImageIcon("src/Images/back.png").getImage();
    g.drawImage(back, 20, 20, 80, 80, null);

    }




}
