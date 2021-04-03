package Game;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.IOException;

public abstract class State {

    private static State currentState = null;


    public static void setState(State state){
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }

//////////////////////////////////////////////
    protected Content content;
    public State(Content content){
        this.content=content;
    }

    public abstract void tick();

    public abstract void render(Graphics2D g) throws LineUnavailableException, IOException, UnsupportedAudioFileException;
}
