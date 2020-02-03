package my.project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends GameObject {
    private BufferedImage[] run = { Sprite.getSprite(0, 0), Sprite.getSprite(1, 0),
            Sprite.getSprite(2, 0), Sprite.getSprite(3, 0), Sprite.getSprite(4, 0),
            Sprite.getSprite(5, 0), Sprite.getSprite(6, 0), Sprite.getSprite(7, 0),
            Sprite.getSprite(8, 0), Sprite.getSprite(9, 0) };
    private Animation running = new Animation(run, 3);
    private Animation animation = running;

    public Player(int x, int y, ID id) {
        super(x, y, id);
        velocityX = 0;
        velocityY = 0;
    }

    @Override
    public void tick() {
        animation.update();
        x += velocityX;
        if (x > Game.WIDTH)
            x = -400;
        y += velocityY;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(animation.getSprite(), x, y, null);
        // g.setColor(color);
        // g.fillRect(x, y, 32, 32);
    }
}
