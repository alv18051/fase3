// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        preparar();
        generar();
    }

    /**
     * 
     */
    public void generar()
    {
    }

    /**
     * 
     */
    public void preparar()
    {
        lemur l =  new  lemur();
        addObject(l, 50, 350);
        
        croc c =  new  croc();
        addObject(c, 500, 35);
        bug b =  new  bug();
        int x = Greenfoot.getRandomNumber(getWidth() - 1);
        int y = Greenfoot.getRandomNumber(getHeight() - 1);
        addObject(b, x, y);
    }
}
