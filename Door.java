import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    
    public void act()
    {
        if (isTouching(Orion.class) && getWorld().getObjects(Key.class).isEmpty())
        {
            Greenfoot.setWorld(new Level2());
        }
        else if (isTouching(Orion.class) && getWorld().getObjects(Key2.class).isEmpty())
        {
            Greenfoot.setWorld(new Level3());
        }   
    }
}
