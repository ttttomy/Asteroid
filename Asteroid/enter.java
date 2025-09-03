import greenfoot.*;  

public class enter extends Title {
    private int counter = 0;       // contador de frames
    private int blinkRate = 25;    // cada cuántos frames cambia 
    private boolean visible = true;
    private GreenfootImage original; 

    public enter() {
        // Escalar imagen
        original = getImage();
        original.scale(original.getWidth() / 2, original.getHeight() / 2);
        setImage(original);
    }
    public void act() {
        Play();
        Parpadeo();
    }
    // Cambiar de mundo al presionar Enter
    public void Play() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new GameWorld());
        }
    }
    //Parpadeo
    private void Parpadeo() {
        counter++;
        if (counter >= blinkRate) {
            counter = 0;
            if (visible) {
                setImage((GreenfootImage) null); 
            } else {
                setImage(original); 
            }
            visible = !visible;
        }
    }
}
