import greenfoot.*;

public class Bala extends Actor {
    private int speed = 7;

    public Bala(int rotation) {
        setRotation(rotation);
    }
    public void act() {
        move(speed);
        verificarImpacto();

        if (isAtEdge()) {
            World w = getWorld();
            if (w != null) w.removeObject(this);
        }
    }
    private void verificarImpacto() {
        Asteroide a = (Asteroide) getOneIntersectingObject(Asteroide.class);
        if (a != null) {
            a.onHit();
            getWorld().removeObject(this);
        }
    }
}
