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
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           assert clip != null;
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       //plays clip if boolean is true, if state is Menu
                       clip.start();


                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_W) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           assert clip != null;
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();


                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_E) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_R) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_T) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_Y) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_I) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_P) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           assert clip != null;
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                   }
                   if (e.getKeyCode() == KeyEvent.VK_L) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                   }

                   if (e.getKeyCode() == KeyEvent.VK_X) {
                       File file = new File("src/audio/sounds/click.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           assert clip != null;
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

                       GamePlay.score1 += 100;
                       RepairShip.KeysComplete = true;
                   }

                   if (RepairShip.KeysComplete)
                   if (e.getKeyCode()==KeyEvent.VK_ENTER){
                       Mouse.playMusic=false;
                       State.setState(Content.finishScreen);
                       File file = new File("src/audio/sounds/pulse.wav");//.wav file path is put into file variable called file
                       AudioInputStream audioStream = null;//gets Audioinput from the file
                       try {
                           audioStream = AudioSystem.getAudioInputStream(file);
                       } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                           unsupportedAudioFileException.printStackTrace();
                       }
                       Clip clip = null;
                       try {
                           clip = AudioSystem.getClip();
                       } catch (LineUnavailableException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       try {
                           assert clip != null;
                           clip.open(audioStream);//clip gets audioclip and opens it
                       } catch (LineUnavailableException | IOException lineUnavailableException) {
                           lineUnavailableException.printStackTrace();
                       }
                       boolean playMusic=true;
                       //plays clip if boolean is true, if state is Menu
                       clip.start();

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

                try {
                    Shoot();
                } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ioException) {
                    ioException.printStackTrace();
                }


            }
            
            
        }

        private void Shoot() throws IOException, LineUnavailableException, UnsupportedAudioFileException {
            if (Content.playGame)
            if (Content.AmmoFull){
            Content.ammo.addLaser(new Laser(GamePlay.spaceshipx+32, GamePlay.spaceshipy-20));
            Content.ammoAmount--;
                File file = new File("src/audio/sounds/laser.wav");//.wav file path is put into file variable called file
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);//gets Audioinput from the file
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);//clip gets audioclip and opens it
                boolean playmusic = true;
                if (playmusic){//plays clip if boolean is true, if state is Menu
                    clip.start();
                }
            }else {
                Content.AmmoEmpty=true;
            }


        }



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
    }
