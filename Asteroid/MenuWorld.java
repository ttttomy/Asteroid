import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MenuWorld extends World
{
    public MenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        prepare();
    }
    private void prepare()
    {
        Logo logo = new Logo();
        addObject(logo,450,300);
        logo.setLocation(450,300);
        enter enter = new enter();
        addObject(enter,450,260);
        enter.setLocation(450,350);
    }
}
