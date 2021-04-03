package Game;


import javax.swing.*;
import java.awt.*;


public class Game {


    private JFrame f;
    private Canvas c;
    private String title;
    public static int width, height;


    public Game(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;



        createWindow();
    }

    private void createWindow(){
        //f = JFrame
        f = new JFrame(title);
        f.setSize(width,height);
        f.setResizable(false);
        f.setVisible(true);
        f.setLocationRelativeTo(null);//sets window center of screen
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //c = Canvas
        c = new Canvas();
        c.setPreferredSize(new Dimension(width,height));
        c.setMaximumSize(new Dimension(width,height));
        c.setMinimumSize(new Dimension(width,height));
        c.setFocusable(false);



        f.add(c);
        f.pack();
        /*
        Makes sure the canvas stays the same size
        and doesn't spill outside the frame.
         */


    }

    public Canvas getC(){
        return c;
    }

    public JFrame getF(){
        return f;
    }
}