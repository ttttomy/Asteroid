import greenfoot.*;

public class GameWorld extends World {

    public GameWorld() {    
        // Mundo sin limites 
        super(900, 700, 1, false);
        prepare();
    }
    public void wrap(Actor a) {
        int x = a.getX();
        int y = a.getY();
        int w = getWidth();
        int h = getHeight();

        // si sale por izquierda, entra por derecha y viceversa
        if (x < 0)        x = w - 1;
        else if (x >= w)  x = 0;

        // si sale por arriba, entra por abajo y viceversa
        if (y < 0)        y = h - 1;
        else if (y >= h)  y = 0;

        a.setLocation(x, y);
    }
    private void prepare() {
        // Nave en el centro del mundo
        Nave nave = new Nave();
        addObject(nave, 450, 350);
    }
}
