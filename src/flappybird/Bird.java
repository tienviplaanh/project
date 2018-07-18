/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Bird extends JPanel {

    public static int x = 100;
    public static int y = 200;
    // private Throne th = new Throne();

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 45, 45);
    }

    public void birdFalls() {
        y++;

    }

    public void birdJumps() {
        y -= 30;

    }

}
