package my.project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;
    private Player player;

    public KeyInput(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i = 0; i < handler.objects.size(); i++) {
            GameObject tempObject = handler.objects.get(i);
            if (tempObject.getID() == ID.Player) {
                // key events for player
                if (key == KeyEvent.VK_W) {
                    tempObject.setVelocityY(-5);
                    //player.setToWalkingUp();
                }
                if (key == KeyEvent.VK_A) {
                    tempObject.setVelocityX(-5);
                    //player.setToWalkingLeft();
                }
                if (key == KeyEvent.VK_S) {
                    tempObject.setVelocityY(5);
                    //player.setToWalkingDown();
                }
                if (key == KeyEvent.VK_D) {
                    tempObject.setVelocityX(5);
                    //player.setToWalkingRight();
                }
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i = 0; i < handler.objects.size(); i++) {
            GameObject tempObject = handler.objects.get(i);
            if (tempObject.getID() == ID.Player) {
                // key events for player
                if (key == KeyEvent.VK_W) {
                    tempObject.setVelocityY(0);
                    //player.setToStandingUp();
                }
                if (key == KeyEvent.VK_A) {
                    tempObject.setVelocityX(0);
                    //player.setToStandingLeft();
                }
                if (key == KeyEvent.VK_S) {
                    tempObject.setVelocityY(0);
                    //player.setToStandingDown();
                }
                if (key == KeyEvent.VK_D) {
                    tempObject.setVelocityX(0);
                    //player.setToStandingRight();
                }
            }
        }
    }
}
