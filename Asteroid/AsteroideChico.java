import greenfoot.*;

public class AsteroideChico extends Asteroide {
    public AsteroideChico() {
        super(/*hp*/1, /*minSpeed*/3, /*maxSpeed*/4);
        // setImage(new GreenfootImage("asteroid_small.png"));
        // getImage().scale(30, 30);
    }

    @Override
    protected void spawnChildren() {
        // El chico no genera más
    }
}
