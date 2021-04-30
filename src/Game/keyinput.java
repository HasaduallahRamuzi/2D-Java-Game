package Game;

import javax.sound.sampled.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public  class keyinput implements KeyListener {

    public keyinput() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (State.getState()==Content.repairShip){

            if (RepairShip.AllComplete) {


                if (e.getKeyCode() == KeyEvent.VK_Q) {
                    Music("src/audio/sounds/click.wav");


                    GamePlay.score1 += 100;
                }
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    Music("src/audio/sounds/click.wav");


                    GamePlay.score1 += 100;
                }
                if (e.getKeyCode() == KeyEvent.VK_E) {
                    Music("src/audio/sounds/click.wav");
                    GamePlay.score1 += 100;
                }
                if (e.getKeyCode() == KeyEvent.VK_R) {
                    Music("src/audio/sounds/click.wav");
                }
                if (e.getKeyCode() == KeyEvent.VK_T) {
                    Music("src/audio/sounds/click.wav");

                    GamePlay.score1 += 100;
                }
                if (e.getKeyCode() == KeyEvent.VK_Y) {
                    Music("src/audio/sounds/click.wav");
                    GamePlay.score1 += 100;
                }
                if (e.getKeyCode() == KeyEvent.VK_I) {
                    Music("src/audio/sounds/click.wav");
                    GamePlay.score1 += 100;
                }
                if (e.getKeyCode() == KeyEvent.VK_P) {
                    Music("src/audio/sounds/click.wav");

                    GamePlay.score1 += 100;
                }
                if (e.getKeyCode() == KeyEvent.VK_L) {
                    Music("src/audio/sounds/click.wav");

                    GamePlay.score1 += 100;
                }

                if (e.getKeyCode() == KeyEvent.VK_X) {
                    Music("src/audio/sounds/click.wav");


                    GamePlay.score1 += 100;
                    RepairShip.KeysComplete = true;
                }

                if (RepairShip.KeysComplete)
                    if (e.getKeyCode()==KeyEvent.VK_ENTER){
                        Mouse.playMusic=false;
                        State.setState(Content.finishScreen);
                        Music("src/audio/sounds/pulse.wav");//.wav file path is put into file variable called file

                    }

            }

        }
        if (e.getKeyCode()==KeyEvent.VK_A){
            moveLeft();
        }if (e.getKeyCode()==KeyEvent.VK_S){
            moveDown();
        }if (e.getKeyCode()==KeyEvent.VK_D){
            moveRight();
        }if (e.getKeyCode()==KeyEvent.VK_SPACE){

            Shoot();


        }


    }

    private void Shoot() {
        if (Content.playGame)
            if (Content.AmmoFull) {
                Content.ammo.addLaser(new Laser(GamePlay.spaceshipx + 32, GamePlay.spaceshipy - 20));
                Content.ammoAmount--;
                Music("src/audio/sounds/laser.wav");
            }

    }


    //movement for player
    private void moveLeft() {
        GamePlay.spaceshipx-=10;
    }

    private void moveDown() {
        GamePlay.spaceshipy+=20;
    }

    private void moveRight() {
        GamePlay.spaceshipx+=10;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    //code for muisc import
    public void Music(String filepath){
        File file = new File(filepath);
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
