// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class croc extends Actor
{

    /**
     * Act - do whatever the croc wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootSound bgm =  new  GreenfootSound("bgm.mp3");
        move(4);
        bgm.playLoop();
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(90) - 45);
            
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5) {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getWidth() - 5) {
            turn(180);
        }
        eatLemur();
    }

    /**
     * 
     */
    public void eatLemur()
    {
        if (isTouching(lemur.class)) {
            removeTouching(lemur.class);
            getWorld().showText("Game Over", 300, 200);
            Greenfoot.stop();
        }
    }
}
