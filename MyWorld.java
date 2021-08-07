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
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
        generar();
    }

    /**
     * 
     */
    public void generar()
    {
        bug b =  new  bug();
        addObject(b, Greenfoot.getRandomNumber(getWidth() - 1), Greenfoot.getRandomNumber(getHeight() - 1));
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
        
    }
}
