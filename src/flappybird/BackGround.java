/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class BackGround extends JPanel implements Runnable {

    public Bird b = new Bird();
    Throne th = new Throne();
    Thread t = new Thread(this);
    Die d = new Die();
    Point score = new Point();
    public static boolean die = false;

    public BackGround() {
        // Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());
        th.paint(g);
        g.setColor(Color.green);
        g.fillRect(0, 400, getWidth(), getHeight());
        g.setColor(Color.orange);
        g.fillRect(0, 410, getWidth(), getHeight());

        b.paint(g);
        // th.paint(g);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score.getScore(), 10, 30);
        if (die) {
            g.setColor(Color.black);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("GAME OVER!!!", getWidth() - 400, getHeight() - 250);
        }
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            th.giamX();
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {

            }
            th.loopX();
            b.birdFalls();
            //th.loopX();
            if (d.chet() == true) {
                die = true;
                repaint();
                t.stop();

            }
            score.upScore();
            System.out.println(score.getScore());

        }

    }
}
