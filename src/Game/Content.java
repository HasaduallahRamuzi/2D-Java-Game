package Game;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.IOException;


public class Content implements Runnable {


    public static boolean AmmoEmpty = false;
    private Game game;
    private Thread thread;
    public String title;
    public int width, height;
    private boolean gameRun = false;
    private BufferStrategy buffy;
    private Graphics2D g;
    private int fps = 60;
    private double timePerTick = 1000000000 / fps;
    private double delta = 0;
    private long now;
    private long lastTime = System.nanoTime();
    public static long timer = 0;
    public static int ticks = 0;

    public static int ammoAmount = 50;
    public static boolean AmmoFull = true;
    public static boolean playGame = false;

    //states
    public static State gamePlay;
    public static State menu;
    public static State instructions;
    public static State player;
    public static State repairShip;
    public static State finishScreen;

    //inputs
    public static keyinput keyinput;
    public static Mouse mouse;

    //laser
    public static Ammo ammo;

    private void init(){
        game = new Game(title, width, height);
        gamePlay = new GamePlay(this);
        ammo = new Ammo(this);
        menu = new Menu(this);
        instructions = new Instructions(this);
        player = new Player(this);
        repairShip = new RepairShip(this);
        finishScreen = new FinsihScreen(this);
        game.getF().addKeyListener(keyinput);
        game.getF().addMouseListener(mouse);
        game.getC().addKeyListener(keyinput);
        game.getC().addMouseListener(mouse);

               //change states
        State.setState(player);



    }


    public Content(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        keyinput = new keyinput();
        mouse = new Mouse();


    }


    public void run() {
    init();


        while (gameRun) {

            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;
            if (delta >= 1) {
                tick();
                try {
                    render();
                } catch (UnsupportedAudioFileException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
                ticks++;
                delta--;
            }
        }
        stop();
    }

    private void render() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        buffy = game.getC().getBufferStrategy();
        if (buffy == null) {
            game.getC().createBufferStrategy(3);

            return;
        }


        g = (Graphics2D) buffy.getDrawGraphics();
        g.clearRect(0, 0, width, height);

        if (State.getState() != null)
            State.getState().render(g);
        ammo.render(g);


        buffy.show();
        g.dispose();


    }


    private void tick() {
        if (State.getState() != null)
            State.getState().tick();
        ammo.tick();


    }

    public synchronized void start() {
        if (gameRun) {
            return;
        }
        gameRun = true;
        thread = new Thread(this);
        thread.start();


    }

    public synchronized void stop() {
        if (gameRun = false) {
            return;
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

