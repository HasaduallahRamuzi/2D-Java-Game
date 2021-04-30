package Game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Mouse implements MouseListener {
    public static boolean playMusic=true;
    private keyinput keyinput;

    public Mouse() {
        keyinput = new keyinput();
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (State.getState() == Content.menu) {
            int xAxis = e.getX();
            int yAxis = e.getY();

            if (xAxis >= 430 && xAxis <= 725) {
                if (yAxis >= 240 && yAxis <= 340) {
                    Menu.PressedPlayButton = true;
                    Content.playGame = true;
                    Content.ammo.addEnemy(new Enemy(300, 100));

                }


                if (xAxis >= 430 && xAxis <= 725) {
                    if (yAxis >= 400 && yAxis <= 500) {
                        //<--code for Instructions
                        Menu.PressedControl = true;
                        Instructions.pressedBack = false;

                    }
                }
            }
            if (xAxis >= 430 && xAxis <= 725) {
                if (yAxis >= 560 && yAxis <= 660) {
                    //<--code for StoryButton


                }
            }
        }
        if (State.getState() == Content.player) {
            int xAxis = e.getX();
            int yAxis = e.getY();
            if (xAxis >= 100 && xAxis <= 500)
                if (yAxis >= 300 && yAxis <= 600) {
                    System.out.println("player1");
                    Player.pickedPlayer = true;
                    Player.player1 = true;
                }
            if (xAxis >= 700 && xAxis <= 1100)
                if (yAxis >= 300 && yAxis <= 600) {
                    System.out.println("player2");
                    Player.pickedPlayer = true;
                    Player.player2 = true;

                }
        }
        if (State.getState() == Content.instructions) {
            int xAxis = e.getX();
            int yAxis = e.getY();
            if (xAxis >= 20 && xAxis <= 100) {
                if (yAxis >= 20 && yAxis <= 100) {
                    Instructions.pressedBack = true;
                    Menu.PressedControl = false;
                }
            }
        }
        if (State.getState() == Content.repairShip) {

            int xAxis = e.getX();
            int yAxis = e.getY();
            if (xAxis >= 117 && xAxis <= 152) {
                if (yAxis >= 702 && yAxis <= 733) {
                    if (State.getState() == Content.repairShip) {
                        keyinput.Music("src/audio/sounds/robot.wav");
                    }
                    RepairShip.Operation1 = true;
                    GamePlay.score1 += 1000;
                }
            }
            if (xAxis >= 1000 && xAxis <= 1032) {
                if (yAxis >= 75 && yAxis <= 107) {
                    if (RepairShip.Operation1 = true)
                        RepairShip.Operation2 = true;
                    GamePlay.score1 += 1000;


                }
            }
            if (xAxis >= 937 && xAxis <= 971) {
                if (yAxis >= 475 && yAxis <= 567) {
                    RepairShip.Operation3 = true;
                    GamePlay.score1 += 1000;
                    keyinput.Music("src/audio/sounds/robot.wav");
                }
            }
            if (xAxis >= 1003 && xAxis <= 1030) {
                if (yAxis >= 322 && yAxis <= 343) {
                    RepairShip.Operation4 = true;
                    GamePlay.score1 += 1000;

                }
            }
            if (RepairShip.Operation1 && RepairShip.Operation2 && RepairShip.Operation3 && RepairShip.Operation4) {
                RepairShip.AllComplete = true;
            }
        }
        if (State.getState()==Content.finishScreen) {
            int xAxis = e.getX();
            int yAxis = e.getY();
            if (xAxis >= 200 && xAxis <= 520) {
                if (yAxis >= 700 && yAxis <= 780) {
                    State.setState(Content.player);


                }
            }
            if (xAxis>=760&&xAxis<=960){
                if (yAxis>=700&&yAxis<=780){
                    System.exit(0);
                }
            }
        }


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
