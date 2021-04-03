package Game;

import java.util.LinkedList;

public class Collision {                                                                                        //loops through linked list story lasers and if it intercepts hitbox
    public static boolean Collisiona(LinkedList<Laser>ls){                                                      //An action is intialised
        for (int i =0; i<ls.size();i++){
            if (Hitbox.hitBoxLaser(40,60).intersects(Hitbox.hitBoxEnemy(180,180))){
                Ammo.queenHealth-=10;
                Content.ammo.removeLaser(ls.getLast());
                return true;
            }
        }
        return false;
    }

    public static boolean Collisionb(LinkedList<Laser>ls){
        for (int i =0; i<ls.size();i++){
            if (Hitbox.hitBoxLaser(40,60).intersects(Hitbox.rock1(50,50))){
                GamePlay.rocky=-1000;

                return true;
            }
        }
        return false;
    }

    public static boolean Collisionc(LinkedList<Laser>ls){
        for (int i =0; i<ls.size();i++){
            if (Hitbox.hitBoxLaser(40,60).intersects(Hitbox.rock2(50,50))){
                GamePlay.rocky1=-1000;

                return true;
            }
        }
        return false;
    }
}
