package Game;



import java.awt.*;
import java.util.LinkedList;

public class Ammo {
    public static  LinkedList<Laser> ls = new LinkedList<>(); //Linked list is stores each laser that has been shot each time space bar is pressed, allows to remove if collision or if leaves bounds
    public static LinkedList<Enemy>en = new LinkedList<>();

    public static int queenHealth = 120;
    Laser laser;
    Enemy enemy;
    Content content;


    public Ammo(Content content) {
        this.content=content;
        Content.playGame = true;


    }


    public void tick(){
        for (int i = 0; i <ls.size() ; i++) {
            laser = ls.get(i);
            laser.tick();
        }
        for (int i = 0; i <en.size() ; i++) {
            enemy = en.get(i);
            enemy.tick();
        }


        if (Collision.Collisiona(Ammo.ls)==true){

            GamePlay.score1+=1;
            removeLaser(laser);



        }
        if (Collision.Collisionb(Ammo.ls) == true) {

            GamePlay.score1+=100;
            removeLaser(laser);
        }
        if (Collision.Collisionc(Ammo.ls) == true) {

            GamePlay.score1+=100;
            removeLaser(laser);
        }
        if (Hitbox.player(100,80).intersects(Hitbox.rock1(50,50))){
            GamePlay.lives--;
            GamePlay.rocky=-1000;

        }

        if (Hitbox.player(100,80).intersects(Hitbox.rock2(50,50))){
            GamePlay.lives--;
            GamePlay.rocky1=-1000;

        }

        if (queenHealth<=0){
            removeEnemy(enemy);
            GamePlay.dead=true;
        }
        if (Laser.y==-5){
            removeLaser(laser);
        }
    }

    public void render(Graphics2D g) {
        for (int i = 0; i < ls.size(); i++) {
            laser = ls.get(i);
            laser.render(g);

        }
        for (int i = 0; i < en.size(); i++) {
            enemy = en.get(i);
            enemy.render(g);
        }
    }


    public void addLaser(Laser img){
        ls.add(img);
    }
    public void removeLaser(Laser img){
        ls.remove(img);
    }
    public void addEnemy(Enemy img){
        en.add(img);
    }
    public void removeEnemy(Enemy img){
        en.remove(img);
    }



}

