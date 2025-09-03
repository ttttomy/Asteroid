import greenfoot.*;

public class Nave extends Player {
    private int disparoDelay = 0;
    private int disparoDelayMaximo = 30;
    private GreenfootImage imgNormal;
    private GreenfootImage imgFuego;

    public Nave() {
        int ancho = 40;   // ancho 
        int alto  = 40;   // alto 

        // Nave normal
        imgNormal = new GreenfootImage("space_invader.png");
        imgNormal.scale(ancho, alto);
        imgNormal.rotate(90);

        // Nave fuego
        imgFuego = new GreenfootImage("NaveFuego.png");
        imgFuego.scale(ancho, alto);
        imgFuego.rotate(90);

        // Imagen inicial
        setImage(imgNormal);
    }

    public void act() {
        super.movimiento();
        super.rotacion();
        actualizarImagen();
        disparo();

        GameWorld mundo = (GameWorld) getWorld();
        if (mundo != null) {
            mundo.wrap(this);
        }
    }

    private void actualizarImagen() {
        if (Greenfoot.isKeyDown("w")) {
            setImage(imgFuego);
        } else {
            setImage(imgNormal);
        }
    }

    private void disparo() {
        if (disparoDelay > 0) disparoDelay--;

        if (Greenfoot.isKeyDown("space") && disparoDelay == 0) {
            Bala bala = new Bala(getRotation());
            getWorld().addObject(bala, getX(), getY());
            disparoDelay = disparoDelayMaximo;
        }
    }
}
