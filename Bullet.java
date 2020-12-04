import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    public Bullet()
    {
        getImage().scale(5, 2);
        getImage().fill();
        
    }

    public void act()
    {
        move(5);
        harpyHit();
        boarHit();
    }
    public void boarHit()
    {
        Actor Boar = getOneIntersectingObject(Boar.class);
        
        if(Boar != null)
        {  
            getWorld().removeObject(Boar);
            getWorld().removeObject(this);
        }
    }
    public void harpyHit()
    {
        Actor Harpy = getOneIntersectingObject(Harpy.class);
        
        if(Harpy != null)
        {
            getWorld().removeObject(Harpy);
            getWorld().removeObject(this);
            Greenfoot.playSound("HarpyDeath.wav");
        }
    }
}
