import greenfoot.*;

public class AsteroideGrande extends Asteroide {
    public AsteroideGrande() {
        super(/*hp*/3, /*minSpeed*/1, /*maxSpeed*/2);
        // Si no asignaste imagen desde el editor, descomenta y usa tu archivo:
        // setImage(new GreenfootImage("asteroid_big.png"));
        // getImage().scale(70, 70);
    }

    @Override
    protected void spawnChildren() {
        World w = getWorld();
        if (w == null) return;
        for (int i = 0; i < 2; i++) {
            AsteroideMediano m = new AsteroideMediano();
            w.addObject(m, getX(), getY());
            // un pequeño impulso para separarlos
            m.vx += Greenfoot.getRandomNumber(3) - 1; // -1..+1
            m.vy += Greenfoot.getRandomNumber(3) - 1;
        }
    }
}
