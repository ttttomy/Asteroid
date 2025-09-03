import greenfoot.*;  

public class Player extends Actor {

    protected int speed = 3;   // velocidad de avance
    protected int rot = 4;     // velocidad de giro

    public void act() {
    }
    //Avanza (W) en la direccion de rotacion
    public void movimiento() {
        if (Greenfoot.isKeyDown("w")) {
            move(speed); 
        }
    }
    // Rotación (A y D)
    public void rotacion() {
        if (Greenfoot.isKeyDown("d")) {
            setRotation(getRotation() + rot);
        }
        if (Greenfoot.isKeyDown("a")) {
            setRotation(getRotation() - rot);
        }
    }
}
