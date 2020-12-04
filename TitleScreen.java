import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("OP.wav");

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        super(1700, 900, 1);
        backgroundMusic.playLoop();
        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton,907,562);

    }

    private boolean toLevel1()
    {
        var World world = getWorld(tutorialLevel);
        if (world.getObjects(StartButton.class).isEmpty())
        {
            backgroundMusic.stop();
            return true;
        }
        else
        {
            return false;
        }
    }
}

