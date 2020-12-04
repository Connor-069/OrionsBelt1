import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public void designLevel()
    {
        

        map = new String [] {
           
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "                                                     ",
            "            h         bbbbbbbbbbb              B     ",
            "                                                     ",
            "                                              bbbbbbb",
            "              d                    bbbbb             ",
            "           bbbbbbb                                   ",
            "                                                 k   ",
            "      h                                    bbbbbbbbbb",
            "                                                     ",
            "                                    bbbbb            ",
            "                                                     ",
            "   b                         bbbbb                   ",
            "   b     bbbb                                        ",
            "   bbb            bbbbbbb                            ",
            "     b                                        h      ",
            "     b                                               ",
            "     bbbbbbbbb                                       ",
            "                                                     ",
            "                bbbbbbbbbbb    bbbbb                 ",
            "                                                     ",
            "                                                     ",
            "                                       bbbbb         ",
            "                       O                           B ",
            "                                                     ",
            "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"                                                 
        };
    }
    public void transitionToNextLevel()
        {
            Greenfoot.setWorld(new Level2());
        }
}