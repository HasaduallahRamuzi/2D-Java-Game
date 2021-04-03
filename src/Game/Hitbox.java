package Game;

import java.awt.*;

public class Hitbox {//draws a rectangle around the images, takes width and height as an arguments and uses x and y variables stored in the parent java file

   public static Rectangle hitBoxLaser(int width, int height){
       return new Rectangle((int)Laser.x,(int)Laser.y, width, height);
   }

    public static Rectangle hitBoxEnemy(int width, int height){
        return new Rectangle((int)Enemy.x,(int)Enemy.y, width, height);

    }

    public static Rectangle ammoHitbox(int width, int height){
        return new Rectangle(GamePlay.ammox, GamePlay.ammoy, width, height);
    }

    public static Rectangle player(int width, int height){
        return new Rectangle((int)GamePlay.spaceshipx, (int)GamePlay.spaceshipy, width, height);
    }

    public static Rectangle livesHitBox(int width, int height){
        return new Rectangle(GamePlay.lifex, GamePlay.lifey, width, height);
    }

    public static Rectangle doublepointsHitBox(int width, int height){
        return new Rectangle(GamePlay.doublepointsx, GamePlay.doublepointsy, width, height);
    }

    public static Rectangle rock1(int width, int height){
        return new Rectangle(GamePlay.rockx, GamePlay.rocky, width, height);
    }
    public static Rectangle rock2(int width, int height){
        return new Rectangle(GamePlay.rockx1, GamePlay.rocky1, width, height);
    }
    public static Rectangle spaceshp(int width, int height){
        return new Rectangle((int) GamePlay.spaceshipx, (int) GamePlay.spaceshipy, width, height);
    }
}
