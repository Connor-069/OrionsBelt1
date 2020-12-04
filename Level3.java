import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
    public void designLevel()
    {

        map = new String [] {
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                         O                           ",
            "                                                     ",
            "                 bbbbbbbbbbbbbbbbbbb                 ",
            "                                                     ",
            "      bbbbbbb                           bbbbbb       ",
            "                         s                           ",
            "                                                     ",
            "                                                     ",
            "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"
        };
    }

    public void transitionToNextLevel()
    {

    }

    public Level3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Brazier brazier = new Brazier();
        addObject(brazier,1646,780);
        Brazier brazier2 = new Brazier();
        addObject(brazier2,46,787);
        
    }
}
