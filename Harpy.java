import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harpy extends Actor
{
    public void act()
    {
        movement();
        attack();
    }
    
    public void movement()
    {
        move(3);
        if (getWorld().getObjects(Orion.class).isEmpty()) return; 
        Actor orion = (Actor)getWorld().getObjects(Orion.class).get(0); // gets reference to Orion
        turnTowards(orion.getX(), orion.getY()); // turn toward Orion
    }
    
    public void attack()
    {
        Actor Orion = getOneIntersectingObject(Orion.class);
        if (Orion != null)
        {
            World world = getWorld();
            world.removeObject(Orion);
            gameOver();
        }
    }
    
    public void gameOver()
    {
        World gameOver = new gameOver();
        Greenfoot.setWorld(gameOver);
    }
}