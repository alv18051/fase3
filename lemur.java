// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class lemur extends Actor
{
    private int punt = 0;

    /**
     * Act - do whatever the lemur wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
            
        }
        else {
            if (Greenfoot.isKeyDown("right")) {
                turn(5);
                
            }
        }
        eat();
    }

    /**
     * 
     */
    public void eat()
    {
        if (isTouching(bug.class)) {
            removeTouching(bug.class);
            punt = punt + 1;
            getWorld().showText("Puntuacion: " + punt, 80, 35);
        }
        if (punt == 18) {
            getWorld().showText("Has ganado!!!", 300, 200);
            Greenfoot.stop();
        }
    }
}
