package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FinsihScreen extends State {

    public FinsihScreen(Content content) {

        super(content);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 1200, 900);
        Random rs = new Random();
        for (int i = 0; i < 100; i++) {
            g.setColor(Color.white);
            g.drawOval(rs.nextInt(1200), rs.nextInt(900), rs.nextInt(3), rs.nextInt(3));
        }
        Image cockpit = new ImageIcon("src/Images/cockpit.png").getImage();
        g.drawImage(cockpit, 0, 0, 1200, 900, null);


        Image gameover = new ImageIcon("src/Images/gameover.png").getImage();
        g.drawImage(gameover, 300, 50, 600, 100, null);

        Image playAgain = new ImageIcon("src/Images/playagain.png").getImage();
        g.drawImage(playAgain, 200, 700, 320, 80, null);

        Image exit = new ImageIcon("src/Images/exit.png").getImage();
        g.drawImage(exit, 780, 700, 180, 80, null);

    }
}
