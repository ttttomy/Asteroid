import greenfoot.*;

public class AsteroideMediano extends Asteroide {
    public AsteroideMediano() {
        super(/*hp*/2, /*minSpeed*/2, /*maxSpeed*/3);
        // setImage(new GreenfootImage("asteroid_medium.png"));
        // getImage().scale(45, 45);
    }

    @Override
    protected void spawnChildren() {
        World w = getWorld();
        if (w == null) return;
        for (int i = 0; i < 2; i++) {
            AsteroideChico c = new AsteroideChico();
            w.addObject(c, getX(), getY());
            c.vx += Greenfoot.getRandomNumber(3) - 1;
            c.vy += Greenfoot.getRandomNumber(3) - 1;
        }
    }
}
